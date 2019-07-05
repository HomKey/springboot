package com.hk.snmp;

import com.hk.snmp.scalar.SysInteger;
import com.hk.snmp.scalar.SysString;
import com.hk.snmp.table.MoTableUtil;
import org.snmp4j.MessageDispatcher;
import org.snmp4j.MessageDispatcherImpl;
import org.snmp4j.TransportMapping;
import org.snmp4j.agent.*;
import org.snmp4j.agent.cfg.EngineBootsCounterFile;
import org.snmp4j.agent.io.DefaultMOPersistenceProvider;
import org.snmp4j.agent.io.MOInput;
import org.snmp4j.agent.io.MOInputFactory;
import org.snmp4j.agent.io.prop.PropertyMOInput;
import org.snmp4j.agent.mo.DefaultMOTable;
import org.snmp4j.agent.mo.util.VariableProvider;
import org.snmp4j.agent.request.Request;
import org.snmp4j.agent.request.RequestStatus;
import org.snmp4j.agent.request.SubRequest;
import org.snmp4j.agent.request.SubRequestIterator;
import org.snmp4j.mp.MPv3;
import org.snmp4j.security.SecurityProtocols;
import org.snmp4j.smi.*;
import org.snmp4j.transport.TransportMappings;
import org.snmp4j.util.ThreadPool;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by LuHj on 2019/6/28.
 */
public class SNMP4JAgent implements VariableProvider {

    protected AgentConfigManager agent;
    protected MOServer server;
    private String configFile;
    private File bootCounterFile;

    public SNMP4JAgent(){
        configFile = "configFile.cfg";
        bootCounterFile = new File("bootCounterFile.bc");
        server = new DefaultMOServer();
        MOServer[] moServers = new MOServer[] { server };
        final Properties props = new Properties();
        try {
            props.load(SNMP4JAgent.class.getResourceAsStream("/snmp/SampleAgentConfig.properties"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        MOInputFactory configurationFactory = new MOInputFactory(){
            @Override
            public MOInput createMOInput() {
                return new PropertyMOInput(props, SNMP4JAgent.this);
            }
        };

        MessageDispatcher messageDispatcher = new MessageDispatcherImpl();
        List<String> list = new ArrayList<String>();
        list.add("udp:0.0.0.0/161");
        addListenAddresses(messageDispatcher,list);

        agent = new AgentConfigManager(
                new OctetString(MPv3.createLocalEngineID()),
                messageDispatcher,
                null,
                moServers,
                ThreadPool.create("snmp4JAgent", 3),
                configurationFactory,
                new DefaultMOPersistenceProvider(moServers, configFile),
                new EngineBootsCounterFile(bootCounterFile)
        );
    }


    @Override
    public Variable getVariable(String name) {
        OID oid;
        OctetString context = null;
        int pos = name.indexOf(':');
        if (pos >= 0) {
            context = new OctetString(name.substring(0, pos));
            oid = new OID(name.substring(pos + 1, name.length()));
        } else {
            oid = new OID(name);
        }
        final DefaultMOContextScope scope = new DefaultMOContextScope(context,
                oid, true, oid, true);
        MOQuery query = new MOQueryWithSource(scope, false, this);
        ManagedObject mo = server.lookup(query);
        if (mo != null) {
            final VariableBinding vb = new VariableBinding(oid);
            final RequestStatus status = new RequestStatus();
            SubRequest req = new SubRequest() {
                private boolean completed;
                private MOQuery query;

                public boolean hasError() {
                    return false;
                }

                public void setErrorStatus(int errorStatus) {
                    status.setErrorStatus(errorStatus);
                }

                public int getErrorStatus() {
                    return status.getErrorStatus();
                }

                public RequestStatus getStatus() {
                    return status;
                }

                public MOScope getScope() {
                    return scope;
                }

                public VariableBinding getVariableBinding() {
                    return vb;
                }

                public Request getRequest() {
                    return null;
                }

                public Object getUndoValue() {
                    return null;
                }

                public void setUndoValue(Object undoInformation) {
                }

                public void completed() {
                    completed = true;
                }

                public boolean isComplete() {
                    return completed;
                }

                public void setTargetMO(ManagedObject managedObject) {
                }

                public ManagedObject getTargetMO() {
                    return null;
                }

                public int getIndex() {
                    return 0;
                }

                public void setQuery(MOQuery query) {
                    this.query = query;
                }

                public MOQuery getQuery() {
                    return query;
                }

                public SubRequestIterator repetitions() {
                    return null;
                }

                public void updateNextRepetition() {
                }

                public Object getUserObject() {
                    return null;
                }

                public void setUserObject(Object userObject) {
                }

            };
            mo.get(req);
            return vb.getVariable();
        }
        return null;
    }

    protected void addListenAddresses(MessageDispatcher md,
                                      List<String> addresses) {
        for (String addressString : addresses) {
            Address address = GenericAddress.parse(addressString);
            if (address == null) {
                System.out.println("Could not parse address string '" + addressString
                        + "'");
                return;
            }
            @SuppressWarnings("rawtypes")
            TransportMapping tm = TransportMappings.getInstance().createTransportMapping(address);
            if (tm != null) {
                md.addTransportMapping(tm);
            } else {
                System.out.println("No transport mapping available for address '"
                        + address + "'.");
            }
        }
    }

    public void registerMIBs(){
        try {
            server.register(new SysString(), null);
            server.register(new SysInteger(), null);

            server.register(MoTableUtil.getEmuTable(), null);
            server.register(MoTableUtil.getEdfaTable(), null);

            MoTableUtil.fillDefaultDataIntoEmuTable();
            MoTableUtil.fillDefaultDataIntoEdfaTable();
        } catch (DuplicateRegistrationException e) {
            e.printStackTrace();
        }
    }

    public void registerMOTable(DefaultMOTable table){
        try {
            server.register(table, null);
        } catch (DuplicateRegistrationException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        agent.initialize();
//        registerMIBs();
        agent.setupProxyForwarder();
        agent.setTableSizeLimits(new Properties());
        agent.run();
    }

    public static void main(String[] args){
        SNMP4JAgent sa = new SNMP4JAgent();
//        SecurityProtocols.getInstance().addDefaultProtocols();
        sa.run();

    }
}

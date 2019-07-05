package com.hk.snmp.scalar;

import org.snmp4j.agent.mo.MOAccessImpl;
import org.snmp4j.agent.mo.MOScalar;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;

/**
 * Created by LuHj on 2019/6/28.
 */
public class SysString extends MOScalar<OctetString> {

    public SysString() {
        super(new OID("1.3.6.1.4.1.12321.1.1.1.2.0"), MOAccessImpl.ACCESS_READ_ONLY,
                new OctetString("com"));
        // 1.3.6.1.2.1.1.1.0
    }

    @Override
    public OctetString getValue() {
        return new OctetString("com");
    }
}

package com.hk.snmp.table.row;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.Variable;

/**
 * Created by LuHj on 2019/7/1.
 */
@Data
@Builder
@AllArgsConstructor
public class PduRow implements IRow{
    private int id;
    private int online;
    private int voltage;
    private int current;
    private int power;

    @Override
    public OID getOid() {
        return new OID(new int[]{id});
    }

    @Override
    public Variable[] toVariables(){
        return new Variable[]{
                new Integer32(online),
                new Integer32(voltage),
                new Integer32(current),
                new Integer32(power)
        };
    }
}

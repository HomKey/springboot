package com.hk.snmp.scalar;

import org.snmp4j.agent.mo.MOAccessImpl;
import org.snmp4j.agent.mo.MOScalar;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OID;

import java.util.Random;

/**
 * Created by LuHj on 2019/6/28.
 */
public class SysInteger extends MOScalar<Integer32> {

    public SysInteger() {
        super(new OID("1.3.6.1.4.1.12321.1.1.1.3.0"), MOAccessImpl.ACCESS_READ_WRITE,
                new Integer32(3));
    }

    @Override
    public Integer32 getValue() {
        return super.getValue();
    }

    @Override
    public int setValue(Integer32 value) {
        return super.setValue(value);
    }
}

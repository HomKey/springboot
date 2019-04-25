package com.hk.freemarker.entity;

/**
 * Created by LuHj on 2018/10/22.
 */
public class CabinetComponents {
    private String index;
    private String assertId;
    private PduDefine pduA;
    private PduDefine pduB;
    private EmhDefine emh;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getAssertId() {
        return assertId;
    }

    public void setAssertId(String assertId) {
        this.assertId = assertId;
    }

    public PduDefine getPduA() {
        return pduA;
    }

    public void setPduA(PduDefine pduA) {
        this.pduA = pduA;
    }

    public PduDefine getPduB() {
        return pduB;
    }

    public void setPduB(PduDefine pduB) {
        this.pduB = pduB;
    }

    public EmhDefine getEmh() {
        return emh;
    }

    public void setEmh(EmhDefine emh) {
        this.emh = emh;
    }
}

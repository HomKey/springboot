package com.hk.freemarker.dcim.enums;


/**
 * Created by HomKey on 2019/9/23.
 */
public enum DeviceModel {
        CHANGJING("ACF8197B-7512-4DD0-A5E9-245B9993E00B","/MockData/Models/1288/changjing.DAE","1288大机房场景"),
        TOUMINGTONGDAO1("9194EDE2-1FE5-4120-84C1-641B8F6333EF","/MockData/Models/1288/toumingtongdao1.DAE","1288透明通道1"),
        TOUMINGTONGDAO2("BF8C2CD7-70CE-4592-BA24-CE76479CB60C","/MockData/Models/1288/toumingtongdao2.DAE","1288透明通道2"),
        TOUMINGTONGDAO3("F03D7CCF-273F-4EF6-95E0-E4F9A886EDBE","/MockData/Models/1288/toumingtongdao3.DAE","1288透明通道3"),
        TOUMINGTONGDAO4("969775FA-8EA7-45CD-BF74-B6B9B9098D82","/MockData/Models/1288/toumingtongdao4.DAE","1288透明通道4"),
        TONGDAO1("EB2D89E3-AFF6-4686-BCA8-BAD79AF89B7D","/MockData/Models/1288/tongdao1.DAE","1288通道1"),
        TONGDAO2("9761E489-4D46-4393-8A70-2EFBE78A6FD7","/MockData/Models/1288/tongdao2.DAE","1288通道2"),
        TONGDAO3("B06A8708-3E91-423E-AF17-D609D9254510","/MockData/Models/1288/tongdao3.DAE","1288通道3"),
        TONGDAO4("072D496D-83F8-4344-8FEE-2C048F062112","/MockData/Models/1288/tongdao4.DAE","1288通道4"),
        UPS06("C0E223B9-008D-4011-B685-65D3C250964F","/MockData/Models/Ups06.DAE","1288UPS"),
        JIGUI300("B2D95F8C-B682-47AD-BE50-E4569A1BDD0A","/MockData/Models/1288/jigui300.DAE","1288空调"),
        ELM("FBB3528E-CC4A-4DDC-BB61-CDB8F4619639","/MockData/Models/DioBox01.dae","1288电量仪"),
        FIREPROTECTBOX("1A4D5E96-12D0-46C2-89C5-BF9B61EB3F77","/MockData/Models/FireProtectBox.dae","1288消防监控"),
        FL("19BDE5D8-9612-49C2-A8CD-E4FC62D4BF8C","/MockData/Models/DioBox01.dae","1288防雷检测"),
        AISLEFLOODTUBE_NNGA("CFFF5132-8310-412D-BDCA-27139CEEA03F","/MockData/Models/aisleFloodTube_nnga.dae","1288水浸"),
        SENSOR01("F1AE1E80-310E-4EF3-8D2D-662FC74A45ED","/MockData/Models/Sensor01.dae","1288温湿度"),
        PDC03("36F133F7-DCCE-4C19-9B93-43C7EBE0F514","/MockData/Models/1288/Pdc03.dae","1288配电柜"),
    ;

    private String modelId;
    private String modelUrl;
    private String modelName;

    DeviceModel(String modelId, String modelUrl, String modelName) {
        this.modelId = modelId;
        this.modelUrl = modelUrl;
        this.modelName = modelName;
    }

    public String getModelId() {
        return modelId;
    }

    public String getModelUrl() {
        return modelUrl;
    }

    public String getModelName() {
        return modelName;
    }
}

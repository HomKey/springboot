package com.hk.freemarker.dcim.util;

import com.hk.freemarker.dcim.entity.base.CollectorDevice;
import com.hk.freemarker.dcim.entity.base.PositionDevice;
import com.hk.freemarker.dcim.entity.base.DeviceDetail;
import com.hk.freemarker.dcim.enums.DeviceModel;
import com.hk.freemarker.dcim.enums.DeviceType;

import java.util.*;

/**
 * Created by HomKey on 2019/9/20.
 */
public class CollectorDeviceUtils {
    private static final String SCENE_ID = "F6B9E5A4-5AC4-4019-A92E-83716C2B768E";
    private static Map<DeviceType, List> data = new HashMap<>();
    private static List<DeviceModel> deviceModelList;

    static {
        init();
    }

    public static void init() {
        clear();
        init1288Elm();
        init1288Th();
        init1288Pdc();
        init1288Floor();
        init1288Emh();
//        init1288Pdu();
        init1288Ups();
        init1288Ac();
        initFan();

        // 肿瘤
        // 环境主机
        initChannel();
        initHipulse(); // ups
        initZlPdc();
        // 空调
        // ACM03U1
        initACM03U1();
        //DME
        initDME();
        // unity
        initUnity();

        initZlFloor();
        initZlElm();

        initZlTh();
    }

    private static void initFan(){
        List<PositionDevice> list = new ArrayList<>();
        DeviceType deviceType = DeviceType.FanTsd;
        PositionDevice emh = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("3B4FFE6F-3880-4D4A-9C1F-D6ABA893662B")
                        .name("风机1").index(1).ip("192.168.0.140").port("6018").busId("1").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("3B4FFE6F-3880-4D4A-9C1F-D6ABA893662B")
                        .bubbleUrl("")
                        .deviceType(deviceType)
                        .build())
                .build();
        list.add(emh);
        data.put(deviceType, list);
    }
    private static void initChannel(){
        List<PositionDevice> list1 = new ArrayList<>();
        DeviceType deviceType = DeviceType.EMHv2;
        PositionDevice emh = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("a74ad405-2251-43e0-be39-d95b2502168b")
                        .name("通道1").index(1).ip("192.168.0.140").port("6011").busId("1").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("a74ad405-2251-43e0-be39-d95b2502168b")
                        .bubbleUrl("")
                        .deviceType(deviceType)
                        .build())
                .build();
        list1.add(emh);
        data.put(deviceType, list1);
    }

    private static void initDME() {
        List<PositionDevice> list1 = new ArrayList<>();
        DeviceType deviceType = DeviceType.DME_Modbus;
        PositionDevice ac1 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("0b4dba4e-75c8-42c1-a97c-c2211fa25857")
                        .name("空调2").index(2).ip("192.168.0.140").port("6015").busId("1").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("0b4dba4e-75c8-42c1-a97c-c2211fa25857")
                        .bubbleUrl("")
                        .deviceType(deviceType)
                        .build())
                .build();
        list1.add(ac1);
        data.put(deviceType, list1);
    }

    private static void initUnity() {
        List<PositionDevice> list1 = new ArrayList<>();
        DeviceType deviceType = DeviceType.Unity;
        PositionDevice ac1 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("7b06dbc2-4b38-4793-9070-c9cc30250aab")
                        .name("空调3").index(3).ip("192.168.0.140").port("16008").busId("1").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("7b06dbc2-4b38-4793-9070-c9cc30250aab")
                        .bubbleUrl("")
                        .deviceType(deviceType)
                        .build())
                .build();
        list1.add(ac1);
        data.put(deviceType, list1);
    }

    private static void initACM03U1() {
        List<PositionDevice> list1 = new ArrayList<>();
        PositionDevice ac1 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("3c11b56a-98b6-41eb-9969-64e2247b3245")
                        .name("空调1").index(1).ip("192.168.0.140").port("6009").busId("1").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("3c11b56a-98b6-41eb-9969-64e2247b3245")
                        .bubbleUrl("")
                        .deviceType(DeviceType.ACM03U1)
                        .build())
                .build();
        list1.add(ac1);
        data.put(DeviceType.ACM03U1, list1);
    }

    // 电量仪
    private static void initZlElm() {
        List<PositionDevice> elmList = new ArrayList<>();
        DeviceType deviceType = DeviceType.PM5350BW_ZL;
        PositionDevice dly1 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("3766aa69-d969-4500-a0df-a3ad797ab2a7")
                        .name("电量仪1").index(1).ip("192.168.0.140").port("6006").busId("1").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("3766aa69-d969-4500-a0df-a3ad797ab2a7")
                        .bubbleUrl("")
                        .deviceType(deviceType)
                        .build())
                .build();
        PositionDevice dly2 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("57980c88-7781-4fb8-855e-d5a674de4ed0")
                        .name("电量仪2").index(2).ip("192.168.0.140").port("6006").busId("2").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("57980c88-7781-4fb8-855e-d5a674de4ed0")
                        .bubbleUrl("")
                        .deviceType(deviceType)
                        .build())
                .build();
        PositionDevice dly3 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("8283736f-0a3f-4c1e-92e5-ee0883cfc174")
                        .name("电量仪3").index(3).ip("192.168.0.140").port("6006").busId("3").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("8283736f-0a3f-4c1e-92e5-ee0883cfc174")
                        .bubbleUrl("")
                        .deviceType(deviceType)
                        .build())
                .build();
        elmList.add(dly1);
        elmList.add(dly2);
        elmList.add(dly3);
        data.put(deviceType, elmList);
    }

    // 电量仪
    private static void init1288Elm() {
        List<PositionDevice> elmList = new ArrayList<>();
        PositionDevice dly4 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("3C4F8CEC-C268-40D7-A38E-78992786FF36")
                        .name("电量仪4").index(1).ip("192.168.0.140").port("6016").busId("7").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("3C4F8CEC-C268-40D7-A38E-78992786FF36")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PM5350BW)
                        .build())
                .build();
        elmList.add(dly4);
        PositionDevice dly5 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("677F7E86-EDE7-430D-AE06-A5AE3E630FA2")
                        .name("电量仪5").index(2).ip("192.168.0.140").port("6016").busId("8").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("677F7E86-EDE7-430D-AE06-A5AE3E630FA2")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PM5350BW)
                        .build())
                .build();
        elmList.add(dly5);
        data.put(DeviceType.PM5350BW, elmList);
    }

    // 温湿度
    private static void init1288Th() {
        List<PositionDevice> thList = new ArrayList<>();
        PositionDevice th1 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("985718E4-E854-461C-BB37-263C75AE4628")
                        .name("温湿度探头1").index(1).ip("192.168.0.140").port("6013").busId("1").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("985718E4-E854-461C-BB37-263C75AE4628")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH)
                        .build())
                .build();
        PositionDevice th2 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("E059BE90-FA8C-47D0-9E51-8514A4782646")
                        .name("温湿度探头2").index(2).ip("192.168.0.140").port("6013").busId("2").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("E059BE90-FA8C-47D0-9E51-8514A4782646")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH)
                        .build())
                .build();
        PositionDevice th3 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("430A3EFC-0CF1-418F-953D-4B2E7065F058")
                        .name("温湿度探头3").index(3).ip("192.168.0.140").port("6013").busId("3").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("430A3EFC-0CF1-418F-953D-4B2E7065F058")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH)
                        .build())
                .build();
        PositionDevice th4 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("3404F713-4DDF-4821-BCA9-2E836CE2C466")
                        .name("温湿度探头4").index(4).ip("192.168.0.140").port("6013").busId("4").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("3404F713-4DDF-4821-BCA9-2E836CE2C466")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH)
                        .build())
                .build();
        PositionDevice th5 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("872C8021-CE90-4D48-A33A-96A9A8DB1BBF")
                        .name("温湿度探头5").index(5).ip("192.168.0.140").port("6013").busId("5").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("872C8021-CE90-4D48-A33A-96A9A8DB1BBF")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH)
                        .build())
                .build();
        PositionDevice th6 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("D5881239-FD56-45FC-8FF9-DE8529F7E478")
                        .name("温湿度探头6").index(6).ip("192.168.0.140").port("6013").busId("6").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("D5881239-FD56-45FC-8FF9-DE8529F7E478")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH)
                        .build())
                .build();
        PositionDevice th7 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("7BA050DF-F2D1-487C-8E1C-F30B6B6CF654")
                        .name("温湿度探头7").index(7).ip("192.168.0.140").port("6013").busId("7").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("7BA050DF-F2D1-487C-8E1C-F30B6B6CF654")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH)
                        .build())
                .build();
        PositionDevice th8 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("296BBB98-CE8B-4B55-9544-60C8A5D958D6")
                        .name("温湿度探头8").index(8).ip("192.168.0.140").port("6013").busId("8").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("296BBB98-CE8B-4B55-9544-60C8A5D958D6")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH)
                        .build())
                .build();
        PositionDevice th9 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("EC701C2B-DD59-401F-912F-660439CE59C9")
                        .name("温湿度探头9").index(9).ip("192.168.0.140").port("6013").busId("9").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("EC701C2B-DD59-401F-912F-660439CE59C9")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH)
                        .build())
                .build();
        PositionDevice th10 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("5AE4ECC5-F4C3-475B-8005-7EF01CA6E1D9")
                        .name("温湿度探头10").index(10).ip("192.168.0.140").port("6013").busId("10").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("5AE4ECC5-F4C3-475B-8005-7EF01CA6E1D9")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH)
                        .build())
                .build();
        thList.add(th1);
        thList.add(th2);
        thList.add(th3);
        thList.add(th4);
        thList.add(th5);
        thList.add(th6);
        thList.add(th7);
        thList.add(th8);
        thList.add(th9);
        thList.add(th10);
        data.put(DeviceType.TH, thList);
    }

    private static void initZlTh() {
        List<PositionDevice> list = new ArrayList<>();
        PositionDevice th1 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("4c073df9-e7f5-45c4-b8a9-58fa45a200aa")
                        .name("th-1").index(1).ip("192.168.0.140").port("6003").busId("2").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("4c073df9-e7f5-45c4-b8a9-58fa45a200aa")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH_ZL)
                        .build())
                .build();
        list.add(th1);

        PositionDevice th2 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("aa9c72b3-116a-4d5b-a09f-7043d292ef25")
                        .name("th-2").index(2).ip("192.168.0.140").port("6003").busId("3").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("aa9c72b3-116a-4d5b-a09f-7043d292ef25")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH_ZL)
                        .build())
                .build();
        list.add(th2);

        PositionDevice th3 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("b685cb4b-db01-4490-9686-fcc365cca504")
                        .name("th-3").index(3).ip("192.168.0.140").port("6003").busId("4").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("b685cb4b-db01-4490-9686-fcc365cca504")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH_ZL)
                        .build())
                .build();
        list.add(th3);

        PositionDevice th4 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("cbec977b-fbb9-4788-a0b5-c5b7a5c6a480")
                        .name("th-4").index(4).ip("192.168.0.140").port("6003").busId("5").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("cbec977b-fbb9-4788-a0b5-c5b7a5c6a480")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH_ZL)
                        .build())
                .build();
        list.add(th4);

        PositionDevice th5 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("2ab5433f-c5de-4194-95ed-b873328c5421")
                        .name("th-5").index(5).ip("192.168.0.140").port("6003").busId("6").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("2ab5433f-c5de-4194-95ed-b873328c5421")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH_ZL)
                        .build())
                .build();
        list.add(th5);

        PositionDevice th6 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("1203e964-075d-458a-a0bb-0e5fbb0f7fe8")
                        .name("th-6").index(6).ip("192.168.0.140").port("6003").busId("7").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("1203e964-075d-458a-a0bb-0e5fbb0f7fe8")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH_ZL)
                        .build())
                .build();
        list.add(th6);

        PositionDevice th7 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("73912b35-a9d7-432d-a02e-28509025ad40")
                        .name("th-7").index(7).ip("192.168.0.140").port("6003").busId("8").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("73912b35-a9d7-432d-a02e-28509025ad40")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH_ZL)
                        .build())
                .build();
        list.add(th7);

        PositionDevice th8 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("d38e5011-932b-463d-ad9e-083bc3b2559e")
                        .name("th-8").index(8).ip("192.168.0.140").port("6003").busId("9").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("d38e5011-932b-463d-ad9e-083bc3b2559e")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH_ZL)
                        .build())
                .build();
        list.add(th8);

        PositionDevice th9 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("1b745ea8-ba18-4cde-9185-504fc0333d2d")
                        .name("th-9").index(9).ip("192.168.0.140").port("6003").busId("10").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("1b745ea8-ba18-4cde-9185-504fc0333d2d")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH_ZL)
                        .build())
                .build();
        list.add(th9);

        PositionDevice th10 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("054698ad-1e07-4615-8b67-8d44ece875a5")
                        .name("th-10").index(10).ip("192.168.0.140").port("6003").busId("11").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("054698ad-1e07-4615-8b67-8d44ece875a5")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH_ZL)
                        .build())
                .build();
        list.add(th10);

        PositionDevice th11 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("5b54077a-2290-498e-bc18-4db58acce3ac")
                        .name("th-11").index(11).ip("192.168.0.140").port("6003").busId("12").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("5b54077a-2290-498e-bc18-4db58acce3ac")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH_ZL)
                        .build())
                .build();
        list.add(th11);

        PositionDevice th12 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("38fd8694-5494-49ef-9117-9f9cc83e7162")
                        .name("th-12").index(12).ip("192.168.0.140").port("6003").busId("13").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("38fd8694-5494-49ef-9117-9f9cc83e7162")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH_ZL)
                        .build())
                .build();
        list.add(th12);
        data.put(DeviceType.TH_ZL, list);
    }
    // 配电柜
    private static void init1288Pdc() {
        List<PositionDevice> pdcList = new ArrayList<>();
//        PositionDevice pdc1 = PositionDevice.builder()
//                .collectorDevice(CollectorDevice.builder()
//                        .deviceId("4E5AC5DD-72B8-4E7F-BDAE-DBDA902E822B")
//                        .name("空调配电柜").index(1).ip("192.168.0.140").port("6015").busId("1").build())
//                .deviceDetail(DeviceDetail.builder()
//                        .deviceId("4E5AC5DD-72B8-4E7F-BDAE-DBDA902E822B")
//                        .bubbleUrl("")
//                        .deviceType(DeviceType.PDC)
//                        .build())
//                .build();
//        PositionDevice pdc2 = PositionDevice.builder()
//                .collectorDevice(CollectorDevice.builder()
//                        .deviceId("4623E900-CBA2-4F5F-A104-4DFC4D8E1910")
//                        .name("市电配电柜").index(2).ip("192.168.0.140").port("6015").busId("2").build())
//                .deviceDetail(DeviceDetail.builder()
//                        .deviceId("4623E900-CBA2-4F5F-A104-4DFC4D8E1910")
//                        .bubbleUrl("")
//                        .deviceType(DeviceType.PDC)
//                        .build())
//                .build();
//        PositionDevice pdc3 = PositionDevice.builder()
//                .collectorDevice(CollectorDevice.builder()
//                        .deviceId("3A8846B9-9375-49B8-BC0D-91D704465280")
//                        .name("精密配电柜A1-1").index(3).ip("192.168.0.140").port("6015").busId("3").build())
//                .deviceDetail(DeviceDetail.builder()
//                        .deviceId("3A8846B9-9375-49B8-BC0D-91D704465280")
//                        .bubbleUrl("")
//                        .deviceType(DeviceType.PDC)
//                        .build())
//                .build();
//        PositionDevice pdc4 = PositionDevice.builder()
//                .collectorDevice(CollectorDevice.builder()
//                        .deviceId("0A62A7DB-0F1D-4078-9330-8328DF968049")
//                        .name("精密配电柜A2-1").index(4).ip("192.168.0.140").port("6015").busId("4").build())
//                .deviceDetail(DeviceDetail.builder()
//                        .deviceId("0A62A7DB-0F1D-4078-9330-8328DF968049")
//                        .bubbleUrl("")
//                        .deviceType(DeviceType.PDC)
//                        .build())
//                .build();
//        PositionDevice pdc5 = PositionDevice.builder()
//                .collectorDevice(CollectorDevice.builder()
//                        .deviceId("BF767C2F-8E76-4D67-B593-1AF6477222ED")
//                        .name("精密配电柜A3-1").index(5).ip("192.168.0.140").port("6015").busId("5").build())
//                .deviceDetail(DeviceDetail.builder()
//                        .deviceId("BF767C2F-8E76-4D67-B593-1AF6477222ED")
//                        .bubbleUrl("")
//                        .deviceType(DeviceType.PDC)
//                        .build())
//                .build();
        PositionDevice pdc6 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("4B251A67-1D30-499E-B47C-988BD4A0539F")
                        .name("精密配电柜A4-1").index(6).ip("192.168.10.12").port("6001").busId("1").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("4B251A67-1D30-499E-B47C-988BD4A0539F")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDC)
                        .build())
                .build();
//        pdcList.add(pdc1);
//        pdcList.add(pdc2);
//        pdcList.add(pdc3);
//        pdcList.add(pdc4);
//        pdcList.add(pdc5);
        pdcList.add(pdc6);
        data.put(DeviceType.PDC, pdcList);
    }

    // 配电柜
    private static void initZlPdc() {
        List<PositionDevice> pdcList = new ArrayList<>();
        DeviceType deviceType = DeviceType.PDC_ZL;
        PositionDevice tdPdc = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("5d1d94c0-9706-4baa-bdc8-7e9920e0ec4b")
                        .name("配电柜").index(1).ip("192.168.0.140").port("6013").busId("1").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("5d1d94c0-9706-4baa-bdc8-7e9920e0ec4b")
                        .bubbleUrl("")
                        .deviceType(deviceType)
                        .build())
                .build();
        pdcList.add(tdPdc);
        PositionDevice upsPdc = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("9fe9f501-e90e-4a39-9839-58249cd6d30c")
                        .name("配电间配电柜").index(2).ip("192.168.0.140").port("6014").busId("1").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("9fe9f501-e90e-4a39-9839-58249cd6d30c")
                        .bubbleUrl("")
                        .deviceType(deviceType)
                        .build())
                .build();
        pdcList.add(upsPdc);
        data.put(deviceType, pdcList);
    }

    // 漏水
    private static void init1288Floor() {
        PositionDevice flood1 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("D501CC3B-6449-4939-B2DE-89626703A4C3")
                        .name("水浸1-1").index(1).ip("192.168.0.140").port("6017").busId("1").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("D501CC3B-6449-4939-B2DE-89626703A4C3")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood2 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("99E9F8A1-000F-4224-94D4-98695DC46588")
                        .name("水浸1-2").index(2).ip("192.168.0.140").port("6017").busId("2").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("99E9F8A1-000F-4224-94D4-98695DC46588")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood3 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("F6EB373A-E69C-4EE9-B5D3-4BC4B377FE84")
                        .name("水浸1-3").index(3).ip("192.168.0.140").port("6017").busId("3").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("F6EB373A-E69C-4EE9-B5D3-4BC4B377FE84")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood4 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("2AF3700A-BEBC-4CA6-89AE-D27F70232494")
                        .name("水浸1-4").index(4).ip("192.168.0.140").port("6017").busId("4").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("2AF3700A-BEBC-4CA6-89AE-D27F70232494")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood5 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("91F4B297-FD73-4514-A9F1-06A20104513E")
                        .name("水浸2-1").index(5).ip("192.168.0.140").port("6017").busId("5").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("91F4B297-FD73-4514-A9F1-06A20104513E")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood6 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("010847C1-264E-477E-8A03-53789526474E")
                        .name("水浸2-2").index(6).ip("192.168.0.140").port("6017").busId("6").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("010847C1-264E-477E-8A03-53789526474E")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood7 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("6AD85CB7-7E1F-4768-B798-E6F98D192610")
                        .name("水浸2-3").index(7).ip("192.168.0.140").port("6017").busId("7").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("6AD85CB7-7E1F-4768-B798-E6F98D192610")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood8 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("23B69B51-265C-4731-A43A-207A2DC2F7AF")
                        .name("水浸2-4").index(8).ip("192.168.0.140").port("6017").busId("8").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("23B69B51-265C-4731-A43A-207A2DC2F7AF")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood9 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("A2801D5A-9E62-437B-88B3-F646BD7567D6")
                        .name("水浸3-1").index(9).ip("192.168.0.140").port("6017").busId("9").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("A2801D5A-9E62-437B-88B3-F646BD7567D6")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood10 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("3B913045-0DC9-48DA-AA61-2D113D57AEC6")
                        .name("水浸3-2").index(10).ip("192.168.0.140").port("6017").busId("10").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("3B913045-0DC9-48DA-AA61-2D113D57AEC6")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood11 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("26496F68-563D-48E1-B73F-542F334A378A")
                        .name("水浸3-3").index(11).ip("192.168.0.140").port("6017").busId("11").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("26496F68-563D-48E1-B73F-542F334A378A")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood12 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("0ADCC097-5954-4A36-8999-C96529F316A6")
                        .name("水浸3-4").index(12).ip("192.168.0.140").port("6017").busId("12").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("0ADCC097-5954-4A36-8999-C96529F316A6")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood13 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("38069B8F-FC9F-4735-A409-2C07941EAFF3")
                        .name("水浸4-1").index(13).ip("192.168.0.140").port("6017").busId("13").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("38069B8F-FC9F-4735-A409-2C07941EAFF3")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood14 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("1CF1777F-73C8-431D-AC61-7298E7613B00")
                        .name("水浸4-2").index(14).ip("192.168.0.140").port("6017").busId("14").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("1CF1777F-73C8-431D-AC61-7298E7613B00")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood15 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("F06ED3A8-8BD4-446B-98B3-A744CB11EC22")
                        .name("水浸4-3").index(15).ip("192.168.0.140").port("6017").busId("15").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("F06ED3A8-8BD4-446B-98B3-A744CB11EC22")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood16 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("8D04DDA1-C0EF-4517-873F-DF4C1DD6CE21")
                        .name("水浸4-4").index(16).ip("192.168.0.140").port("6017").busId("16").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("8D04DDA1-C0EF-4517-873F-DF4C1DD6CE21")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        List<PositionDevice> floodList = new ArrayList<>();
        floodList.add(flood1);
        floodList.add(flood2);
        floodList.add(flood3);
        floodList.add(flood4);
        floodList.add(flood5);
        floodList.add(flood6);
        floodList.add(flood7);
        floodList.add(flood8);
        floodList.add(flood9);
        floodList.add(flood10);
        floodList.add(flood11);
        floodList.add(flood12);
        floodList.add(flood13);
        floodList.add(flood14);
        floodList.add(flood15);
        floodList.add(flood16);
        data.put(DeviceType.FLOOR, floodList);
    }

    // 肿瘤漏水
    private static void initZlFloor() {
        DeviceType deviceType = DeviceType.FLOOR_ZL;
        PositionDevice flood1 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("b9565f0b-189e-45d8-b13a-806f92c50f63")
                        .name("水浸1").index(1).ip("192.168.0.140").port("6004").busId("1").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("b9565f0b-189e-45d8-b13a-806f92c50f63")
                        .bubbleUrl("")
                        .deviceType(deviceType)
                        .build())
                .build();
        PositionDevice flood2 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("d15fc220-fc78-4f1c-80e3-d368e227845b")
                        .name("水浸2").index(2).ip("192.168.0.140").port("6004").busId("2").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("d15fc220-fc78-4f1c-80e3-d368e227845b")
                        .bubbleUrl("")
                        .deviceType(deviceType)
                        .build())
                .build();
        PositionDevice flood3 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("7fcfa8b7-01db-4a98-97c3-64e38b520894")
                        .name("水浸3").index(3).ip("192.168.0.140").port("6004").busId("3").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("7fcfa8b7-01db-4a98-97c3-64e38b520894")
                        .bubbleUrl("")
                        .deviceType(deviceType)
                        .build())
                .build();
        List<PositionDevice> floodList = new ArrayList<>();
        floodList.add(flood1);
        floodList.add(flood2);
        floodList.add(flood3);
        data.put(deviceType, floodList);
    }

    // 冷通道环境主机
    private static void init1288Emh() {
//        PositionDevice channel1 = PositionDevice.builder()
//                .collectorDevice(CollectorDevice.builder()
//                        .deviceId("4D2A9A3F-374C-4D42-8C2E-C55205D0717A")
//                        .name("冷通道1").index(1).ip("192.168.0.140").port("6014").busId("1").build())
//                .deviceDetail(DeviceDetail.builder()
//                        .deviceId("4D2A9A3F-374C-4D42-8C2E-C55205D0717A")
//                        .bubbleUrl("")
//                        .deviceType(DeviceType.EMH)
//                        .build())
//                .build();
//        PositionDevice channel2 = PositionDevice.builder()
//                .collectorDevice(CollectorDevice.builder()
//                        .deviceId("00F04F8F-07D9-49BE-9C88-F8C78FFCCC9F")
//                        .name("冷通道2").index(2).ip("192.168.0.140").port("6014").busId("2").build())
//                .deviceDetail(DeviceDetail.builder()
//                        .deviceId("00F04F8F-07D9-49BE-9C88-F8C78FFCCC9F")
//                        .bubbleUrl("")
//                        .deviceType(DeviceType.EMH)
//                        .build())
//                .build();
//        PositionDevice channel3 = PositionDevice.builder()
//                .collectorDevice(CollectorDevice.builder()
//                        .deviceId("6F6ECE56-369F-488C-8D1D-4B20035F10D6")
//                        .name("冷通道3").index(3).ip("192.168.0.140").port("6014").busId("3").build())
//                .deviceDetail(DeviceDetail.builder()
//                        .deviceId("6F6ECE56-369F-488C-8D1D-4B20035F10D6")
//                        .bubbleUrl("")
//                        .deviceType(DeviceType.EMH)
//                        .build())
//                .build();
        PositionDevice channel4 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("590C11C8-E015-48AD-9F54-94D8DC18088B")
                        .name("冷通道4").index(4).ip("192.168.10.1").port("6001").busId("1").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("590C11C8-E015-48AD-9F54-94D8DC18088B")
                        .bubbleUrl("")
                        .deviceType(DeviceType.EMH)
                        .build())
                .build();
        List<PositionDevice> channelList = new ArrayList<>();
//        channelList.add(channel1);
//        channelList.add(channel2);
//        channelList.add(channel3);
        channelList.add(channel4);
        data.put(DeviceType.EMH, channelList);
    }

    // PDU
    private static void init1288Pdu() {
        List<PositionDevice> list = new ArrayList<>();
        PositionDevice pduA1 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("C9B4B282-F452-4F3C-B201-D78A46E787AD")
                        .name("pduA-1").index(1).ip("192.168.0.140").port("6003").busId("1").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("C9B4B282-F452-4F3C-B201-D78A46E787AD")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduA1);

        PositionDevice pduA2 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("48E7A878-FC78-44B5-89E1-E2B21A8BFC02")
                        .name("pduA-2").index(2).ip("192.168.0.140").port("6003").busId("2").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("48E7A878-FC78-44B5-89E1-E2B21A8BFC02")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduA2);

        PositionDevice pduA3 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("7020853F-ED88-4B02-B917-403A5CB978C7")
                        .name("pduA-3").index(3).ip("192.168.0.140").port("6003").busId("3").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("7020853F-ED88-4B02-B917-403A5CB978C7")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduA3);

        PositionDevice pduA4 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("7AAE9891-3CE4-4E65-A126-CFC8EF52C3D4")
                        .name("pduA-4").index(4).ip("192.168.0.140").port("6003").busId("4").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("7AAE9891-3CE4-4E65-A126-CFC8EF52C3D4")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduA4);

        PositionDevice pduA5 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("0780686D-F856-4E84-9394-50FE4A4605D7")
                        .name("pduA-5").index(5).ip("192.168.0.140").port("6003").busId("5").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("0780686D-F856-4E84-9394-50FE4A4605D7")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduA5);

        PositionDevice pduA6 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("0B9CC544-E5A3-4A09-A58C-C547EFC324E5")
                        .name("pduA-6").index(6).ip("192.168.0.140").port("6003").busId("6").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("0B9CC544-E5A3-4A09-A58C-C547EFC324E5")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduA6);

        PositionDevice pduA7 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("5DFFBE7C-72EF-47C9-8F0F-1A14DFDCA2A8")
                        .name("pduA-7").index(7).ip("192.168.0.140").port("6003").busId("7").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("5DFFBE7C-72EF-47C9-8F0F-1A14DFDCA2A8")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduA7);

        PositionDevice pduA8 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("A8912311-80D1-449F-928D-B49CB0E6D926")
                        .name("pduA-8").index(8).ip("192.168.0.140").port("6003").busId("8").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("A8912311-80D1-449F-928D-B49CB0E6D926")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduA8);

        PositionDevice pduA9 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("8FAAED81-FB47-4F3F-B5A3-F5BF41E3B8F5")
                        .name("pduA-9").index(9).ip("192.168.0.140").port("6003").busId("9").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("8FAAED81-FB47-4F3F-B5A3-F5BF41E3B8F5")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduA9);

        PositionDevice pduA10 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("BFB0AC39-9714-418E-BEE4-F2FA2D9ECA5A")
                        .name("pduA-10").index(10).ip("192.168.0.140").port("6003").busId("10").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("BFB0AC39-9714-418E-BEE4-F2FA2D9ECA5A")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduA10);

        PositionDevice pduA11 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("2459F9BE-1243-48BA-B880-B0FC25F8E19F")
                        .name("pduA-11").index(11).ip("192.168.0.140").port("6003").busId("11").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("2459F9BE-1243-48BA-B880-B0FC25F8E19F")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduA11);

        PositionDevice pduA12 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("97438E6E-8536-4F32-B6E8-FA3B97C03157")
                        .name("pduA-12").index(12).ip("192.168.0.140").port("6003").busId("12").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("97438E6E-8536-4F32-B6E8-FA3B97C03157")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduA12);

        PositionDevice pduA13 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("FE812EE9-D094-4DF6-A5D8-0E60DE791E58")
                        .name("pduA-13").index(13).ip("192.168.0.140").port("6003").busId("13").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("FE812EE9-D094-4DF6-A5D8-0E60DE791E58")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduA13);

        PositionDevice pduB15 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("285F8460-E30F-430B-ACAE-D8DD279513A5")
                        .name("pduB-15").index(15).ip("192.168.0.140").port("6003").busId("15").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("285F8460-E30F-430B-ACAE-D8DD279513A5")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduB15);

        PositionDevice pduB16 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("9638FC50-FF0F-4AF9-BA11-42AFC36F8F9E")
                        .name("pduB-16").index(16).ip("192.168.0.140").port("6003").busId("16").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("9638FC50-FF0F-4AF9-BA11-42AFC36F8F9E")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduB16);

        PositionDevice pduB17 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("62375B3A-2C7E-4563-99EA-463866CD3E8D")
                        .name("pduB-17").index(17).ip("192.168.0.140").port("6003").busId("17").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("62375B3A-2C7E-4563-99EA-463866CD3E8D")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduB17);

        PositionDevice pduB18 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("75A177A0-70EC-4F30-8733-475656EDA1D8")
                        .name("pduB-18").index(18).ip("192.168.0.140").port("6003").busId("18").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("75A177A0-70EC-4F30-8733-475656EDA1D8")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduB18);

        PositionDevice pduB19 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("9510E51A-2972-4EC0-9A15-E023BBACB311")
                        .name("pduB-19").index(19).ip("192.168.0.140").port("6003").busId("19").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("9510E51A-2972-4EC0-9A15-E023BBACB311")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduB19);

        PositionDevice pduB20 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("EFDAE6C3-F6B8-4799-B501-1F8325FB4B91")
                        .name("pduB-20").index(20).ip("192.168.0.140").port("6003").busId("20").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("EFDAE6C3-F6B8-4799-B501-1F8325FB4B91")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduB20);

        PositionDevice pduB21 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("95C6E42B-5B9D-4D36-8351-E021222F493E")
                        .name("pduB-21").index(21).ip("192.168.0.140").port("6003").busId("21").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("95C6E42B-5B9D-4D36-8351-E021222F493E")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduB21);

        PositionDevice pduB22 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("70FF52B8-EBFC-42CA-AD03-0DB6320F9B5D")
                        .name("pduB-22").index(22).ip("192.168.0.140").port("6003").busId("22").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("70FF52B8-EBFC-42CA-AD03-0DB6320F9B5D")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduB22);

        PositionDevice pduB23 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("DAC3BB73-B3C7-43C2-B496-90FB7FCC99E2")
                        .name("pduB-23").index(23).ip("192.168.0.140").port("6003").busId("23").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("DAC3BB73-B3C7-43C2-B496-90FB7FCC99E2")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduB23);

        PositionDevice pduB24 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("68E3F111-4484-4FFB-852A-5E7445559113")
                        .name("pduB-24").index(24).ip("192.168.0.140").port("6003").busId("24").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("68E3F111-4484-4FFB-852A-5E7445559113")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduB24);

        PositionDevice pduB25 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("7D02521A-FB19-4E21-B910-64E6B17CC7D8")
                        .name("pduB-25").index(25).ip("192.168.0.140").port("6003").busId("25").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("7D02521A-FB19-4E21-B910-64E6B17CC7D8")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduB25);

        PositionDevice pduB26 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("8F396570-22C8-4D9E-ABA8-A818D1470B8C")
                        .name("pduB-26").index(26).ip("192.168.0.140").port("6003").busId("26").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("8F396570-22C8-4D9E-ABA8-A818D1470B8C")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDU3)
                        .build())
                .build();
        list.add(pduB26);

        data.put(DeviceType.PDU3, list);
    }

    // UPS
    private static void init1288Ups() {
        List<PositionDevice> list = new ArrayList<>();
        PositionDevice ups1 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("5E674FFF-88F0-4915-85C1-8F2FE087ABBC")
                        .name("UPS-A").index(1).ip("192.168.0.140").port("6005").busId("1").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("5E674FFF-88F0-4915-85C1-8F2FE087ABBC")
                        .bubbleUrl("")
                        .deviceType(DeviceType.GALAXY300)
                        .build())
                .build();
        list.add(ups1);
        PositionDevice ups2 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("7A757E8F-5306-4A89-A441-DC9B37D91FE7")
                        .name("UPS-B").index(2).ip("192.168.0.140").port("6005").busId("2").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("7A757E8F-5306-4A89-A441-DC9B37D91FE7")
                        .bubbleUrl("")
                        .deviceType(DeviceType.GALAXY300)
                        .build())
                .build();
        list.add(ups2);
        data.put(DeviceType.GALAXY300, list);
    }

    // AC
    private static void init1288Ac() {
        List<PositionDevice> list = new ArrayList<>();
//        PositionDevice ac1 = PositionDevice.builder()
//                .collectorDevice(CollectorDevice.builder()
//                        .deviceId("1C57301D-67D9-4EC3-B10A-B6860D3F166E")
//                        .name("列间空调1-1").index(1).ip("192.168.0.140").port("6009").busId("1").build())
//                .deviceDetail(DeviceDetail.builder()
//                        .deviceId("1C57301D-67D9-4EC3-B10A-B6860D3F166E")
//                        .bubbleUrl("")
//                        .deviceType(DeviceType.ACRD300)
//                        .build())
//                .build();
//        list.add(ac1);
//        PositionDevice ac2 = PositionDevice.builder()
//                .collectorDevice(CollectorDevice.builder()
//                        .deviceId("DB9E7E02-A497-4C0E-BCD1-BD594DDFB288")
//                        .name("列间空调1-2").index(2).ip("192.168.0.140").port("6009").busId("2").build())
//                .deviceDetail(DeviceDetail.builder()
//                        .deviceId("1C57301D-67D9-4EC3-B10A-B6860D3F166E")
//                        .bubbleUrl("")
//                        .deviceType(DeviceType.ACRD300)
//                        .build())
//                .build();
//        list.add(ac2);
//        PositionDevice ac3 = PositionDevice.builder()
//                .collectorDevice(CollectorDevice.builder()
//                        .deviceId("6022518C-C1F0-4AB0-B24C-915E83265A7A")
//                        .name("列间空调1-3").index(3).ip("192.168.0.140").port("6009").busId("3").build())
//                .deviceDetail(DeviceDetail.builder()
//                        .deviceId("1C57301D-67D9-4EC3-B10A-B6860D3F166E")
//                        .bubbleUrl("")
//                        .deviceType(DeviceType.ACRD300)
//                        .build())
//                .build();
//        list.add(ac3);
//        PositionDevice ac4 = PositionDevice.builder()
//                .collectorDevice(CollectorDevice.builder()
//                        .deviceId("B8FA232C-9780-44DE-BD15-C2E53ED0487E")
//                        .name("列间空调1-4").index(4).ip("192.168.0.140").port("6009").busId("4").build())
//                .deviceDetail(DeviceDetail.builder()
//                        .deviceId("1C57301D-67D9-4EC3-B10A-B6860D3F166E")
//                        .bubbleUrl("")
//                        .deviceType(DeviceType.ACRD300)
//                        .build())
//                .build();
//        list.add(ac4);
//        PositionDevice ac5 = PositionDevice.builder()
//                .collectorDevice(CollectorDevice.builder()
//                        .deviceId("13923545-C43F-4A4E-B663-08D569FF80E7")
//                        .name("列间空调2-1").index(5).ip("192.168.0.140").port("6009").busId("5").build())
//                .deviceDetail(DeviceDetail.builder()
//                        .deviceId("1C57301D-67D9-4EC3-B10A-B6860D3F166E")
//                        .bubbleUrl("")
//                        .deviceType(DeviceType.ACRD300)
//                        .build())
//                .build();
//        list.add(ac5);
//        PositionDevice ac6 = PositionDevice.builder()
//                .collectorDevice(CollectorDevice.builder()
//                        .deviceId("643826FB-3F9C-45DD-90BC-C857F81CFB46")
//                        .name("列间空调2-2").index(6).ip("192.168.0.140").port("6009").busId("6").build())
//                .deviceDetail(DeviceDetail.builder()
//                        .deviceId("1C57301D-67D9-4EC3-B10A-B6860D3F166E")
//                        .bubbleUrl("")
//                        .deviceType(DeviceType.ACRD300)
//                        .build())
//                .build();
//        list.add(ac6);
//        PositionDevice ac7 = PositionDevice.builder()
//                .collectorDevice(CollectorDevice.builder()
//                        .deviceId("BB93B93A-3E23-45D8-963C-3274C1A3E57A")
//                        .name("列间空调2-3").index(7).ip("192.168.0.140").port("6009").busId("7").build())
//                .deviceDetail(DeviceDetail.builder()
//                        .deviceId("1C57301D-67D9-4EC3-B10A-B6860D3F166E")
//                        .bubbleUrl("")
//                        .deviceType(DeviceType.ACRD300)
//                        .build())
//                .build();
//        list.add(ac7);
//        PositionDevice ac8 = PositionDevice.builder()
//                .collectorDevice(CollectorDevice.builder()
//                        .deviceId("16473CA8-4F27-4403-851D-45B26D45F8E5")
//                        .name("列间空调2-4").index(8).ip("192.168.0.140").port("6009").busId("8").build())
//                .deviceDetail(DeviceDetail.builder()
//                        .deviceId("1C57301D-67D9-4EC3-B10A-B6860D3F166E")
//                        .bubbleUrl("")
//                        .deviceType(DeviceType.ACRD300)
//                        .build())
//                .build();
//        list.add(ac8);
//        PositionDevice ac9 = PositionDevice.builder()
//                .collectorDevice(CollectorDevice.builder()
//                        .deviceId("634A6B3B-D7B1-4424-A731-00A15CA945F6")
//                        .name("列间空调3-1").index(9).ip("192.168.0.140").port("6009").busId("9").build())
//                .deviceDetail(DeviceDetail.builder()
//                        .deviceId("1C57301D-67D9-4EC3-B10A-B6860D3F166E")
//                        .bubbleUrl("")
//                        .deviceType(DeviceType.ACRD300)
//                        .build())
//                .build();
//        list.add(ac9);
//        PositionDevice ac10 = PositionDevice.builder()
//                .collectorDevice(CollectorDevice.builder()
//                        .deviceId("141A4F72-7E8D-46E9-9380-9603F6EB546D")
//                        .name("列间空调3-2").index(10).ip("192.168.0.140").port("6009").busId("10").build())
//                .deviceDetail(DeviceDetail.builder()
//                        .deviceId("1C57301D-67D9-4EC3-B10A-B6860D3F166E")
//                        .bubbleUrl("")
//                        .deviceType(DeviceType.ACRD300)
//                        .build())
//                .build();
//        list.add(ac10);
//        PositionDevice ac11 = PositionDevice.builder()
//                .collectorDevice(CollectorDevice.builder()
//                        .deviceId("1E939E0D-4F9E-4E4C-AD6E-1CFD1154FA14")
//                        .name("列间空调3-3").index(11).ip("192.168.0.140").port("6009").busId("11").build())
//                .deviceDetail(DeviceDetail.builder()
//                        .deviceId("1C57301D-67D9-4EC3-B10A-B6860D3F166E")
//                        .bubbleUrl("")
//                        .deviceType(DeviceType.ACRD300)
//                        .build())
//                .build();
//        list.add(ac11);
//        PositionDevice ac12 = PositionDevice.builder()
//                .collectorDevice(CollectorDevice.builder()
//                        .deviceId("2AB89017-D7B1-47C8-BAA9-7CB097EA9049")
//                        .name("列间空调3-4").index(12).ip("192.168.0.140").port("6009").busId("12").build())
//                .deviceDetail(DeviceDetail.builder()
//                        .deviceId("1C57301D-67D9-4EC3-B10A-B6860D3F166E")
//                        .bubbleUrl("")
//                        .deviceType(DeviceType.ACRD300)
//                        .build())
//                .build();
//        list.add(ac12);
        PositionDevice ac13 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("81842AB9-888D-40D1-AAF2-DE195BB95002")
                        .name("列间空调4-1").index(13).ip("192.168.10.8").port("6001").busId("2").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("1C57301D-67D9-4EC3-B10A-B6860D3F166E")
                        .bubbleUrl("")
                        .deviceType(DeviceType.ACRD300)
                        .build())
                .build();
        list.add(ac13);
        PositionDevice ac14 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("E37F3495-9811-4413-BA2D-9261ECA28220")
                        .name("列间空调4-2").index(14).ip("192.168.10.8").port("6001").busId("1").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("1C57301D-67D9-4EC3-B10A-B6860D3F166E")
                        .bubbleUrl("")
                        .deviceType(DeviceType.ACRD300)
                        .build())
                .build();
        list.add(ac14);
        PositionDevice ac15 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("F85290FD-EA27-4332-A9AD-56C8AAA16448")
                        .name("列间空调4-3").index(15).ip("192.168.10.9").port("6001").busId("2").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("1C57301D-67D9-4EC3-B10A-B6860D3F166E")
                        .bubbleUrl("")
                        .deviceType(DeviceType.ACRD300)
                        .build())
                .build();
        list.add(ac15);
        PositionDevice ac16 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("406BC4F1-F6EE-48B8-8CD1-2DB320B60A73")
                        .name("列间空调4-4").index(16).ip("192.168.10.9").port("6001").busId("1").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("1C57301D-67D9-4EC3-B10A-B6860D3F166E")
                        .bubbleUrl("")
                        .deviceType(DeviceType.ACRD300)
                        .build())
                .build();
        list.add(ac16);
        data.put(DeviceType.ACRD300, list);
    }

    // UPS hipulse
    private static void initHipulse() {
        List<PositionDevice> list = new ArrayList<>();
        PositionDevice ups1 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("dacadba1-8e30-4fdd-affc-187fdcbce97e")
                        .name("ups1").index(1).ip("192.168.0.140").port("6012").busId("1").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("dacadba1-8e30-4fdd-affc-187fdcbce97e")
                        .bubbleUrl("")
                        .deviceType(DeviceType.Hipulse)
                        .build())
                .build();
        list.add(ups1);
        PositionDevice ups2 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("09b44ae8-0467-4ce6-b06f-ecee1168c1fa")
                        .name("ups2").index(2).ip("192.168.0.140").port("6012").busId("2").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("09b44ae8-0467-4ce6-b06f-ecee1168c1fa")
                        .bubbleUrl("")
                        .deviceType(DeviceType.Hipulse)
                        .build())
                .build();
        list.add(ups2);
        data.put(DeviceType.Hipulse, list);
    }

    private static void clear() {
        data.clear();
        deviceModelList = Arrays.asList(DeviceModel.values());
    }

    public static List getCollectorDeviceList(DeviceType deviceType) {
        return data.get(deviceType) == null ? new ArrayList<>() : data.get(deviceType);
    }

    public static Map<String, Object> getCollectorDeviceModel(DeviceType deviceType) {
        Map<String, Object> model = new HashMap<>();
        List<CollectorDevice> result = new ArrayList<>();
        List<PositionDevice> list = data.get(deviceType);
        if (list != null && list.size() > 0) {
            for (PositionDevice positionDevice : list) {
                result.add(positionDevice.getCollectorDevice());
            }
        }
        model.put(deviceType.getKey(), result);
        return model;
    }

    public static Map<DeviceType, List> getData() {
        return data;
    }

    public static List<DeviceModel> getDeviceModelList() {
        return deviceModelList;
    }

    public static String getUpdatePostionSQL(PositionDevice positionDevice) {
        return String.format("UPDATE [dbo].[ThingBase] SET [LocationX] = '%s', [LocationY] = '%s', [LocationZ] = '%s', [TowardsX] = '%s', [TowardsY] = '%s', [TowardsZ] = '%s' WHERE [Id] = '%s';",
                positionDevice.getLocationX(),
                positionDevice.getLocationY(),
                positionDevice.getLocationZ(),
                positionDevice.getTowardsX(),
                positionDevice.getTowardsY(),
                positionDevice.getTowardsZ(),
                positionDevice.getCollectorDevice().getDeviceId());
    }

    public static String getInsertDeviceModelSQL(DeviceModel deviceMode) {
        return String.format("EXEC dev_InsertDeviceModel '%s', '%s', '%s';",
                deviceMode.getModelId(), deviceMode.getModelUrl(), deviceMode.getModelName());
    }

    public static String getUpdateDeviceModelSQL(DeviceModel deviceMode) {
        return String.format("EXEC dev_UpdateDeviceModel '%s', '%s', '%s';",
                deviceMode.getModelId(), deviceMode.getModelUrl(), deviceMode.getModelName());
    }

    public static String getInsertDeviceBubbleXmlSQL(DeviceDetail deviceDetail) {
        return String.format("INSERT INTO [dbo].[DeviceBubbleTemplate] ([fdDevBubTemDevId], [fdDevBubTemUrl], [fdDevBubTemEnable]) VALUES ('%s', '%s', '1');",
                deviceDetail.getDeviceId(),
                deviceDetail.getBubbleUrl());
    }

    public static String getInsertDeviceDetailHtmlSQL(DeviceDetail deviceDetail) {
        return String.format("INSERT INTO [dbo].[DeviceMonitorTemplate] ([DeviceId], [Url]) VALUES ('%s', '%s');",
                deviceDetail.getDeviceId(),
                deviceDetail.getDetailHtmlUrl());

    }

    public static String getInsertDeviceSQL(DeviceDetail deviceDetail) {
        return String.format("EXEC dev_InsertDevice '%s','%s','%s','%s','%s', '%s';",
                deviceDetail.getDeviceId(),
                deviceDetail.getDeviceName(),
                deviceDetail.getDeviceCategory().getUuid(),
                SCENE_ID,
                deviceDetail.getDeviceModel().getModelId(),
                SCENE_ID);
    }
}

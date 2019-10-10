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
    public static final String SCENE_ID = "F6B9E5A4-5AC4-4019-A92E-83716C2B768E";
    private static Map<DeviceType, List> data = new HashMap<>();
    private static List<DeviceModel> deviceModelList;

    static {
        init();
    }

    public static void init() {
        clear();
        initElm();
        initTh();
        initPdc();
        initFloor();
        initEmh();
        initPdu();
        initUps();

        initHipulse();

    }

    // 电量仪
    private static void initElm(){
        List<PositionDevice> elmList = new ArrayList<>();
//        PositionDevice scene = PositionDevice.builder()
//                .collectorDevice(CollectorDevice.builder()
//                        .deviceId("FE2D4E16-8CA3-4787-A606-ACE8F80C497C")
//                        .name("广西公安厅大机房场景")
//                        .index(1)
//                        .ip("192.168.7.1")
//                        .port("6001")
//                        .busId("1")
//                        .build())
//                .deviceDetail(DeviceDetail.builder()
//                        .deviceId("4E800FEC-6E1B-49C5-BFDC-8F714E689ACD")
//                        .deviceModel(DeviceModel.CHANGJING)
//                        .bubbleUrl("")
//                        .deviceType(DeviceType.PM5350BW)
//                        .build())
//                .locationX(0f).locationY(0f).locationZ(0f).towardsX(0f).locationY(0f).towardsZ(0f)
//                .build();
//        PositionDevice elm1 = PositionDevice.builder()
//                .collectorDevice(CollectorDevice.builder()
//                        .deviceId("4E800FEC-6E1B-49C5-BFDC-8F714E689ACD")
//                        .name("pm5350bw电量仪1")
//                        .index(1)
//                        .ip("192.168.7.1")
//                        .port("6001")
//                        .busId("1")
//                        .build())
//                .deviceDetail(DeviceDetail.builder()
//                        .deviceId("4E800FEC-6E1B-49C5-BFDC-8F714E689ACD")
//                        .bubbleUrl("")
//                        .deviceType(DeviceType.PM5350BW)
//                        .build())
//                .locationX(0f).locationY(0f).locationZ(0f).towardsX(0f).locationY(0f).towardsZ(0f)
//                .build();

        PositionDevice tongdao1 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("590c11c8-e015-48ad-9f54-94d8dc18088b")
                        .name("通道1")
                        .index(1)
                        .ip("192.168.7.1")
                        .port("6001")
                        .busId("1")
                        .build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("590c11c8-e015-48ad-9f54-94d8dc18088b")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PM5350BW)
                        .build())
                .locationX(0f).locationY(0f).locationZ(0f).towardsX(0f).locationY(0f).towardsZ(0f)
                .build();
        PositionDevice tongdao2 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("4024840f-4b5d-4adf-a82b-5962032f3596")
                        .name("pm5350bw电量仪1")
                        .index(1)
                        .ip("192.168.7.1")
                        .port("6001")
                        .busId("1")
                        .build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("4E800FEC-6E1B-49C5-BFDC-8F714E689ACD")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PM5350BW)
                        .build())
                .locationX(0f).locationY(0f).locationZ(0f).towardsX(0f).locationY(0f).towardsZ(0f)
                .build();
        elmList.add(tongdao1);
        elmList.add(tongdao2);
        data.put(DeviceType.PM5350BW, elmList);
    }

    // 温湿度
    private static void initTh(){
        List<PositionDevice> thList = new ArrayList<>();
        PositionDevice th1 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("985718E4-E854-461C-BB37-263C75AE4628")
                        .name("温湿度探头1").index(1).ip("192.168.0.140").port("6006").busId("1").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("985718E4-E854-461C-BB37-263C75AE4628")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH)
                        .build())
                .build();
        PositionDevice th2 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("E059BE90-FA8C-47D0-9E51-8514A4782646")
                        .name("温湿度探头2").index(2).ip("192.168.0.140").port("6006").busId("2").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("E059BE90-FA8C-47D0-9E51-8514A4782646")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH)
                        .build())
                .build();
        PositionDevice th3 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("430A3EFC-0CF1-418F-953D-4B2E7065F058")
                        .name("温湿度探头3").index(3).ip("192.168.0.140").port("6006").busId("3").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("430A3EFC-0CF1-418F-953D-4B2E7065F058")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH)
                        .build())
                .build();
        PositionDevice th4 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("3404F713-4DDF-4821-BCA9-2E836CE2C466")
                        .name("温湿度探头4").index(4).ip("192.168.0.140").port("6006").busId("4").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("3404F713-4DDF-4821-BCA9-2E836CE2C466")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH)
                        .build())
                .build();
        PositionDevice th5 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("872C8021-CE90-4D48-A33A-96A9A8DB1BBF")
                        .name("温湿度探头5").index(5).ip("192.168.0.140").port("6006").busId("5").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("872C8021-CE90-4D48-A33A-96A9A8DB1BBF")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH)
                        .build())
                .build();
        PositionDevice th6 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("D5881239-FD56-45FC-8FF9-DE8529F7E478")
                        .name("温湿度探头6").index(6).ip("192.168.0.140").port("6006").busId("6").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("D5881239-FD56-45FC-8FF9-DE8529F7E478")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH)
                        .build())
                .build();
        PositionDevice th7 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("7BA050DF-F2D1-487C-8E1C-F30B6B6CF654")
                        .name("温湿度探头7").index(7).ip("192.168.0.140").port("6006").busId("7").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("7BA050DF-F2D1-487C-8E1C-F30B6B6CF654")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH)
                        .build())
                .build();
        PositionDevice th8 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("296BBB98-CE8B-4B55-9544-60C8A5D958D6")
                        .name("温湿度探头8").index(8).ip("192.168.0.140").port("6006").busId("8").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("296BBB98-CE8B-4B55-9544-60C8A5D958D6")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH)
                        .build())
                .build();
        PositionDevice th9 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("EC701C2B-DD59-401F-912F-660439CE59C9")
                        .name("温湿度探头9").index(9).ip("192.168.0.140").port("6006").busId("9").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("EC701C2B-DD59-401F-912F-660439CE59C9")
                        .bubbleUrl("")
                        .deviceType(DeviceType.TH)
                        .build())
                .build();
        PositionDevice th10 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("5AE4ECC5-F4C3-475B-8005-7EF01CA6E1D9")
                        .name("温湿度探头10").index(10).ip("192.168.0.140").port("6006").busId("10").build())
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

    // 配电柜
    private static void initPdc(){
        List<PositionDevice> pdcList = new ArrayList<>();
        PositionDevice pdc1 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("4E5AC5DD-72B8-4E7F-BDAE-DBDA902E822B")
                        .name("空调配电柜").index(1).ip("192.168.0.140").port("6002").busId("1").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("4E5AC5DD-72B8-4E7F-BDAE-DBDA902E822B")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDC)
                        .build())
                .build();
        PositionDevice pdc2 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("4623E900-CBA2-4F5F-A104-4DFC4D8E1910")
                        .name("市电配电柜").index(2).ip("192.168.0.140").port("6002").busId("2").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("4623E900-CBA2-4F5F-A104-4DFC4D8E1910")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDC)
                        .build())
                .build();
        PositionDevice pdc3 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("3A8846B9-9375-49B8-BC0D-91D704465280")
                        .name("精密配电柜A1-1").index(3).ip("192.168.0.140").port("6002").busId("3").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("3A8846B9-9375-49B8-BC0D-91D704465280")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDC)
                        .build())
                .build();
        PositionDevice pdc4 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("0A62A7DB-0F1D-4078-9330-8328DF968049")
                        .name("精密配电柜A2-1").index(4).ip("192.168.0.140").port("6002").busId("4").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("0A62A7DB-0F1D-4078-9330-8328DF968049")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDC)
                        .build())
                .build();
        PositionDevice pdc5 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("BF767C2F-8E76-4D67-B593-1AF6477222ED")
                        .name("精密配电柜A3-1").index(5).ip("192.168.0.140").port("6002").busId("5").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("BF767C2F-8E76-4D67-B593-1AF6477222ED")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDC)
                        .build())
                .build();
        PositionDevice pdc6 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("4B251A67-1D30-499E-B47C-988BD4A0539F")
                        .name("精密配电柜A4-1").index(6).ip("192.168.0.140").port("6002").busId("6").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("4B251A67-1D30-499E-B47C-988BD4A0539F")
                        .bubbleUrl("")
                        .deviceType(DeviceType.PDC)
                        .build())
                .build();
        pdcList.add(pdc1);
        pdcList.add(pdc2);
        pdcList.add(pdc3);
        pdcList.add(pdc4);
        pdcList.add(pdc5);
        pdcList.add(pdc6);
        data.put(DeviceType.PDC, pdcList);
    }

    // 漏水
    private static void initFloor(){
        PositionDevice flood1 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("D501CC3B-6449-4939-B2DE-89626703A4C3")
                        .name("水浸1-1").index(1).ip("192.168.0.140").port("6004").busId("1").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("D501CC3B-6449-4939-B2DE-89626703A4C3")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood2 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("99E9F8A1-000F-4224-94D4-98695DC46588")
                        .name("水浸1-2").index(2).ip("192.168.0.140").port("6004").busId("2").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("99E9F8A1-000F-4224-94D4-98695DC46588")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood3 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("F6EB373A-E69C-4EE9-B5D3-4BC4B377FE84")
                        .name("水浸1-3").index(3).ip("192.168.0.140").port("6004").busId("3").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("F6EB373A-E69C-4EE9-B5D3-4BC4B377FE84")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood4 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("2AF3700A-BEBC-4CA6-89AE-D27F70232494")
                        .name("水浸1-4").index(4).ip("192.168.0.140").port("6004").busId("4").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("2AF3700A-BEBC-4CA6-89AE-D27F70232494")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood5 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("91F4B297-FD73-4514-A9F1-06A20104513E")
                        .name("水浸2-1").index(5).ip("192.168.0.140").port("6004").busId("5").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("91F4B297-FD73-4514-A9F1-06A20104513E")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood6 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("010847C1-264E-477E-8A03-53789526474E")
                        .name("水浸2-2").index(6).ip("192.168.0.140").port("6004").busId("6").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("010847C1-264E-477E-8A03-53789526474E")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood7 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("6AD85CB7-7E1F-4768-B798-E6F98D192610")
                        .name("水浸2-3").index(7).ip("192.168.0.140").port("6004").busId("7").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("6AD85CB7-7E1F-4768-B798-E6F98D192610")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood8 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("23B69B51-265C-4731-A43A-207A2DC2F7AF")
                        .name("水浸2-4").index(8).ip("192.168.0.140").port("6004").busId("8").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("23B69B51-265C-4731-A43A-207A2DC2F7AF")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood9 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("A2801D5A-9E62-437B-88B3-F646BD7567D6")
                        .name("水浸3-1").index(9).ip("192.168.0.140").port("6004").busId("9").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("A2801D5A-9E62-437B-88B3-F646BD7567D6")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood10 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("3B913045-0DC9-48DA-AA61-2D113D57AEC6")
                        .name("水浸3-2").index(10).ip("192.168.0.140").port("6004").busId("10").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("3B913045-0DC9-48DA-AA61-2D113D57AEC6")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood11 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("26496F68-563D-48E1-B73F-542F334A378A")
                        .name("水浸3-3").index(11).ip("192.168.0.140").port("6004").busId("11").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("26496F68-563D-48E1-B73F-542F334A378A")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood12 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("0ADCC097-5954-4A36-8999-C96529F316A6")
                        .name("水浸3-4").index(12).ip("192.168.0.140").port("6004").busId("12").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("0ADCC097-5954-4A36-8999-C96529F316A6")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood13 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("38069B8F-FC9F-4735-A409-2C07941EAFF3")
                        .name("水浸4-1").index(13).ip("192.168.0.140").port("6004").busId("13").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("38069B8F-FC9F-4735-A409-2C07941EAFF3")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood14 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("1CF1777F-73C8-431D-AC61-7298E7613B00")
                        .name("水浸4-2").index(14).ip("192.168.0.140").port("6004").busId("14").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("1CF1777F-73C8-431D-AC61-7298E7613B00")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood15 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("F06ED3A8-8BD4-446B-98B3-A744CB11EC22")
                        .name("水浸4-3").index(15).ip("192.168.0.140").port("6004").busId("15").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("F06ED3A8-8BD4-446B-98B3-A744CB11EC22")
                        .bubbleUrl("")
                        .deviceType(DeviceType.FLOOR)
                        .build())
                .build();
        PositionDevice flood16 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("8D04DDA1-C0EF-4517-873F-DF4C1DD6CE21")
                        .name("水浸4-4").index(16).ip("192.168.0.140").port("6004").busId("16").build())
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

    // 冷通道环境主机
    private static void initEmh(){
        PositionDevice channel1 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("4D2A9A3F-374C-4D42-8C2E-C55205D0717A")
                        .name("冷通道1").index(1).ip("192.168.0.140").port("6001").busId("1").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("4D2A9A3F-374C-4D42-8C2E-C55205D0717A")
                        .bubbleUrl("")
                        .deviceType(DeviceType.EMH)
                        .build())
                .build();
        PositionDevice channel2 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("00F04F8F-07D9-49BE-9C88-F8C78FFCCC9F")
                        .name("冷通道2").index(2).ip("192.168.0.140").port("6001").busId("2").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("00F04F8F-07D9-49BE-9C88-F8C78FFCCC9F")
                        .bubbleUrl("")
                        .deviceType(DeviceType.EMH)
                        .build())
                .build();
        PositionDevice channel3 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("6F6ECE56-369F-488C-8D1D-4B20035F10D6")
                        .name("冷通道3").index(3).ip("192.168.0.140").port("6001").busId("3").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("6F6ECE56-369F-488C-8D1D-4B20035F10D6")
                        .bubbleUrl("")
                        .deviceType(DeviceType.EMH)
                        .build())
                .build();
        PositionDevice channel4 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("590C11C8-E015-48AD-9F54-94D8DC18088B")
                        .name("冷通道4").index(4).ip("192.168.0.140").port("6001").busId("4").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("590C11C8-E015-48AD-9F54-94D8DC18088B")
                        .bubbleUrl("")
                        .deviceType(DeviceType.EMH)
                        .build())
                .build();
        List<PositionDevice> channelList = new ArrayList<>();
        channelList.add(channel1);
        channelList.add(channel2);
        channelList.add(channel3);
        channelList.add(channel4);
        data.put(DeviceType.EMH, channelList);
    }

    // PDU
    private static void initPdu(){
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
    private static void initUps(){
        List<PositionDevice> list = new ArrayList<>();
        PositionDevice ups1 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("6c9ceaff-014e-497a-98bd-227ed76f904b")
                        .name("ups").index(1).ip("192.168.0.140").port("6009").busId("1").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("6c9ceaff-014e-497a-98bd-227ed76f904b")
                        .bubbleUrl("")
                        .deviceType(DeviceType.GALAXY300)
                        .build())
                .build();
        list.add(ups1);
        data.put(DeviceType.GALAXY300, list);
    }

    // UPS hipulse
    private static void initHipulse(){
        List<PositionDevice> list = new ArrayList<>();
        PositionDevice ups1 = PositionDevice.builder()
                .collectorDevice(CollectorDevice.builder()
                        .deviceId("9991d432-a539-4c78-9aa6-245341d60dba")
                        .name("ups").index(1).ip("192.168.0.140").port("6009").busId("1").build())
                .deviceDetail(DeviceDetail.builder()
                        .deviceId("9991d432-a539-4c78-9aa6-245341d60dba")
                        .bubbleUrl("")
                        .deviceType(DeviceType.Hipulse)
                        .build())
                .build();
        list.add(ups1);
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

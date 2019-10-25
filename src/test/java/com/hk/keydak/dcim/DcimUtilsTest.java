package com.hk.keydak.dcim;

import com.hk.freemarker.dcim.enums.DeviceType;
import org.junit.Test;

import java.util.UUID;

/**
 * Created by HomKey on 2019/9/20.
 */
public class DcimUtilsTest {
    private static String INSERT_DEVICE_CATEGORY = "INSERT INTO [DeviceCategoryModel] ([CategoryId], [SensorName], [SensorDescription]) VALUES ('%s', '%s', N'%s');";

    @Test
    public void createUUID() {
        for (int i = 0; i < 10; i++) {
            System.out.println(UUID.randomUUID().toString());
        }
    }

    @Test
    public void testPositionString() {
        String[][] dataA = new String[][]{
                new String[]{"C9B4B282-F452-4F3C-B201-D78A46E787AD", "IT设备柜1-1"},
                new String[]{"48E7A878-FC78-44B5-89E1-E2B21A8BFC02", "IT设备柜1-2"},
                new String[]{"7020853F-ED88-4B02-B917-403A5CB978C7", "IT设备柜1-3"},
                new String[]{"7AAE9891-3CE4-4E65-A126-CFC8EF52C3D4", "IT设备柜1-4"},
                new String[]{"0780686D-F856-4E84-9394-50FE4A4605D7", "IT设备柜1-5"},
                new String[]{"0B9CC544-E5A3-4A09-A58C-C547EFC324E5", "IT设备柜1-6"},
                new String[]{"5DFFBE7C-72EF-47C9-8F0F-1A14DFDCA2A8", "IT设备柜1-7"},
                new String[]{"A8912311-80D1-449F-928D-B49CB0E6D926", "IT设备柜1-8"},
                new String[]{"8FAAED81-FB47-4F3F-B5A3-F5BF41E3B8F5", "IT设备柜1-9"},
                new String[]{"BFB0AC39-9714-418E-BEE4-F2FA2D9ECA5A", "IT设备柜1-10"},
                new String[]{"2459F9BE-1243-48BA-B880-B0FC25F8E19F", "IT设备柜1-11"},
                new String[]{"97438E6E-8536-4F32-B6E8-FA3B97C03157", "IT设备柜1-12"},
                new String[]{"FE812EE9-D094-4DF6-A5D8-0E60DE791E58", "网络布线柜1-1"}
        };
        String[][] dataB = new String[][]{
                new String[]{"285F8460-E30F-430B-ACAE-D8DD279513A5", "IT设备柜1-13"},
                new String[]{"9638FC50-FF0F-4AF9-BA11-42AFC36F8F9E", "IT设备柜1-14"},
                new String[]{"62375B3A-2C7E-4563-99EA-463866CD3E8D", "IT设备柜1-15"},
                new String[]{"75A177A0-70EC-4F30-8733-475656EDA1D8", "IT设备柜1-16"},
                new String[]{"9510E51A-2972-4EC0-9A15-E023BBACB311", "IT设备柜1-17"},
                new String[]{"EFDAE6C3-F6B8-4799-B501-1F8325FB4B91", "IT设备柜1-18"},
                new String[]{"95C6E42B-5B9D-4D36-8351-E021222F493E", "IT设备柜1-19"},
                new String[]{"70FF52B8-EBFC-42CA-AD03-0DB6320F9B5D", "IT设备柜1-20"},
                new String[]{"DAC3BB73-B3C7-43C2-B496-90FB7FCC99E2", "IT设备柜1-21"},
                new String[]{"68E3F111-4484-4FFB-852A-5E7445559113", "IT设备柜1-22"},
                new String[]{"7D02521A-FB19-4E21-B910-64E6B17CC7D8", "IT设备柜1-23"},
                new String[]{"8F396570-22C8-4D9E-ABA8-A818D1470B8C", "网络布线柜1-2"}
        };
        String[][] dataC = new String[][]{
                new String[]{"546AEA36-B12B-4F2A-8028-DB0CEC251428", "IT设备柜3-1"},
                new String[]{"AA7CFE0B-8632-4759-B449-9450943F8894", "IT设备柜3-2"},
                new String[]{"F8A54EA3-1E7F-40E3-8873-2EA80AE0AD55", "IT设备柜3-3"},
                new String[]{"FA011491-AE1F-4DCE-B0BF-171E82262707", "IT设备柜3-4"},
                new String[]{"AF205932-E18B-448C-8011-07731A86B848", "IT设备柜3-5"},
                new String[]{"AC1F4F13-48BA-4F4D-918E-22D6F4476AD6", "IT设备柜3-6"},
                new String[]{"8A45EC35-6B86-4A73-A0F8-2B85F433C579", "IT设备柜3-7"},
                new String[]{"00F3DAAA-B896-4180-B1C5-5EE5568083D9", "IT设备柜3-8"},
                new String[]{"47AA3D15-A3D5-4461-AA36-9E2C03C99CCA", "IT设备柜3-9"},
                new String[]{"CB4B594E-A5C1-4421-9E72-C262C4931E26", "IT设备柜3-10"},
                new String[]{"6FCC0C2E-CBE0-4F15-B42C-C81BA5B60091", "IT设备柜3-11"},
                new String[]{"F025EA72-36FA-4FC2-BF94-C215396D3321", "IT设备柜3-12"}
        };
        String[][] dataD = new String[][]{
                new String[]{"CA141287-94E1-48F8-AA04-5C26B1D494FE", "IT设备柜3-13"},
                new String[]{"D69BA379-170D-4362-95AD-5D0BFB19CC4A", "IT设备柜3-14"},
                new String[]{"CB36D5DE-BAA7-402E-9FB9-F6A3A1A559D3", "IT设备柜3-15"},
                new String[]{"8377F7BD-E84D-48A3-A47F-2C2823BDC1F4", "IT设备柜3-16"},
                new String[]{"7B825B0A-D977-474D-85E8-0F5C52080789", "IT设备柜3-17"},
                new String[]{"AE7DC72E-A41A-4A27-BE26-1139F3EDCCE9", "IT设备柜3-18"},
                new String[]{"DF32F25F-8DB2-41B3-A8BD-824298DC20C3", "IT设备柜3-19"},
                new String[]{"4F093127-E44D-4387-AD8B-8B30127FFC06", "IT设备柜3-20"},
                new String[]{"F994CE60-C136-49C5-A724-FA1106602D95", "IT设备柜3-21"},
                new String[]{"B8F60DC6-F4AD-46D2-8E5F-FD27EBADD785", "IT设备柜3-22"},
                new String[]{"C4F4C7C2-B132-4E90-B351-AA17739E290B", "网络机柜3-1"},
                new String[]{"0B9E9F22-8E9D-492D-A822-32C2A5AA57AC", "IT设备柜3-23"}
        };
        String[][] dataE = new String[][]{
                new String[]{"6C1322FE-3F82-42C1-AE5A-7870DEDA1045", "IT设备柜2-1"},
                new String[]{"FB5CE90D-E067-4D5E-A292-886AEB46D5AA", "IT设备柜2-2"},
                new String[]{"48364BCA-1991-47C8-99C1-6CAC6B655412", "IT设备柜2-3"},
                new String[]{"DDC60E0A-1BAB-4B0A-92E0-086F2590592A", "IT设备柜2-4"},
                new String[]{"DD135839-5A79-4287-ADA3-8FAA1A8AD164", "IT设备柜2-5"},
                new String[]{"E4051D57-F2C1-43C6-95E0-A7B67CF10939", "IT设备柜2-6"},
                new String[]{"08B3AAAB-64EA-4C76-A9A5-422131A2978E", "IT设备柜2-7"},
                new String[]{"B359EA2D-AACF-4680-A742-049DF2D8D0BD", "IT设备柜2-8"},
                new String[]{"0FE8CFDB-2B9C-41EB-96E4-33DC6E180E5E", "IT设备柜2-9"},
                new String[]{"78338F07-A208-4782-B7AD-3F14319C5962", "IT设备柜2-10"},
                new String[]{"0FCC7239-65CA-45BF-A39F-C6897FAD9D18", "IT设备柜2-11"},
                new String[]{"2FB49C27-7A5F-4817-BC2E-729ACA82F41D", "IT设备柜2-12"},
                new String[]{"47AF993D-0997-4992-9D27-75D4B3FC9C42", "IT设备柜2-13"},
                new String[]{"3089E479-A0BF-4B14-8C1F-5B3947519D20", "IT设备柜2-14"},
                new String[]{"36255D43-B1FD-48A7-B0AD-3FC8752832E0", "网络布线过2-1"}
        };
        String[][] dataF = new String[][]{
                new String[]{"EF8ACE23-033C-407E-89AD-35A8BB7D1ADB", "IT设备柜2-15"},
                new String[]{"F5E60BBB-14DC-4FAD-B1B7-5ECEAE2DB0F1", "IT设备柜2-16"},
                new String[]{"AD433C4C-8ECD-4ACA-BABB-31ABFEC4B57E", "IT设备柜2-17"},
                new String[]{"DD6CE302-C696-4615-98BF-FB0C5BC2AC08", "IT设备柜2-18"},
                new String[]{"E57C0E81-EF7D-4B38-969F-937AEFA270C0", "IT设备柜2-19"},
                new String[]{"62891072-3C60-46E9-A39A-B626ED521A28", "IT设备柜2-20"},
                new String[]{"4C4D5CAE-0D7E-40FC-A062-71EBF5AE783E", "IT设备柜2-21"},
                new String[]{"FAA564BA-DB56-4924-9800-A26C6A49F885", "IT设备柜2-22"},
                new String[]{"65595730-3821-4613-91DC-DD8BA6E80207", "IT设备柜2-23"},
                new String[]{"58796E71-62D8-48A0-9834-A34D01F6DCE1", "IT设备柜2-24"},
                new String[]{"E2277C13-D5C5-4C41-BFCD-B7A3F12ADDBF", "IT设备柜2-25"},
                new String[]{"39029813-0D85-405A-9574-80663E83F747", "IT设备柜2-26"},
                new String[]{"E9193D75-FB01-4F64-8AC7-DCBE436EC1A4", "IT设备柜2-27"},
                new String[]{"FC6E666F-F10D-4A33-AFF1-1F7B13E616BB", "网络布线柜2-2"}
        };
        String[][] dataG = new String[][]{
                new String[]{"4F280708-7D3D-4DAE-A291-60C37ABAD25D", "IT设备柜4-1"},
                new String[]{"19029C64-EEE9-4B59-980A-3DA0D4D0F785", "IT设备柜4-2"},
                new String[]{"2CBC6000-98D2-4144-97F0-6B4AC79D36CC", "IT设备柜4-3"},
                new String[]{"45987D60-503E-4DFF-942C-88D3B3A7898D", "IT设备柜4-4"},
                new String[]{"C5FD9FDB-0C52-4D78-8BAE-8D40C78B4E76", "IT设备柜4-5"},
                new String[]{"16DEFEB1-7F6C-43F1-81A8-15B1AE7EFBAB", "IT设备柜4-6"},
                new String[]{"5329691A-38D9-4E16-B84B-42052CE462EE", "IT设备柜4-7"},
                new String[]{"D900C243-1D69-465C-AA21-98B4B8805817", "IT设备柜4-8"},
                new String[]{"D49865F2-1643-4F30-825A-E113649B64AE", "IT设备柜4-9"},
                new String[]{"AF91AE20-95BC-4206-88A1-62BC502D136F", "IT设备柜4-10"},
                new String[]{"E4F6C480-1C4B-495E-AF4F-D3391ACDF34E", "IT设备柜4-11"},
                new String[]{"2C8154AF-B5D8-4EFA-8926-961FB540B692", "IT设备柜4-12"},
                new String[]{"29F063B3-5057-45A5-9C1B-98BAD73487A5", "IT设备柜4-13"},
                new String[]{"47FD2FDA-42CB-4BFB-9233-AED1D66CD634", "IT设备柜4-14"}
        };
        String[][] dataH = new String[][]{
                new String[]{"3975C3DA-3B7F-4E64-92EC-1638817254D3", "IT设备柜4-15"},
                new String[]{"58CEC0FF-BF66-41EC-9FBE-9E6858C5A006", "IT设备柜4-16"},
                new String[]{"2898164F-5898-4808-BB4A-0F11DD8248FC", "IT设备柜4-17"},
                new String[]{"CB0B7CD5-082D-4BA5-9708-5202982928B5", "IT设备柜4-18"},
                new String[]{"8A5C2149-F481-4E86-8DCA-6240DC0618EC", "IT设备柜4-19"},
                new String[]{"166180B4-AA86-4700-8402-6F9FBE5576A9", "IT设备柜4-20"},
                new String[]{"2322E3EE-556E-42EA-AEE3-83FEFE4B4E21", "IT设备柜4-21"},
                new String[]{"9A347CAD-A4F5-4933-85AD-FB63E6BC74B4", "IT设备柜4-22"},
                new String[]{"2FA72CC1-3372-47A9-9CE5-8E2E2E94CDB3", "IT设备柜4-23"},
                new String[]{"4A80F967-29FD-435D-9B3F-484092D43612", "网络机柜4-1"},
                new String[]{"40D5EA7C-F9AE-4CAA-8142-BDC23E92A9E4", "IT设备柜4-24"},
                new String[]{"7078976B-B613-4A05-937D-EE09004A5D6D", "IT设备柜4-25"},
                new String[]{"5310599A-ECA7-46B9-8E71-C4B4E119105F", "IT设备柜4-26"},
                new String[]{"A92C7C22-21A4-4C94-8FF2-BDE3A13B53E0", "IT设备柜4-27"}
        };
        int index = 0;
        int busId = 0;
        index = print(dataA, "pduA", 1, "192.168.0.140", "6003", busId);
        busId += index;
        index = print(dataB, "pduB", index + 1, "192.168.0.140", "6003", busId);
        busId += index;
//        index = print(dataC, "pduC",index + 1,"192.168.0.140", "6003", busId);
//        busId += index;
//        index = print(dataD, "pduD",index + 1,"192.168.0.140", "6003", busId);
//        busId += index;
//        index = print(dataE, "pduE",index + 1,"192.168.0.140", "6003", busId);
//        busId += index;
//        index = print(dataF, "pduF",index + 1,"192.168.0.140", "6003", busId);
//        busId += index;
//        index = print(dataG, "pduG",index + 1,"192.168.0.140", "6003", busId);
//        busId += index;
//        index = print(dataH, "pduH",index + 1,"192.168.0.140", "6003", busId);
    }

    @Test
    public void testZlTh() {
        String[][] data = new String[][]{
                new String[]{"4c073df9-e7f5-45c4-b8a9-58fa45a200aa", "温湿度传感器1"},
                new String[]{"aa9c72b3-116a-4d5b-a09f-7043d292ef25", "温湿度传感器2"},
                new String[]{"b685cb4b-db01-4490-9686-fcc365cca504", "温湿度传感器3"},
                new String[]{"cbec977b-fbb9-4788-a0b5-c5b7a5c6a480", "温湿度传感器4"},
                new String[]{"2ab5433f-c5de-4194-95ed-b873328c5421", "温湿度传感器5"},
                new String[]{"1203e964-075d-458a-a0bb-0e5fbb0f7fe8", "温湿度传感器6"},
                new String[]{"73912b35-a9d7-432d-a02e-28509025ad40", "温湿度传感器7"},
                new String[]{"d38e5011-932b-463d-ad9e-083bc3b2559e", "温湿度传感器8"},
                new String[]{"1b745ea8-ba18-4cde-9185-504fc0333d2d", "温湿度传感器9"},
                new String[]{"054698ad-1e07-4615-8b67-8d44ece875a5", "温湿度传感器10"},
                new String[]{"5b54077a-2290-498e-bc18-4db58acce3ac", "温湿度传感器11"},
                new String[]{"38fd8694-5494-49ef-9117-9f9cc83e7162", "温湿度传感器12"}
        };
        print(data, "th", 1, "192.168.0.140", "6003", 1);

    }

    @Test
    public void testInsertDeviceCategory() {
        String[][] data = new String[][]{
                new String[]{"告警状态:0未知状态，2没有告警，4存在告警警报，8存在严重告警", "UPS.Alert.Status"},
                new String[]{"输出没有通电", "UPS.Alert.OutPut.NotPowered"},
                new String[]{"逆变器没有被使用", "UPS.Alert.Inverter.NotUsed"},
                new String[]{"硬件内部存在错误", "UPS.Alert.Internal.Hardware.ExistsFault"},
                new String[]{"打开电池电源，以响应输入电源问题", "UPS.Battery.Usage.Status"},
                new String[]{"电池过低告警", "UPS.Alert.Battery.Low.Warning"},
                new String[]{"电量过低，Ups处于关机状态", "UPS.Alert.Battery.Low.Shutdown"},
                new String[]{"旁路交流输入被用作电源", "UPS.Alert.Bypass.ACInput.ForPower"},
                new String[]{"ModBus数据无效", "UPS.Alert.ModBusData.Not.Valid"},
                new String[]{"串口通讯存在故障", "UPS.Alert.Communication.Fault"},
                new String[]{"输出过载", "UPS.Alert.OutPut.OverLoad"},
                new String[]{"紧急按停", "UPS.Alert.Emergency.Stop"},
                new String[]{"温度故障", "UPS.Alert.Temperature.Fault"},
                new String[]{"电池要检查或外部电池监控故障", "UPS.Alert.Battery.CheckedOrExternalMonitor.Fault"},
                new String[]{"通风设备故障(系统级风机存在故障)", "UPS.Alert.Device.Ventilation.Fault"},
                new String[]{"负载报警故障", "UPS.Alert.Load.Alarm.Violation.Fault"},
                new String[]{"0 -功率转换器目前工作在自动测距 1 -功率转换器目前工作在变频器上", "UPS.Run.In.Frequency.Converter"},
                new String[]{"整流内部故障", "UPS.Alert.Rectifier.Internal.Fault"},
                new String[]{"由于良好电源模块的数量减少，负载保护丢失", "UPS.Alert.LoadProtected.Lose"},
                new String[]{"0-UPS未处于节能模式（效率提升模式）1-UPS以省电模式（EBM）运行", "UPS.Saving.Mode.Status"},
                new String[]{"UPS环境故障或UPS小故障", "UPS.Alert.Environment.Fault"},
                new String[]{"0-UPS未处于ECO模式 1-UPS在ECO模式下运行", "UPS.ECO.Mode.Status"},
                new String[]{"安装电池状态", "UPS.Installed.Battery.Status"},
                new String[]{"电池测试失败(错误)", "UPS.Alert.Battery.Test.Result"},
                new String[]{"电池进行测试中", "UPS.Battery.Test.InProgress"},
                new String[]{"内部电池温度超过临界阈值", "UPS.Alert.Internal.Battery.Temperature.Over"},
                new String[]{"电池开关关闭", "UPS.Alert.Battery.Switch"},
                new String[]{"主交流开关关闭", "UPS.Alert.Main.AC.Switch"},
                new String[]{"主交流不正常/电压超出范围", "UPS.Alert.Main.AC.Voltage.NotOk"},
                new String[]{"主交流故障", "UPS.Alert.Main.AC.Fuse"},
                new String[]{"主交流频率超出范围", "UPS.Alert.Main.AC.Frequency.OutRange"},
                new String[]{"输入触点1存在故障", "UPS.Alert.Input.Contact.1.Fault"},
                new String[]{"输入触点2存在故障", "UPS.Alert.Input.Contact.2.Fault"},
                new String[]{"电源模块冗余丢失", "UPS.Alert.Power.Modules.Redundancy.Lost"},
                new String[]{"K2S存在故障", "UPS.Alert.K2S.Fault"},
                new String[]{"K2S开关状态", "UPS.K2S.Switch.Status"},
                new String[]{"存在重叠转移故障", "UPS.Alert.Overlap.Transfer.Fault"},
                new String[]{"维修旁路状态", "UPS.Maintenance.Bypass.Status"},
                new String[]{"旁路输入功率过载", "UPS.Alert.Bypass.InputPower.OverLoad"},
                new String[]{"旁路输入存在热过载", "UPS.Alert.Bypass.Input.Thermal.OverLoad"},
                new String[]{"旁路开关处于故障状态", "UPS.Alert.Bypass.Switch.Fault"},
                new String[]{"旁路频率超出范围", "UPS.Alert.Bypass.Frequency.OverRange"},
                new String[]{"旁路电压超出范围", "UPS.Alert.Bypass.Voltage.OverRange"},
                new String[]{"旁路开关状态", "UPS.Bypass.Switch.Status"},
                new String[]{"旁路内部故障引起的硬件故障(保险丝、继电器、…)", "UPS.Alert.Bypass.Internal.HardWare.Fault"},
                new String[]{"0 - Ups与交流旁路同步 1-Ups与交流旁路不同步", "UPS.InverterAndAC.Bypass.DeSynchronisation.Status"},
                new String[]{"输出开关关闭", "UPS.Alert.Output.Switch.Status"},
                new String[]{"输入触点1开闭", "UPS.Input.Contact.1.Status"},
                new String[]{"输入触点2开闭", "UPS.Input.Contact.2.Status"},
                new String[]{"输入触点1COSIT开闭", "UPS.Input.Contact.1.COSIT.Status"},
                new String[]{"输入触点2COSIT开闭", "UPS.Input.Contact.2.COSIT.Status"},
                new String[]{"输入触点3COSIT开闭", "UPS.Input.Contact.3.COSIT.Status"},
                new String[]{"输入触点4COSIT开闭", "UPS.Input.Contact.4.COSIT.Status"},
                new String[]{"充电器故障导致硬件故障", "UPS.Alert.Charge.Hardware.Fault"},
                new String[]{"1-电池充电", "UPS.Battery.Charge.Status"},
                new String[]{"1-EBM模式功能是可用的", "UPS.EBM.Setting.Status"},
                new String[]{"1-ECO模式功能是可用的", "UPS.ECO.Setting.Status"},
                new String[]{"1-定时ECO模式功能是可用的", "UPS.ECO.Scheduling.Setting.Status"},
                new String[]{"逆变器故障", "UPS.Alert.Inverter.Major.Fault"},
                new String[]{"逆变器过载", "UPS.Alert.Inverter.OverLoad"},
                new String[]{"逆变器热过载", "UPS.Alert.Inverter.Thermal.OverLoad"},
                new String[]{"0 -无电流限制 1 -电流限制", "UPS.Inverter.Limitation.Status"},
                new String[]{"0-没有保险丝或保险丝关闭 1 -保险丝打开", "UPS.Fuse.Fault.Status"},
                new String[]{"短路故障", "UPS.Alert.Short.CirCult.Fault"},
                new String[]{"启用ECO模式的时间", "UPS.ECO.Time.Since.Commissioning"},
                new String[]{"重置后启用ECO模式的时间", "UPS.ECO.Time.Since.Reset"},
                new String[]{"调试ECO后的在线时间", "UPS.Time.OnLine.Since.Commissioning.ECO"},
                new String[]{"重置ECO后的联机时间", "Time.OnLine.Since.Reset.ECO"},
                new String[]{"自试运行以来在ECO上运行的时间百分比", "UPS.Spent.Time.On.ECO.Running"},
                new String[]{"重置后在ECO上运行的时间百分比", "UPS.Spent.Time.On.ECO.Reset.Running"},
                new String[]{"在ECO模式下运行的时间", "UPS.NumberTime.Running.In.ECO"},
                new String[]{"每月ECO模式时间", "Monthly.Time.In.ECO"},
                new String[]{"启用PSM模式的时间", "PSM.Time.Since.Commissioning"},
                new String[]{"重置后启用PSM模式的时间", "UPS.PSM.Time.Since.Reset"},
                new String[]{"调试PSM后的在线时间", "UPS.Time.OnLine.Since.Commissioning.PSM"},
                new String[]{"重置PSM后的联机时间", "UPS.Time.OnLine.Since.Reset.PSM"},
                new String[]{"自试运行以来在PSM上运行的时间百分比", "UPS.Spent.Time.On.PSM.Running"},
                new String[]{"重置后在PSM上运行的时间百分比", "UPS.Spent.Time.On.PSM.Reset.Running"},
                new String[]{"在PSM模式下运行的时间", "UPS.NumberTime.Running.In.PSM"},
                new String[]{"每月PSM模式时间", "UPS. Monthly.Time.In.PSM"},
                new String[]{"", "UPS.NumberOfG7000.In.PSM"},
                new String[]{"", "UPS.Mains.Input.Phase1.Current"},
                new String[]{"", "UPS.Mains.Input.Phase2.Current"},
                new String[]{"", "UPS.Mains.Input.Phase3.Current"},
                new String[]{"", "UPS.Bypass.Input.Phase1.Current"},
                new String[]{"", "UPS.Bypass.Input.Phase2.Current"},
                new String[]{"", "UPS.Bypass.Input.Phase3.Current"},
                new String[]{"", "UPS.Output.Phase1.Current"},
                new String[]{"", "UPS.Output.Phase2.Current"},
                new String[]{"", "UPS.Output.Phase3.Current"},
                new String[]{"", "UPS.Battery.Current"},
                new String[]{"电源输入1至2相电压", "UPS.Mains.Input.Phase1ToPhase2.Voltage"},
                new String[]{"电源输入2至3相电压", "UPS.Mains.Input.Phase2ToPhase3.Voltage"},
                new String[]{"电源输入3至1相电压", "UPS.Mains.Input.Phase3ToPhase1.Voltage"},
                new String[]{"", "UPS.Bypass.Input.Phase1ToNeutral.Voltage"},
                new String[]{"", "UPS.Bypass.Input.Phase2ToNeutral.Voltage"},
                new String[]{"", "UPS.Bypass.Input.Phase3ToNeutral.Voltage"},
                new String[]{"旁路输入1至2相电压", "UPS.Bypass.Input.Phase1ToPhase2.Voltage"},
                new String[]{"旁路输入2至3相电压", "UPS.Bypass.Input.Phase2ToPhase3.Voltage"},
                new String[]{"旁路输入3至1相电压", "UPS.Bypass.Input.Phase3ToPhase1.Voltage"},
                new String[]{"", "UPS.Output.Phase1ToNeutral.Voltage"},
                new String[]{"", "UPS.Output.Phase2ToNeutral.Voltage"},
                new String[]{"", "UPS.Output.Phase3ToNeutral.Voltage"},
                new String[]{"", "UPS.Output.Phase1ToPhase2.Voltage"},
                new String[]{"", "UPS.Output.Phase2ToPhase3.Voltage"},
                new String[]{"", "UPS.Output.Phase3ToPhase1.Voltage"},
                new String[]{"", "UPS.Temperature.In.DegF"},
                new String[]{"", "UPS.Temperature.In.DegC"},
                new String[]{"", "UPS.Battery.Voltage"},
                new String[]{"", "UPS.OutPut.Phase1.ActivePower"},
                new String[]{"", "UPS.OutPut.Phase2.ActivePower"},
                new String[]{"", "UPS.OutPut.Phase3.ActivePower"},
                new String[]{"", "UPS.OutPut.Phase1.ApparentPower"},
                new String[]{"", "UPS.OutPut.Phase2.ApparentPower"},
                new String[]{"", "UPS.OutPut.Phase3.ApparentPower"},
                new String[]{"", "UPS.Total.Output.ActivePower"},
                new String[]{"", "UPS.Total.Output.ApparentPower"},
                new String[]{"", "UPS.Total.Output.PercentLoad"},
                new String[]{"", "UPS.Output.Phase1.Peak.Factor"},
                new String[]{"", "UPS.Output.Phase2.Peak.Factor"},
                new String[]{"", "UPS.Output.Phase3.Peak.Factor"},
                new String[]{"", "UPS.Output.Power.Factor"},
                new String[]{"", "UPS.Mains.Input.Frequency"},
                new String[]{"", "UPS.Bypass.Input.Frequency"},
                new String[]{"", "UPS.Output.Frequency"},
                new String[]{"", "UPS.Output.Phase1.Power.Factor"},
                new String[]{"", "UPS.Output.Phase2.Power.Factor"},
                new String[]{"", "UPS.Output.Phase3.Power.Factor"},
                new String[]{"电池剩余运行时间（分钟）", "UPS.Battery.Remain.Runtime"},
                new String[]{"电池温度（℃）", "UPS.Battery.Temperature"},
                new String[]{"电池剩余容量（％）", "UPS.Battery.Remain.Capacity"},
                new String[]{"", "UPS.Mains.Input.Phase1ToNeutral.Voltage"},
                new String[]{"", "UPS.Mains.Input.Phase2ToNeutral.Voltage"},
                new String[]{"", "UPS.Mains.Input.Phase3ToNeutral.Voltage"},
                new String[]{"电池总数", "UPS.Total.NumberOfBatteries.Count"},
                new String[]{"电池总容量", "UPS.Total.Battery.Capacity"},
                new String[]{"", "UPS.Battery.Temperature.DebugF"},
                new String[]{"", "UPS.UIO.SensorPort1.Temperature.DegF"},
                new String[]{"UIO传感器端口1最大温度阈值In DegF", "UPS.UIO.SensorPort1.MaxTemperature.DegF"},
                new String[]{"UIO传感器端口1最小温度阈值 In DegF", "UPS.UIO.SensorPort1.MinTemperature.DegF"},
                new String[]{"", "UPS.UIO.SensorPort1.Temperature.DegC"},
                new String[]{"UIO传感器端口1最大温度阈值In DegC", "UPS.UIO.SensorPort1.MaxTemperature.DegC"},
                new String[]{"UIO传感器端口1最小温度阈值 In DegC", "UPS.UIO.SensorPort1.MinTemperature.DegC"},
                new String[]{"", "UPS.UIO.SensorPort1.Humidity"},
                new String[]{"UIO传感器端口1最大湿度阈值", "UPS.UIO.SensorPort1.MaxHumidity"},
                new String[]{"UIO传感器端口1最小湿度阈值", "UPS.UIO.SensorPort1.MinHumidity"},
                new String[]{"", "UPS.Nominal.Output.ApparentPower"},
                new String[]{"", "UPS.Number.In.Parallel.Installation"},
                new String[]{"标称电池备用时间(分钟)", "UPS.Nominal.Battery.Backup.Time"},
                new String[]{"标称电池电压", "UPS.Nominal.Battery.Voltage"}
        };
        for (String[] aData : data) {
            String sql = String.format(INSERT_DEVICE_CATEGORY, "4574715A-3829-4BA0-B119-5F51D37EC707", aData[1], aData[0]);
            System.out.println(sql);
        }
    }

    private static String POSITION_DEVICE_STRING = "PositionDevice %s = PositionDevice.builder()\n" +
            "        .collectorDevice(CollectorDevice.builder()\n" +
            "                .deviceId(\"%s\")\n" +
            "                .name(\"%s\").index(%s).ip(\"%s\").port(\"%s\").busId(\"%s\").build())\n" +
            "        .deviceDetail(DeviceDetail.builder()\n" +
            "                .deviceId(\"%s\")\n" +
            "                .bubbleUrl(\"\")\n" +
            "                .deviceType(DeviceType.TH_ZL)\n" +
            "                .build())\n" +
            "        .build();\n" +
            "        list.add(%s);\n";

    private int print(String[][] data, String name, int index, String ip, String port, int busIdStart) {
        for (String[] aData : data) {
            busIdStart += 1;
            String deviceId = aData[0];
            String str = String.format(POSITION_DEVICE_STRING,
                    name + "" + index,
                    deviceId,
                    name + "-" + index,
                    index + "",
                    ip,
                    port,
                    busIdStart,
                    deviceId,
                    name + "" + index);
            System.out.println(str);
            index += 1;
        }
        return index;
    }


    @Test
    public void testPrint() {
        int index = 8;
        for (int i = 1; i <= 15; i++) {
            String temp = "<SensorDefine>\n" +
                    "                <name>EMH." + i + ".Magnetometer1.Access.State</name>\n" +
                    "                <registerIndex>" + index + "</registerIndex>\n" +
                    "                <scale>0</scale>\n" +
                    "                <isMean>false</isMean>\n" +
                    "                <commandName>Modbus_CAEMH_DI_d${object.index}</commandName>\n" +
                    "                <divider>1.0</divider>\n" +
                    "            </SensorDefine>\n" +
                    "            <SensorDefine>\n" +
                    "                <name>EMH." + i + ".Magnetometer2.Access.State</name>\n" +
                    "                <registerIndex>" + (index + 1) + "</registerIndex>\n" +
                    "                <scale>0</scale>\n" +
                    "                <isMean>false</isMean>\n" +
                    "                <commandName>Modbus_CAEMH_DI_d${object.index}</commandName>\n" +
                    "                <divider>1.0</divider>\n" +
                    "            </SensorDefine>\n" +
                    "            <SensorDefine>\n" +
                    "                <name>EMH." + i + ".Water.Access.State</name>\n" +
                    "                <registerIndex>" + (index + 2) + "</registerIndex>\n" +
                    "                <scale>0</scale>\n" +
                    "                <isMean>false</isMean>\n" +
                    "                <commandName>Modbus_CAEMH_DI_d${object.index}</commandName>\n" +
                    "                <divider>1.0</divider>\n" +
                    "            </SensorDefine>\n" +
                    "            <SensorDefine>\n" +
                    "                <name>EMH." + i + ".Smoke.Access.State</name>\n" +
                    "                <registerIndex>" + (index + 3) + "</registerIndex>\n" +
                    "                <scale>0</scale>\n" +
                    "                <isMean>false</isMean>\n" +
                    "                <commandName>Modbus_CAEMH_DI_d${object.index}</commandName>\n" +
                    "                <divider>1.0</divider>\n" +
                    "            </SensorDefine>\n" +
                    "            <SensorDefine>\n" +
                    "                <name>EMH." + i + ".TH1.Access.State</name>\n" +
                    "                <registerIndex>" + (index + 4) + "</registerIndex>\n" +
                    "                <scale>0</scale>\n" +
                    "                <isMean>false</isMean>\n" +
                    "                <commandName>Modbus_CAEMH_DI_d${object.index}</commandName>\n" +
                    "                <divider>1.0</divider>\n" +
                    "            </SensorDefine>\n" +
                    "            <SensorDefine>\n" +
                    "                <name>EMH." + i + ".TH2.Access.State</name>\n" +
                    "                <registerIndex>" + (index + 5) + "</registerIndex>\n" +
                    "                <scale>0</scale>\n" +
                    "                <isMean>false</isMean>\n" +
                    "                <commandName>Modbus_CAEMH_DI_d${object.index}</commandName>\n" +
                    "                <divider>1.0</divider>\n" +
                    "            </SensorDefine>\n" +
                    "            <SensorDefine>\n" +
                    "                <name>EMH." + i + ".TH3.Access.State</name>\n" +
                    "                <registerIndex>" + (index + 6) + "</registerIndex>\n" +
                    "                <scale>0</scale>\n" +
                    "                <isMean>false</isMean>\n" +
                    "                <commandName>Modbus_CAEMH_DI_d${object.index}</commandName>\n" +
                    "                <divider>1.0</divider>\n" +
                    "            </SensorDefine>\n" +
                    "            <SensorDefine>\n" +
                    "                <name>EMH." + i + ".TH4.Access.State</name>\n" +
                    "                <registerIndex>" + (index + 7) + "</registerIndex>\n" +
                    "                <scale>0</scale>\n" +
                    "                <isMean>false</isMean>\n" +
                    "                <commandName>Modbus_CAEMH_DI_d${object.index}</commandName>\n" +
                    "                <divider>1.0</divider>\n" +
                    "            </SensorDefine>\n" +
                    "            <SensorDefine>\n" +
                    "                <name>EMH." + i + ".Magnetometer1.State</name>\n" +
                    "                <registerIndex>" + (index + 8) + "</registerIndex>\n" +
                    "                <scale>0</scale>\n" +
                    "                <isMean>false</isMean>\n" +
                    "                <commandName>Modbus_CAEMH_DI_d${object.index}</commandName>\n" +
                    "                <divider>1.0</divider>\n" +
                    "            </SensorDefine>\n" +
                    "            <SensorDefine>\n" +
                    "                <name>EMH." + i + ".Magnetometer2.State</name>\n" +
                    "                <registerIndex>" + (index + 9) + "</registerIndex>\n" +
                    "                <scale>0</scale>\n" +
                    "                <isMean>false</isMean>\n" +
                    "                <commandName>Modbus_CAEMH_DI_d${object.index}</commandName>\n" +
                    "                <divider>1.0</divider>\n" +
                    "            </SensorDefine>\n" +
                    "            <SensorDefine>\n" +
                    "                <name>EMH." + i + ".Water.State</name>\n" +
                    "                <registerIndex>" + (index + 10) + "</registerIndex>\n" +
                    "                <scale>0</scale>\n" +
                    "                <isMean>false</isMean>\n" +
                    "                <commandName>Modbus_CAEMH_DI_d${object.index}</commandName>\n" +
                    "                <divider>1.0</divider>\n" +
                    "            </SensorDefine>\n" +
                    "            <SensorDefine>\n" +
                    "                <name>EMH." + i + ".Smoke.State</name>\n" +
                    "                <registerIndex>" + (index + 11) + "</registerIndex>\n" +
                    "                <scale>0</scale>\n" +
                    "                <isMean>false</isMean>\n" +
                    "                <commandName>Modbus_CAEMH_DI_d${object.index}</commandName>\n" +
                    "                <divider>1.0</divider>\n" +
                    "            </SensorDefine>\n" +
                    "            <SensorDefine>\n" +
                    "                <name>EMH." + i + ".Connect.State</name>\n" +
                    "                <registerIndex>" + (index + 12) + "</registerIndex>\n" +
                    "                <scale>0</scale>\n" +
                    "                <isMean>false</isMean>\n" +
                    "                <commandName>Modbus_CAEMH_DI_d${object.index}</commandName>\n" +
                    "                <divider>1.0</divider>\n" +
                    "            </SensorDefine>";
            index += 13;
            System.out.println(temp);
        }
    }
}

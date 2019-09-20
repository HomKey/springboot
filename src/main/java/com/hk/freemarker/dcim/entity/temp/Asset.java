package com.hk.freemarker.dcim.entity.temp;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LuHj on 2019/4/16.
 */
@Data
@Builder
public class Asset {
    private String deviceId;
    private String name = "资产";
    private String index;
    private String ip;
    private String port;
    private String busId;

    public static List<Asset> getConfig(){
//        资产管理左采集IP: 71.30.0.120
//        资产管理右采集IP: 71.30.0.121
        List<Asset> list = new ArrayList<>();
        String[] leftDeviceId = new String[]{
                "F41A630F-0C29-4ECB-B338-FA9A6AE1EA5A",
                "00FAC07A-14E7-4616-AAE6-E854F9A1547E",
                "2807FB22-26A8-4106-8738-E0892985F66F",
                "3CAAD14B-A028-4FCC-9E62-DFEFFEF72CBC",
                "34AFBB59-499E-44B1-92DD-DEDC2878E7C9",
                "3A061EF4-39B5-48B4-A2CC-D977E9A91CE2",
                "0DC2948C-81EB-4186-94E9-D51995B3F517",
                "AECDE9E9-1BC8-4D08-8C49-CDFB8DA0FB5F",
                "55C7F711-43D3-4AFD-B2BE-C7E4B5A97ED3",
                "915201EA-586F-4F47-AF78-BFE42F1DF18C",
                "745A2231-E9B7-4E65-8D17-BE153FE6A5BD",
                "AB02A476-3623-488E-9FC3-B8D11CF57ABF",
                "030AEF11-A723-4BF8-ACC8-B6C97DAEEFD1",
                "BC080E4A-67AD-43C3-B3E1-AFE45D43183D",
                "0869881E-7698-4694-8E7E-A602B68E3A03",
                "6F699C32-928A-44B2-84C3-9840D410441E",
                "E6242F03-ED00-46E0-89FC-97BFA6404DF7"
        };
        for (int i = 1; i <= 17; i++) {
            Asset asset = Asset.builder().index(String.valueOf(i)).deviceId(leftDeviceId[i-1])
                    .ip("71.30.0.120").port("6001").busId(String.valueOf(i)).build();
            list.add(asset);
        }
//        PDU右采集IP: 71.30.0.119
        String[] rightDeviceId = new String[]{
                "04106600-2F85-4EA0-9772-741AA2ABFEF5",
                "B283FD84-D2B3-44D6-A4B0-6F26FF22AB04",
                "5ABE2785-61A9-49C5-96BB-6A9037740601",
                "070110EF-A16E-4A33-B1C4-598BF763D034",
                "27764C77-B676-4AE4-9E1D-55F5E18B8EF5",
                "1AA411F4-4902-4E09-8070-53EA1C4E57BE",
                "1855A5E3-4D63-43B0-AA93-50B70163B7D6",
                "FF460748-BC01-4305-96FF-49A21257E1C8",
                "D71194FD-CC8C-4F39-9300-4173A7CD041D",
                "C3C896CB-1755-434B-AF83-2F0DA5838F22",
                "D2DF1F59-6B37-4D62-82A3-27FCB2E5BC04",
                "FA0AEF6B-2700-4752-ABB5-11B5A0A9BDBB",
                "E272E1B3-879D-4545-AF23-0A9EA9332BA5",
                "6D9D1FDD-C1FB-4D2C-9794-03226F5B228A",
                "5D9D1FDD-C1FB-4D2C-9794-03226F5B228A",
                "5D9D1FDD-C1FB-4D2C-9794-03226F5B2201",
                "F873B701-E70F-4C6B-9C19-02C2E194E23C"
        };
        for (int i = 18; i <= 34; i++) {
            Asset asset = Asset.builder().index(String.valueOf(i)).deviceId(rightDeviceId[i-18])
                    .ip("71.30.0.121").port("6001").busId(String.valueOf(i)).build();
            list.add(asset);
        }
        return list;
    }
}

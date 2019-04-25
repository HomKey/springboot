package com.hk.freemarker.keydak.conf;

import org.snmp4j.smi.Integer32;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LuHj on 2018/10/19.
 */
public class IrsConfig {

    public static Map<String, String> PDU_PROPERTIES = new HashMap<>();

    static {
        PDU_PROPERTIES.put("voltage", "PDU_Voltage");
        PDU_PROPERTIES.put("current", "PDU_Current");
        PDU_PROPERTIES.put("power", "PDU_ActivePower");
        PDU_PROPERTIES.put("frequency", "PDU_Frequency");
        PDU_PROPERTIES.put("temperature", "PDU_Temperature");
        PDU_PROPERTIES.put("humidity", "PDU_Humidity");
    }

    public static String[] PDU_UI = new String[]{
            "1|PDU1-A|cbe3194d-657a-41f1-af3c-ab2a5ee40ca0",
            "2|PDU1-B|534243a1-d043-4de0-94bb-136d4a44c3d9",
            "3|PDU2-A|39e6526e-402b-43cc-8f17-eb287d0b34cf",
            "4|PDU2-B|0c6ae706-3139-4c9c-830d-a6a9412d4739",
            "5|PDU3-A|63d2e680-51b7-444b-86e2-e34ff630a048",
            "6|PDU3-B|f77ad6f9-f76c-4186-aa54-7af715065497",
            "7|PDU4-A|ae24059e-e691-498e-bcce-f8798b457b40",
            "8|PDU4-B|a5d1fdbc-ad60-4e8c-8910-2342a6ae0f4b",
            "9|PDU5-A|cfdf638c-ca47-4287-b7b1-8572982d8bfc",
            "10|PDU5-B|4e3d30ee-8975-44d2-8e04-0dc7e5ac5273",
            "11|PDU6-A|59f6b589-9a4e-4caf-9c02-240c009e6aa6",
            "12|PDU6-B|ddf41f53-5785-4cf4-ae68-abc559c5a419",
            "13|PDU7-A|f5cf6a71-39d7-4da6-b2bf-322270067479",
            "14|PDU7-B|e842d18b-182f-4644-b56c-2458517f04c7",
            "15|PDU8-A|de2aa7bc-b86c-4424-b10c-0ea49b56329a",
            "16|PDU8-B|06ad723d-40ec-4e73-9d3f-b5aa20dfc526",
            "17|PDU9-A|7170e12c-f151-4263-9b1f-4c77f21a8f8c",
            "18|PDU9-B|bd4c5dc5-be20-4093-b6d7-77ad26d2233a",
            "19|PDU10-A|f876ea18-76d7-48aa-995f-0584d4362309",
            "20|PDU10-B|9d8521fd-a8fe-47af-aded-7f6764c704e3"
    };

    public static String[] ASSET_UI = new String[]{ //"uuid|name|displayName",// asset1 1号
            "8a43149b-7f62-4a3d-9207-27e2b312145a|asset1|1号",
            "c883e2e7-4425-4a34-a1a4-46a9bd76ee05|asset2|2号",
            "7664c670-3366-46e2-89c3-d1ccd46222fd|asset3|3号",
            "3f82a8d5-5e6d-417a-b45a-bb59ce748270|asset4|4号",
            "1777fcc0-03e4-42de-b219-070b5a1e2f24|asset5|5号",
            "e5404f63-fedb-4fca-8a52-00390903063b|asset6|6号",
            "cac7742a-0a58-4f11-b167-7d48ada20d66|asset7|7号",
            "51948613-9445-4c6b-b5fb-ad3e60165560|asset8|8号",
            "4d999386-8862-45fe-822b-0127bf316ff8|asset9|9号",
            "d3763896-aec2-48c7-ad66-06de16938cf1|asset10|10号"
    };
    public static String[] EMH_UI = new String[]{ //"deviceid|name",// asset1 1号
            "bae7c801-94ea-4578-b314-01d4cb6ae1ff|emh1",
            "8a2ae7ae-565b-4ab1-8ce4-8c768ff01a35|emh2",
            "4da917ab-daad-44c8-a0c3-a4536c18be46|emh3",
            "f9056aef-2725-4712-a0be-45d715486fb1|emh4",
            "d01cb539-66aa-4e89-b583-785c22282f3e|emh5",
            "aa7cc1b5-9428-48c0-bd88-0e04021c9f6e|emh6",
            "56b610e2-28da-4dfc-bede-c80c3235f4b1|emh7",
            "a0c2d116-9c54-466a-82ff-6d7d200157ac|emh8",
            "09450d69-76f7-4d1b-80d7-e9df1dd55e10|emh9",
            "92742ab2-8d64-40da-aadd-c4246e96552e|emh10"
    };

    public static void printAssetUi(){
        String baseUUID = "-asset-6d8e-429f-a882-429f97625558";
        for (int i = 1; i < 11; i++) {
            System.out.println("\"" + (i < 10 ? "0" + i : i) + baseUUID + "\",");
        }
    }


    public static void printEmhUi(){
        String baseUUID = "-emh836e-4db8-419e-a6d1-fc9a0dd0cb";
        for (int i = 1; i < 11; i++) {
            System.out.println("\"" + (i < 10 ? "0" + i : i) + baseUUID + "|emh" + i + "\",");
        }
    }
    public static void printPduUi() {
        String baseUUID = "-pdu8e8-56f7-47ff-a1a9-0e1d6309ede";
        for (int i = 1; i < 21; i++) {
            System.out.println("\"" + i + "|" + "PDU" + new Double(Math.floor((i+1) / 2)).intValue() + "-" + (i % 2 == 1 ? "A" : "B") + "|" + (i < 10 ? "0" + i : i) + baseUUID + "\",");
        }
    }

    public static void printAsset(){
        String baseUUID = "-assetb-6d8e-429f-a882-429f9762555";
        for (int i = 1; i < 11; i++) {
            System.out.println("\"" + (i < 10 ? "0" + i : i) + baseUUID + "|asset" + i + "|" +  i + "号\",");
        }
    }
    public static void main(String[] args) {
//        printPduUi();
//        printAsset();
        printEmhUi();
    }
}

package com.hk.keydak.rs.util;

/**
 * Created by tandewei on 2015/12/31.
 */
public class CRCUtil {
    public static byte[] Get_crc16 (byte[] bufData, int buflen)
    {
        byte[] pcrc = new byte[2];
        int CRC = 0x0000ffff;
        int POLYNOMIAL = 0x0000a001;
        int i, j;

        for (i = 0; i < buflen; i++)
        {
            CRC ^= ((int)bufData[i] & 0x000000ff);
            for (j = 0; j < 8; j++)
            {
                if ((CRC & 0x00000001) != 0)
                {
                    CRC >>= 1;
                    CRC ^= POLYNOMIAL;
                }
                else
                {
                    CRC >>= 1;
                }
            }
        }
        //System.out.println(Integer.toHexString(CRC));
        pcrc[0] = (byte)(CRC & 0x00ff);
        pcrc[1] = (byte)(CRC >> 8);

        return pcrc;
    }

    public static boolean Volid_crc16 (byte[] bufData)
    {
        byte[] pcrc = new byte[2];
        int CRC = 0x0000ffff;
        int POLYNOMIAL = 0x0000a001;
        int i, j;

        for (i = 0; i < bufData.length - 2; i++)
        {
            CRC ^= ((int)bufData[i] & 0x000000ff);
            for (j = 0; j < 8; j++)
            {
                if ((CRC & 0x00000001) != 0)
                {
                    CRC >>= 1;
                    CRC ^= POLYNOMIAL;
                }
                else
                {
                    CRC >>= 1;
                }
            }
        }
        //System.out.println(Integer.toHexString(CRC));
        pcrc[0] = (byte)(CRC & 0x00ff);
        pcrc[1] = (byte)(CRC >> 8);
        if (pcrc[0] == bufData[bufData.length - 2] && pcrc[1] == bufData[bufData.length - 1]){
            return true;
        }
        return false;
    }
}

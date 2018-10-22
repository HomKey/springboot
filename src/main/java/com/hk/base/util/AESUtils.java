package com.hk.base.util;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.tomcat.util.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * Created by LuHj on 2018/10/11.
 */
public class AESUtils {
    private static final Logger logger = LogManager.getLogger(AESUtils.class);
    private static final String KEY_ALGORITHM = "AES";
    private static final String CHARSET = "UTF-8";
    private static final String DEFAULT_CIPHER_ALGORITHM = "AES/ECB/PKCS5Padding";// 密码器的加密算法
    private static final String SECURERANDOM = "SHA1PRNG"; // 秘钥生成的指定算法, 避免系统不同产生问题

    private static final String SECRET_KEY = "homkey";// 加密密钥

    /**
     * AES 加密操作
     *
     * @param content 待加密内容
     * @return 返回Base64转码后的加密数据
     */
    public static String encode(String content) {
        System.out.println("encode");
        System.out.println(content);
        try {
            Cipher cipher = Cipher.getInstance(DEFAULT_CIPHER_ALGORITHM);// 创建密码器

            byte[] byteContent = content.getBytes(CHARSET);

            cipher.init(Cipher.ENCRYPT_MODE, getSecretKey());// 初始化为加密模式的密码器

            byte[] result = cipher.doFinal(byteContent);// 加密

            byte[] bytes = Base64.encodeBase64(result);

            return new String(bytes);//通过Base64转码返回
        } catch (Exception ex) {
            logger.info(ex.getMessage());
        }

        return null;
    }

    /**
     * AES 解密操作
     *
     * @param content
     * @return
     */
    public static String decode(String content) {
        System.out.println("decode");
        System.out.println(content);
        try {
            //实例化
            Cipher cipher = Cipher.getInstance(DEFAULT_CIPHER_ALGORITHM);

            //使用密钥初始化，设置为解密模式
            cipher.init(Cipher.DECRYPT_MODE, getSecretKey());

            byte[] byteContent = content.getBytes(CHARSET);

            byte[] bytes = Base64.decodeBase64(byteContent);

            //执行操作
            byte[] result = cipher.doFinal(bytes);

            return new String(result);
        } catch (Exception ex) {
            logger.info(ex.getMessage());
        }

        return null;
    }

    /**
     * 生成加密秘钥
     *
     * @return
     */
    private static SecretKeySpec getSecretKey() {
        //返回生成指定算法密钥生成器的 KeyGenerator 对象
        KeyGenerator kg = null;

        try {
            kg = KeyGenerator.getInstance(KEY_ALGORITHM);

            SecureRandom random = SecureRandom.getInstance(SECURERANDOM);
            random.setSeed(SECRET_KEY.getBytes(CHARSET));

            //AES 要求密钥长度为 128
            kg.init(128, random);
            //生成一个密钥
            SecretKey secretKey = kg.generateKey();

            return new SecretKeySpec(secretKey.getEncoded(), KEY_ALGORITHM);// 转换为AES专用密钥
        } catch (NoSuchAlgorithmException ex) {
            logger.info(ex.getMessage());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return null;
    }

}

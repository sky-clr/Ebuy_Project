package com.txf.utils;

import java.security.MessageDigest;

public class EncryptionUtil {

    private static final String[] KEYS  = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
    public static String ToMD5(String str) throws Exception{
        return EncryptionUtil.initMD5(EncryptionUtil.initMD5(str + "txf") + "txf941020");
    }
    public static String initMD5(String str) throws Exception{
        if (str == null){
            throw new Exception("加密字符串不能为空!");
        }
        StringBuilder sb = new StringBuilder("");
        MessageDigest messageDigest =  MessageDigest.getInstance("MD5");
        byte[] bytes = messageDigest.digest(str.getBytes());
        for (byte b : bytes){
            int num =b;
            if(num <= 0) {
                num += 256;
            }
            int index1 = num / 16;
            int index2 = num % 16;
            sb.append(KEYS[index1]).append(KEYS[index2]);
        }
        return sb.toString();
    }
}

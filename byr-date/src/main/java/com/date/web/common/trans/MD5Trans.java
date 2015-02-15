/**
 * 
 */
package com.date.web.common.trans;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author xuesong03
 * 
 */
public class MD5Trans {
    /**
     * 盐
     */
    private static final String SALT = "@xiaobai";

    /**
     * 加密
     * 
     * @param str 参数
     * @return 加密字符串
     * @throws NoSuchAlgorithmException NoSuchAlgorithmException
     */
    public static String encode(String str) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update((str + SALT).getBytes());
        byte[] b = md.digest();

        int i;

        StringBuffer buf = new StringBuffer("");
        for (int offset = 0; offset < b.length; offset++) {
            i = b[offset];
            if (i < 0) {
                i += 256;
            }
            if (i < 16) {
                buf.append("0");
            }
            buf.append(Integer.toHexString(i));
        }
        return buf.toString();
    }

}

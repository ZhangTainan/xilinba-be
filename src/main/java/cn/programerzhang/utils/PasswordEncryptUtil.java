package cn.programerzhang.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncryptUtil {

    public static String getSHA(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        // 盐
        String salt="d7ce1ca8ae7b8be20e09f134e1e64a4bb3ff4ca0e512e89fa6bb35ad2839aeda";
        String mixed_password=password+salt;
        byte[] shaBytes = md.digest(mixed_password.getBytes());
        return bytesToHexString(shaBytes);
    }
    public static String bytesToHexString(byte[] bytes) {
        StringBuilder stringBuilder = new StringBuilder();
        if (bytes == null || bytes.length <= 0) {
            return null;
        }
        for (byte aByte : bytes) {
            int v = aByte & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }

};


package cn.programerzhang;

import cn.programerzhang.utils.PasswordEncryptUtil;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.NoSuchAlgorithmException;

@SpringBootTest
public class PasswordEncryptUtilTest {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println(PasswordEncryptUtil.getSHA("demo"));
    }
}

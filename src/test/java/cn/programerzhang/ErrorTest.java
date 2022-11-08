package cn.programerzhang;

import org.springframework.boot.test.context.SpringBootTest;
import cn.programerzhang.errors.UserError;
@SpringBootTest
public class ErrorTest {
    public static void main(String[] args) {
        System.out.println(UserError.LOGIN_INFO_ERROR.toString());
        System.out.println(UserError.USER_IS_NOT_ABLE.toString());
        System.out.println(UserError.USERNAME_IS_NOT_AVAILABLE.name());
    }
}

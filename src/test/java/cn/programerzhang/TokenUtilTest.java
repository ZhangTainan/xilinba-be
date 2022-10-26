package cn.programerzhang;

import cn.programerzhang.utils.TokenUtil;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TokenUtilTest {
    public static void main(String[] args) {
        System.out.println(TokenUtil.getToken("abc"));
        System.out.println(TokenUtil.parseToken("eyJhbGciOiJIUzI1NiJ9.eyJleHAiOjE2NjY3OTM3MDMsImNvbnRlbnQiOiJhYmMifQ.VkrnuTvFVnQcOxJjoK8NYYUZHqpBf5M7QExt0CS1fco"));
    }
}

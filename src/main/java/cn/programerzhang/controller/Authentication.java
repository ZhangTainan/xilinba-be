package cn.programerzhang.controller;

import cn.programerzhang.mapper.UserMapper;
import cn.programerzhang.pojo.User;
import cn.programerzhang.utils.JsonUtil;
import cn.programerzhang.utils.PasswordEncryptUtil;
import cn.programerzhang.utils.TokenUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

import static cn.programerzhang.errors.UserError.*;

@Api(tags = "用户鉴权接口")
@RestController
public class Authentication {
    @Autowired
    private UserMapper userMapper;

    // 登录
    @PostMapping("/login")
    public String login(@RequestBody HashMap<String,String> user) throws NoSuchAlgorithmException {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        String username=user.get("username");
        String password= PasswordEncryptUtil.getSHA(user.get("password"));
        userQueryWrapper.eq("username",username);
        userQueryWrapper.eq("password",password);
        User selected_user=userMapper.selectOne(userQueryWrapper);
        if (selected_user==null) {
            return LOGIN_INFO_ERROR.name();
        }
        if (!selected_user.getIsAble()){
            return USER_IS_NOT_ABLE.name();
        }
        String token = TokenUtil.getToken(user.get("username"));
        HashMap<String, String> res = new HashMap<>();
        res.put("username", user.get("username"));
        res.put("token", token);
        return JsonUtil.toJson(res);
    }

    // 注册
    @PostMapping("/register")
    public String register(@RequestBody User user) throws NoSuchAlgorithmException {
        user.setPassword(PasswordEncryptUtil.getSHA(user.getPassword()));
        try {
            userMapper.insert(user);
        } catch (Exception e) {
            e.printStackTrace();
            return USERNAME_IS_NOT_AVAILABLE.name();
        }
        String token = TokenUtil.getToken(user.getUsername());
        HashMap<String, String> res = new HashMap<>();
        res.put("username", user.getUsername());
        res.put("token", token);
        return JsonUtil.toJson(res);
    }

    // 校验token
    @PostMapping("/checkToken")
    public Boolean checkToken(@RequestBody HashMap<String, String> data) {
        String username = data.get("username");
        String token = data.get("token");
        return username.equals(TokenUtil.parseToken(token));
    }
}

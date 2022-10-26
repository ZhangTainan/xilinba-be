package cn.programerzhang.controller;

import cn.programerzhang.mapper.UserMapper;
import cn.programerzhang.pojo.User;
import cn.programerzhang.utils.TokenUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.gson.Gson;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@Api(tags = "用户鉴权接口")
@RestController
public class Authentication {
    @Autowired
    private UserMapper userMapper;

    Gson gson = new Gson();

    // 登录
    @PostMapping("/login")
    public String login(@RequestBody HashMap<String,String> user) {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        String username=user.get("username");
        String password=user.get("password");
        userQueryWrapper.eq("username",username);
        userQueryWrapper.eq("password",password);
        if (userMapper.selectOne(userQueryWrapper) == null) {
            return "error";
        }
        String token = TokenUtil.getToken(user.get("username"));
        HashMap<String, String> res = new HashMap<>();
        res.put("username", user.get("username"));
        res.put("token", token);
        return gson.toJson(res);
    }

    // 注册
    @PostMapping("/register")
    public String register(@RequestBody User user) {
        userMapper.insert(user);
        String token = TokenUtil.getToken(user.getUsername());
        HashMap<String, String> res = new HashMap<>();
        res.put("username", user.getUsername());
        res.put("token", token);
        return gson.toJson(res);
    }

    // 校验token
    @PostMapping("/checkToken")
    public Boolean checkToken(@RequestBody HashMap<String, String> data) {
        String username = data.get("username");
        String token = data.get("token");
        return username.equals(TokenUtil.parseToken(token));
    }
}

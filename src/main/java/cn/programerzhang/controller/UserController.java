package cn.programerzhang.controller;

import cn.programerzhang.mapper.UserMapper;
import cn.programerzhang.pojo.User;
import com.google.gson.Gson;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "用户查询接口")
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    private static final Gson gson = new Gson();

    @GetMapping("users")
    public String getUsers() {
        List<User> users = userMapper.selectList(null);
        return gson.toJson(users);
    }
}

package cn.programerzhang.controller;

import cn.programerzhang.mapper.UserMapper;
import cn.programerzhang.pojo.User;
import cn.programerzhang.utils.JsonUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "用户查询接口")
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("users")
    public String getUsers() {
        List<User> users = userMapper.selectList(null);
        return JsonUtil.toJson(users);
    }
    // 判断用户名是否存在
    @GetMapping("/checkUsernameIfExists")
    public Boolean checkUsername(@RequestParam("username") String username){
        // System.out.println(username);
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("username",username);

        // 存在为true
        return userMapper.selectOne(userQueryWrapper) != null;
    }
}

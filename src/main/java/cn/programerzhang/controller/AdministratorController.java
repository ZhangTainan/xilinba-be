package cn.programerzhang.controller;

import cn.programerzhang.mapper.AdministratorMapper;
import cn.programerzhang.pojo.Administrator;
import cn.programerzhang.utils.JsonUtil;
import cn.programerzhang.utils.PasswordEncryptUtil;
import cn.programerzhang.utils.TokenUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;

@Api(tags = "管理员接口")
@RestController("admin")
public class AdministratorController {
    @Autowired
    AdministratorMapper administratorMapper;

    @GetMapping("/getAdministrators")
    public String getAdministrators() {
        List<Administrator> administrators = administratorMapper.selectList(null);
        return JsonUtil.toJson(administrators);
    }

    @GetMapping("/login")
    public String login(@RequestBody Administrator administrator) throws NoSuchAlgorithmException {
        QueryWrapper<Administrator> administratorQueryWrapper = new QueryWrapper<>();
        // 加密
        administrator.setPassword(PasswordEncryptUtil.getSHA(administrator.getPassword()));
        administratorQueryWrapper.eq("username", administrator.getUsername());
        administratorQueryWrapper.eq("password", administrator.getPassword());
        if (administratorMapper.selectOne(administratorQueryWrapper) == null) {
            return "error";
        }
        String token=TokenUtil.getToken(administrator.getUsername());
        HashMap<String, String> res = new HashMap<>();
        res.put("username",administrator.getUsername());
        res.put("token",token);
        return JsonUtil.toJson(res);
    }
}

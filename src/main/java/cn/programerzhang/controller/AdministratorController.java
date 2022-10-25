package cn.programerzhang.controller;

import cn.programerzhang.mapper.AdministratorMapper;
import cn.programerzhang.pojo.Administrator;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdministratorController {
    @Autowired
    AdministratorMapper administratorMapper;

    private final Gson gson = new Gson();

    @GetMapping("/getAdministrators")
    public String getAdministrators() {
        List<Administrator> administrators = administratorMapper.selectList(null);
        return gson.toJson(administrators);
    }
}

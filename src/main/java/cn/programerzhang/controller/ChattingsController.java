package cn.programerzhang.controller;

import cn.programerzhang.mapper.ChattingsMapper;
import cn.programerzhang.pojo.Chattings;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ChattingsController {
    @Autowired
    ChattingsMapper chattingsMapper;
    private final Gson gson=new Gson();
    //获取关于聊天界面的信息将其存在list数组里面
    @GetMapping("/getChattings")
    public String getChattings() {
        List<Chattings>chattings=chattingsMapper.selectList(null);
        return gson.toJson(chattings);
    }
}

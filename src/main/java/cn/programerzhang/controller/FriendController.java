package cn.programerzhang.controller;

import cn.programerzhang.mapper.FriendMapper;
import cn.programerzhang.pojo.Friend;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FriendController {
   @Autowired
   FriendMapper friendMapper;
   private final Gson gson = new Gson();
   @GetMapping("/getFriend")
    public String getFriend(){
       List<Friend>friend=friendMapper.selectList(null);
       return gson.toJson(friend);
   }
}

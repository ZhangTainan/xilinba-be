package cn.programerzhang.controller;

import cn.programerzhang.mapper.FriendMapper;
import cn.programerzhang.pojo.Friend;
import com.google.gson.Gson;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags="好友关系接口")
@RestController
public class FriendController {
   @Autowired
   FriendMapper friendMapper;
   private final Gson gson = new Gson();
   @GetMapping("/getFriends")
   //获取朋友列表
    public String getFriends(){
       List<Friend>friend=friendMapper.selectList(null);
       return gson.toJson(friend);
   }
}

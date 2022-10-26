package cn.programerzhang.controller;

import cn.programerzhang.mapper.CommentForTopicMapper;
import cn.programerzhang.pojo.CommentForTopic;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentForTopicController {
    @Autowired
    CommentForTopicMapper commentForTopicMapper;
    private final Gson gson=new Gson();
    @GetMapping("/getCommentForTopic")
    //从标题获取信息存在list数组
    public String getCommentForTopic(){
        List<CommentForTopic>commentForTopic=commentForTopicMapper.selectList(null);
        return gson.toJson(commentForTopic);
    }
}

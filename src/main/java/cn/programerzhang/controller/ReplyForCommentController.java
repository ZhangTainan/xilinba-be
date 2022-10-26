package cn.programerzhang.controller;

import cn.programerzhang.mapper.ReplyForCommentMapper;
import cn.programerzhang.pojo.ReplyForComment;
import com.google.gson.Gson;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags="话题的评论接口")
@RestController
public class ReplyForCommentController {
    @Autowired
    ReplyForCommentMapper replyForCommentMapper;
    private final Gson gson = new Gson();

    @GetMapping("/getReplyForComments")
    public String getReplyForComments() {
        List<ReplyForComment> replyForComments = replyForCommentMapper.selectList(null);
        return gson.toJson(replyForComments);
    }
}

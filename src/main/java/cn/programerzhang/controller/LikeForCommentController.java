package cn.programerzhang.controller;

import cn.programerzhang.mapper.LikeForCommentMapper;
import cn.programerzhang.pojo.LikeForComment;
import com.google.gson.Gson;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags="评论的点赞接口")
@RestController
public class LikeForCommentController {
    @Autowired
    LikeForCommentMapper likeForCommentMapper;
    private final Gson gson = new Gson();

    @GetMapping("/getLikeForComments")
    public String getLikeForComments() {
        List<LikeForComment> likeForComment = likeForCommentMapper.selectList(null);
        return gson.toJson(likeForComment);
    }

}

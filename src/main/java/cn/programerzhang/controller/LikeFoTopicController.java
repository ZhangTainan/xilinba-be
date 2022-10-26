package cn.programerzhang.controller;

import cn.programerzhang.mapper.LikeForTopicMapper;
import cn.programerzhang.pojo.LikeForTopic;
import com.google.gson.Gson;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags="话题的点赞接口")
@RestController
public class LikeFoTopicController {
    @Autowired
    LikeForTopicMapper likeforTopicMapper;
    private final Gson gson = new Gson();

    @GetMapping("/getLikeForTopics")
    public String getLikeForTopics() {
        List<LikeForTopic> likeForTopics = likeforTopicMapper.selectList(null);
        return gson.toJson(likeForTopics);
    }
}

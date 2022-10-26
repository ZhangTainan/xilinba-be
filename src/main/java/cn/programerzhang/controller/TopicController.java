package cn.programerzhang.controller;

import cn.programerzhang.mapper.TopicMapper;
import cn.programerzhang.pojo.Topic;
import com.google.gson.Gson;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags="话题接口")
@RestController
public class TopicController {
    @Autowired
    TopicMapper topicMapper;
    private final Gson gson = new Gson();

    @GetMapping("/getTopics")
    public String getTopics() {
        List<Topic> topics = topicMapper.selectList(null);
        return gson.toJson(topics);
    }
}

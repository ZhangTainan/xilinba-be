package cn.programerzhang.controller;

import cn.programerzhang.mapper.EmojiMapper;
import cn.programerzhang.pojo.Emoji;
import com.google.gson.Gson;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags="表情包接口")
@RestController
public class EmojiController {
    @Autowired
    EmojiMapper emojiMapper;
    private final Gson gson = new Gson();

    @GetMapping("/getEmojiControllers")
    //获取所有的表情url将其放入list数组里
    public String getEmojiControllers() {
        List<Emoji> emoji = emojiMapper.selectList(null);
        return gson.toJson(emoji);
    }
    //
}

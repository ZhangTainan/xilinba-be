package cn.programerzhang.controller;

import cn.programerzhang.mapper.EmojiMapper;
import cn.programerzhang.pojo.Emoji;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class EmojiController {
    @Autowired
    EmojiMapper emojiMapper;
    private Gson gson = new Gson();
    @GetMapping("/getEmojiController")
    //获取所有的表情url将其放入list数组里
    public String getEmojiController() {
        List<Emoji>emoji=emojiMapper.selectList(null);
        return gson.toJson(emoji);
    }
    //
}

package cn.programerzhang.controller;

import cn.programerzhang.mapper.AnnouncementMapper;

import cn.programerzhang.pojo.Announcement;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnnouncementController {
    @Autowired
    AnnouncementMapper announcementMapper;
    private final Gson gson = new Gson();
    //获取公告信息
    @GetMapping("/getAnnouncements")
    public String getAnnouncements(){
        List<Announcement>announcements=announcementMapper.selectList(null);
        return gson.toJson(announcements);
    }
}

package cn.programerzhang.mapper;
import cn.programerzhang.pojo.Announcement;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AnnouncementMapper extends BaseMapper<Announcement> {
    @Select("select * from announcement;")
    public List<Announcement> selectAnnouncement();

}

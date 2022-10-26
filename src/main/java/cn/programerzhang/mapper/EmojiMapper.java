package cn.programerzhang.mapper;

import cn.programerzhang.pojo.Emoji;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmojiMapper extends BaseMapper<Emoji> {
    @Select("select * from emoji")
    public List<Emoji>selectemoji();
}

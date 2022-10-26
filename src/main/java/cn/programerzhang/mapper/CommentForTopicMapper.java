package cn.programerzhang.mapper;

import cn.programerzhang.pojo.CommentForTopic;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CommentForTopicMapper extends BaseMapper<CommentForTopic> {
    @Select("select * from comment_for_topic")
    public List<CommentForTopic>selectCommentsForTopics();
}

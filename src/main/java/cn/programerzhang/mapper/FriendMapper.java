package cn.programerzhang.mapper;

import cn.programerzhang.pojo.Friend;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FriendMapper extends BaseMapper<Friend> {
    @Select("select * from friend")
    public List<Friend>selectFriend();
}

package cn.programerzhang.mapper;

import cn.programerzhang.pojo.Friend;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface FriendMapper extends BaseMapper<Friend> {
    public List<Friend>selectFriend();
}

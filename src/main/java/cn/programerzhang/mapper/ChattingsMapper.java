package cn.programerzhang.mapper;

import cn.programerzhang.pojo.Chattings;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ChattingsMapper extends BaseMapper<Chattings> {
    @Select("select *from chattings;")
    public List<Chattings>selectChattings();
}

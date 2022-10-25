package cn.programerzhang.mapper;

import cn.programerzhang.pojo.Administrator;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AdministratorMapper extends BaseMapper<Administrator> {
    @Select("select * from administrator;")
    public List<Administrator> selectAdministrator();

}

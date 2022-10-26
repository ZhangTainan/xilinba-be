package cn.programerzhang.pojo;

import lombok.Data;

@Data
public class Friend {
    private Long id;
    private Long userId;
    private Long friendId;
    //备注
    private String remark;
}

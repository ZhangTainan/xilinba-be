package cn.programerzhang.pojo;

import lombok.Data;

@Data
public class Friend {
    private Long id;
    private Long UserId;
    private Long FriendId;
    //备注
    private String remark;
}

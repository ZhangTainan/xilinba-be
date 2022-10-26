package cn.programerzhang.pojo;

import lombok.Data;

@Data
public class LikeForComment {
    private Long id;
    private Long commentId;
    private Long userId;
}

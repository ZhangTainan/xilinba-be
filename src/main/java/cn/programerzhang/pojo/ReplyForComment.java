package cn.programerzhang.pojo;

import lombok.Data;

@Data
public class ReplyForComment {
    private Long id;
    private Long commentId;
    private Long userId;
    private String content;
}

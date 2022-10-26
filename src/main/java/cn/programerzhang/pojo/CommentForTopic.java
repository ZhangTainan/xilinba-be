package cn.programerzhang.pojo;

import lombok.Data;

@Data
public class CommentForTopic {
    private Long id;
    private String content;
    private Long topicId;
    private Long userId;
}

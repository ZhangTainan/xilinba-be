package cn.programerzhang.pojo;

import lombok.Data;

@Data
public class LikeForTopic {
    private Long id;
    private Long topicId;
    private Long userId;
}

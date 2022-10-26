package cn.programerzhang.pojo;

import lombok.Data;

@Data
public class Topic {
    private Long id;
    private Long userId;
    private String content;
    private String topic;
    private String imageUrl;
    private String emojiId;
}

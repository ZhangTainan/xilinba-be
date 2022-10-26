package cn.programerzhang.pojo;

import lombok.Data;

@Data
public class Chattings {
    private Long id;
    private String content;
    private Long emojiId;
    private String time;
    private Long senderId;
    private Long receiverId;
    private String isFriend;
}

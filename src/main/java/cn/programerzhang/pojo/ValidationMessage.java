package cn.programerzhang.pojo;

import lombok.Data;

@Data
public class ValidationMessage {
    private Long id;
    private String content;
    private Long senderId;
    private Long receiverId;
    private String time;
    private String expirationTime;
}

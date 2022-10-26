package cn.programerzhang.pojo;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private String phone;
    private String email;
    private String created_time;
    private String nick_name;
    private String icon;
    private int age;
    private Boolean gender;
    private String birthday;
    private String hobby;
    private String introduction;
    private String static_directory;
    private Boolean isAble;
}

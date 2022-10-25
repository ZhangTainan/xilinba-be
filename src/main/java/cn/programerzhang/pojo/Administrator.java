package cn.programerzhang.pojo;

import lombok.Data;

@Data
public class Administrator {
    private Long id;
    private String username;
    private String password;
    Boolean is_able;
}

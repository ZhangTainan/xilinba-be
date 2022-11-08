package cn.programerzhang.errors;

public enum UserError {

    LOGIN_INFO_ERROR, // 用户名或密码错误
    USER_IS_NOT_ABLE, // 用户的is_able为false,该用户已被注销
    USERNAME_IS_NOT_AVAILABLE, // 用户名不可用,数据库中的用户名已存在

}

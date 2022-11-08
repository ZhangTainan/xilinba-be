package cn.programerzhang.utils;


import com.google.gson.Gson;

public class JsonUtil {
    public static final Gson gson=new Gson();
    public static String toJson(Object obj){
        return gson.toJson(obj);
    }
}

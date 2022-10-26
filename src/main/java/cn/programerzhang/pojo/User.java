package cn.programerzhang.pojo;

import javafx.scene.chart.PieChart;
import lombok.Data;

@Data
public class User {
    private Long id;
    private  String username;
    private String password;
    private String phone;
    private String email;
    private PieChart.Data createdTime;
    private String nickName;
    private String icon;
    private int age;
    private int gender;
    private PieChart.Data birthday;
    private String hobby;
    private String introduction;
    private String staticDiretory;
    private int isAbled;
}

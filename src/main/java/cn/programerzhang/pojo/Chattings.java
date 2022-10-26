package cn.programerzhang.pojo;

import javafx.scene.chart.PieChart;
import lombok.Data;

@Data
public class Chattings {
    private Long id;
    private String content;
    private Long emojiId;
    private PieChart.Data time;
    private Long senderId;
    private Long receiverId;
    private String isFriend;
}

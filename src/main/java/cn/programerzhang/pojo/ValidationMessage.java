package cn.programerzhang.pojo;

import javafx.scene.chart.PieChart;
import lombok.Data;

@Data
public class ValidationMessage {
    private Long id;
    private String content;
    private Long senderId;
    private Long receiverId;
    private PieChart.Data time;
    private PieChart.Data expirationTime;
}

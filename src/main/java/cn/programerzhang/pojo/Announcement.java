package cn.programerzhang.pojo;

import javafx.scene.chart.PieChart;
import lombok.Data;

@Data
public class Announcement {
    private Long id;
    private String content;
    private PieChart.Data time;
    Boolean is_able;
}

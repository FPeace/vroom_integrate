package org.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

/**
 * 货运步骤对象，描述取货或送货的详细信息
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ShipmentStep {
    /**
     * 步骤唯一标识
     */
    private int id;
    
    /**
     * 步骤描述信息
     */
    private String description;
    
    /**
     * 坐标数组，格式为[经度, 纬度]
     */
    private Location location;
    
    /**
     * 自定义矩阵中相关行和列的索引
     */
    private Integer locationIndex;
    
    /**
     * 任务准备时间，默认为0
     */
    private Integer setup;
    
    /**
     * 任务服务时间，默认为0
     */
    private Integer service;

    /**
     * 时间窗口数组，每个元素为[开始时间, 结束时间]的数组，表示任务可执行的时间段
     */
    private List<TimeWindow> timeWindows;
}
    
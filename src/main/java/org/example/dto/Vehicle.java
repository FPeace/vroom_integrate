package org.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import tools.jackson.databind.PropertyNamingStrategies;
import tools.jackson.databind.annotation.JsonNaming;

import java.util.List;

/**
 * 车辆对象，描述可用车辆的信息和约束
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Vehicle {
    /**
     * 车辆唯一标识
     */
    private int id;
    
    /**
     * 路由配置文件，根据地图配置的来，包括driving-car、driving-hgv等
     */
    private String profile;
    
    /**
     * 车辆描述信息
     */
    private String description;
    
    /**
     * 起点坐标数组，格式为[经度, 纬度]
     */
    private Location start;
    
    /**
     * 起点在自定义矩阵中的索引
     */
    private Integer startIndex;
    
    /**
     * 终点坐标数组，格式为[经度, 纬度]
     */
    private Location end;
    
    /**
     * 终点在自定义矩阵中的索引
     */
    private Integer endIndex;
    
    /**
     * 多维容量数组，描述车辆可承载的最大量
     */
    private List<Integer> capacity;
    
    /**
     * 车辆成本对象
     */
    private Cost costs;
    
    /**
     * 车辆具备的技能数组
     */
    private List<Integer> skills;
    
    /**
     * 时间窗口对象，描述车辆的工作时间
     */
    private TimeWindow timeWindow;
    
    /**
     * 休息对象数组，描述车辆的休息计划
     */
    private List<Break> breaks;
    
    /**
     * 速度因子，范围为(0, 5]，用于缩放所有车辆行驶时间，默认为1.0
     */
    private Integer speedFactor;
    
    /**
     * 最大任务数，定义车辆路线中可执行的最大任务数量
     */
    private Integer maxTasks;
    
    /**
     * 最大行驶时间，定义车辆的最大行驶时间
     */
    private Integer maxTravelTime;
    
    /**
     * 最大行驶距离，定义车辆的最大行驶距离
     */
    private Integer maxDistance;
    
    /**
     * 步骤数组，描述车辆的自定义路线
     */
    private List<VehicleStep> steps;
}
    
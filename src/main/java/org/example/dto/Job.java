package org.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

/**
 * 作业对象，描述需要访问的地点
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Job {
    /**
     * 作业唯一标识
     */
    private Integer id;
    
    /**
     * 作业描述信息
     */
    private String description;
    
    /**
     * 坐标数组，格式为[经度, 纬度]
     * 使用WGS84格式
     */
    private Location location;
    
    /**
     * 自定义矩阵中相关行和列的索引
     */
    private Integer locationIndex;
    
    /**
     * 作业准备时间，默认为0
     */
    private Integer setup;
    
    /**
     * 作业服务时间，默认为0
     */
    private Integer service;

    /**
     * 多维配送量数组，描述需要配送的数量
     */
    private List<Integer> delivery;
    
    /**
     * 多维取货量数组，描述需要取货的数量
     */
    private List<Integer> pickup;
    
    /**
     * 必备技能数组，车辆必须具备所有这些技能才能执行此作业
     */
    private List<Integer> skills;
    
    /**
     * 优先级，范围为[0, 100]，默认为0
     */
    private Integer priority;
    
    /**
     * 时间窗口数组，每个元素为[开始时间, 结束时间]的数组，表示作业可执行的时间段
     * 时间戳
     */
    private List<TimeWindow> timeWindows;
}
    
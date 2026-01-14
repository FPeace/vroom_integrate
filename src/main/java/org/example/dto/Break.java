package org.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

/**
 * 休息对象，描述车辆的休息时间约束
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Break {
    /**
     * 休息唯一标识
     */
    private int id;
    
    /**
     * 时间窗口数组，每个元素为[开始时间, 结束时间]的数组，表示休息可开始的时间段
     */
    private List<List<Integer>> timeWindows;
    
    /**
     * 休息时长，默认为0
     */
    private Integer service;
    
    /**
     * 休息描述信息
     */
    private String description;
    
    /**
     * 多维最大负载数组，描述休息时车辆可承载的最大负载
     */
    private List<Integer> maxLoad;
}
    
package org.example.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import tools.jackson.databind.PropertyNamingStrategies;
import tools.jackson.databind.annotation.JsonNaming;

import java.util.List;

/**
 * 路线对象
 */
@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public  class Route {
    /** 分配给该路线的车辆ID */
    private Integer vehicle;

    /** 步骤对象数组 */
    private List<Step> steps;

    /** 该路线的成本 */
    private Integer cost;

    /** 该路线的准备时间 */
    private Integer setup;

    /** 该路线的服务时间 */
    private Integer service;

    /** 该路线的行驶时间 */
    private Integer duration;

    /** 该路线的等待时间 */
    private Integer waitingTime;

    /** 该路线任务的总优先级 */
    private Integer priority;

    /** 该路线的违规信息列表 */
    private List<Violation> violations;

    /** 该路线的总数量 */
    private List<Integer> amount;

    /** 该路线的总配送量 */
    private List<Integer> delivery;

    /** 该路线的总取货量 */
    private List<Integer> pickup;

    /** 车辆描述（如果输入中提供） */
    private String description;

    /** 路线的编码几何信息（仅在使用 -g 时返回） */
    private String geometry;

    /** 路线总距离（仅在使用 -g 或提供距离矩阵时返回） */
    private Integer distance;
}

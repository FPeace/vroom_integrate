package org.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

/**
 * 路线规划求解结果汇总
 */
@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Summary {

    /** 所有路线的总成本 */
    private Integer cost;

    /** 解决方案中的路线数量 */
    private Integer routes;

    /** 无法服务的任务数量 */
    private Integer unassigned;

    /** 所有路线的总准备时间 */
    private Integer setup;

    /** 所有路线的总服务时间 */
    private Integer service;

    /** 所有路线的总行驶时间 */
    private Integer duration;

    /** 所有路线的总等待时间 */
    private Integer waitingTime;

    /** 已分配任务的总优先级之和
     * an integer in the [0, 100]
     * */
    private Integer priority;

    /** 所有路线的违规信息列表 */
    private List<Violation> violations;

    /** 所有路线的总数量 */
    private List<Integer> amount;

    /** 所有路线的总配送量 */
    private List<Integer> delivery;

    /** 所有路线的总取货量 */
    private List<Integer> pickup;

    /** 所有路线的总距离（仅在使用 -g 或提供距离矩阵时返回） */
    private Integer distance;

}
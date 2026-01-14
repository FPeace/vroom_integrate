package org.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

/**
 * 步骤对象
 */
@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Step {
    /** 步骤类型：start, job, pickup, delivery, break, end */
    private String type;

    /** 到达该步骤的预计时间 */
    private Integer arrival;

    /** 到达该步骤时的累计行驶时间 */
    private Integer duration;

    /** 该步骤的准备时间 */
    private Integer setup;

    /** 该步骤的服务时间 */
    private Integer service;

    /** 到达该步骤时的等待时间 */
    private Integer waitingTime;

    /** 该步骤的违规信息列表 */
    private List<Violation> violations;

    /** 步骤描述（如果输入中提供） */
    private String description;

    /** 该步骤的坐标数组（如果输入中提供） */
    private Location location;

    /** 自定义矩阵中该步骤对应的行列索引（如果输入中提供） */
    private Integer locationIndex;

    /** 该步骤执行的任务ID（仅当 type 为 job, pickup, delivery, break 时提供） */
    private Integer id;

    /** 该步骤执行的作业ID（仅当 type 为 job 时提供） */
    private Integer job;

    /** 步骤完成后的车辆负载（带容量约束） */
    private List<Integer> load;

    /** 到达该步骤时的累计行驶距离（仅在使用 -g 时返回） */
    private Integer distance;
}

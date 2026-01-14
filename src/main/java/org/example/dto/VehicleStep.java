package org.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

/**
 * 车辆步骤对象，描述车辆路线中的具体步骤
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class VehicleStep {
    /**
     * 步骤类型，
     */
    private StepType type;
    
    /**
     * 任务ID，当类型为job, pickup, delivery或break时有效
     */
    private Integer id;
    
    /**
     * 服务时间的硬约束
     */
    private Long serviceAt;
    
    /**
     * 服务时间的下限硬约束
     */
    private Long serviceAfter;
    
    /**
     * 服务时间的上限硬约束
     */
    private Long serviceBefore;
}
    
package org.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import tools.jackson.databind.PropertyNamingStrategies;
import tools.jackson.databind.annotation.JsonNaming;

import java.util.List;

/**
 * 货运对象，描述取货和送货的关联任务
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Shipment {
    /**
     * 取货步骤信息
     */
    private ShipmentStep pickup;
    
    /**
     * 送货步骤信息
     */
    private ShipmentStep delivery;
    
    /**
     * 多维货物量数组，描述货运的数量
     */
    private List<Integer> amount;
    
    /**
     * 必备技能数组，车辆必须具备所有这些技能才能执行此货运任务
     */
    private List<Integer> skills;
    
    /**
     * 优先级，范围为[0, 100]，默认为0
     */
    private Integer priority;
}
    
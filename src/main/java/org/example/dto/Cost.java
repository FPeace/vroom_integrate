package org.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

/**
 * 成本对象，定义车辆的各种成本参数
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Cost {
    /**
     * 使用车辆的固定成本，默认为0
     */
    private Integer fixed;
    
    /**
     * 每小时行驶成本，默认为3600
     */
    private Integer perHour;
    
    /**
     * 每公里行驶成本，默认为0
     */
    private Integer perKm;
}
    
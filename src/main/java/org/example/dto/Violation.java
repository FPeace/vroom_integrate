package org.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

/**
 * 违规对象
 */
@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Violation {
    /** 违规原因 */
    private String cause;

    /** 违规持续时间：如果 cause 是 "lead_time" 表示提前时间，如果是 "delay" 表示延迟时间 */
    private Double duration;
}

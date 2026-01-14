package org.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Task {

    private Integer id;

    private StepType type;

    private String description;

    /**
     * 坐标数组，格式为[经度, 纬度]
     */
    private Location location;
}

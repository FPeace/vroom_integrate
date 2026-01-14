package org.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ComputingTimes {
    private Integer loading;
    private Integer solving;
    private Integer routing;
}

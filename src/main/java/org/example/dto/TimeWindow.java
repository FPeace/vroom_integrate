package org.example.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonFormat(shape = JsonFormat.Shape.ARRAY)
@JsonPropertyOrder({ "start", "end" })
public class TimeWindow {
    private Long start;
    private Long end;
}

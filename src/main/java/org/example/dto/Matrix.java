package org.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

/**
 * 矩阵对象，描述特定配置文件的自定义矩阵
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Matrix {
    /**
     * 自定义行驶时间矩阵，用于所有时间约束检查
     */
    private List<List<Integer>> durations;
    
    /**
     * 自定义距离矩阵
     */
    private List<List<Integer>> distances;
    
    /**
     * 自定义成本矩阵，用于所有路线成本评估
     */
    private List<List<Integer>> costs;
}
    
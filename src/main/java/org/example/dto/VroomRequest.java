package org.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * VROOM API请求对象，包含完整的问题描述
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class VroomRequest {
    /**
     * 作业对象数组，描述需要访问的地点
     */
    private List<Job> jobs;
    
    /**
     * 货运对象数组，描述取货和送货任务
     */
    private List<Shipment> shipments;
    
    /**
     * 车辆对象数组，描述可用车辆
     */
    private List<Vehicle> vehicles;
    
    /**
     * 按配置文件分组的自定义矩阵描述
     */
    private Map<String, Matrix> matrices;
    /**
     * 命令行参数
     */
    private Options options = new Options();
}
    
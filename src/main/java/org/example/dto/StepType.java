package org.example.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum StepType {
    START("start"),
    JOB("job"),
    PICKUP("pickup"),
    DELIVERY("delivery"),
    BREAK("break"),
    END("end");

    private final String value;

    StepType(String value) {
        this.value = value;
    }

    /**
     * 序列化时返回 JSON 字符串（如 "delivery"）
     */
    @JsonValue
    public String getValue() {
        return value;
    }

    /**
     * 反序列化时根据字符串返回枚举
     */
    @JsonCreator
    public static StepType fromValue(String value) {
        for (StepType type : values()) {
            if (type.value.equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("未知的步骤类型: " + value);
    }
}

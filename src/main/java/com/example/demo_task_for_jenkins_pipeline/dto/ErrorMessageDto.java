package com.example.demo_task_for_jenkins_pipeline.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessageDto {
    private Integer code;
    private String message;
}

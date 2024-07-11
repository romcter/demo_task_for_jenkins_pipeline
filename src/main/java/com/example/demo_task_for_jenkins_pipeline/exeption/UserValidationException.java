package com.example.demo_task_for_jenkins_pipeline.exeption;

public class UserValidationException extends RuntimeException {
    public UserValidationException(String message){
        super(message);
    }
}

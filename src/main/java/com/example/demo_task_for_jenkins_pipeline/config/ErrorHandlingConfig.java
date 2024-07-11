package com.example.demo_task_for_jenkins_pipeline.config;

import com.example.demo_task_for_jenkins_pipeline.dto.ErrorMessageDto;
import com.example.demo_task_for_jenkins_pipeline.exeption.UserValidationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ErrorHandlingConfig {

    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    protected ResponseEntity<ErrorMessageDto> handleBadRequestException(MethodArgumentNotValidException ex) {
        log.error(ex.getMessage());

        return ResponseEntity.badRequest().body(ErrorMessageDto.builder().message(ex.getMessage()).code(HttpStatus.BAD_REQUEST.value()).build());
    }

    @ExceptionHandler(value = {UserValidationException.class})
    protected ResponseEntity<ErrorMessageDto> handleBadRequestException(UserValidationException ex) {
        log.error(ex.getMessage());

        return ResponseEntity.badRequest().body(ErrorMessageDto.builder().message(ex.getMessage()).code(HttpStatus.BAD_REQUEST.value()).build());
    }
}

//@Slf4j
//@ControllerAdvice
//public class ErrorHandlingConfig extends ResponseEntityExceptionHandler {
//
//    @ExceptionHandler(value = {MethodArgumentNotValidException.class, UserValidationException.class})
//    protected ResponseEntity<Object> handleBadRequestException(MethodArgumentNotValidException ex, WebRequest request) {
//        log.error(ex.getMessage());
//
//        return handleExceptionInternal(ex, ex.getMessage(), new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
////        return ResponseEntity.badRequest().body(ErrorMessageDto.builder().message(ex.getMessage()).code(HttpStatus.BAD_REQUEST.value()).build());
//    }
//}
package com.example.demo_task_for_jenkins_pipeline.mapper;

import com.example.demo_task_for_jenkins_pipeline.domain.User;
import com.example.demo_task_for_jenkins_pipeline.dto.UserDto;
import com.example.demo_task_for_jenkins_pipeline.dto.UserFullDto;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        componentModel = "spring")
public interface UserMapper {
    User dtoToEntity(UserFullDto dto);
    User dtoToEntity(UserDto dto);
    UserFullDto entityToDto(User entity);
    List<UserFullDto> entityToDto(List<User> entity);
}

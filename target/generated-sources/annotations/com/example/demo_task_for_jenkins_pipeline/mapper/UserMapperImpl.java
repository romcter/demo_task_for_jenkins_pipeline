package com.example.demo_task_for_jenkins_pipeline.mapper;

import com.example.demo_task_for_jenkins_pipeline.domain.User;
import com.example.demo_task_for_jenkins_pipeline.dto.UserDto;
import com.example.demo_task_for_jenkins_pipeline.dto.UserFullDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-11T08:45:43+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User dtoToEntity(UserFullDto dto) {
        if ( dto == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.email( dto.getEmail() );
        user.firstName( dto.getFirstName() );
        user.lastName( dto.getLastName() );
        user.birthDate( dto.getBirthDate() );
        user.address( dto.getAddress() );
        user.phoneNumber( dto.getPhoneNumber() );

        return user.build();
    }

    @Override
    public User dtoToEntity(UserDto dto) {
        if ( dto == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.firstName( dto.getFirstName() );
        user.lastName( dto.getLastName() );
        user.address( dto.getAddress() );
        user.phoneNumber( dto.getPhoneNumber() );

        return user.build();
    }

    @Override
    public UserFullDto entityToDto(User entity) {
        if ( entity == null ) {
            return null;
        }

        UserFullDto.UserFullDtoBuilder userFullDto = UserFullDto.builder();

        userFullDto.email( entity.getEmail() );
        userFullDto.firstName( entity.getFirstName() );
        userFullDto.lastName( entity.getLastName() );
        userFullDto.birthDate( entity.getBirthDate() );
        userFullDto.address( entity.getAddress() );
        userFullDto.phoneNumber( entity.getPhoneNumber() );

        return userFullDto.build();
    }

    @Override
    public List<UserFullDto> entityToDto(List<User> entity) {
        if ( entity == null ) {
            return null;
        }

        List<UserFullDto> list = new ArrayList<UserFullDto>( entity.size() );
        for ( User user : entity ) {
            list.add( entityToDto( user ) );
        }

        return list;
    }
}

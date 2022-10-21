package com.jfjara.usermodule.infraestructure.spring.mapper;

import com.jfjara.usermodule.domain.model.UserDto;
import com.jfjara.usermodule.infraestructure.spring.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserApiMapper {

    User toApiModel(UserDto user);

}

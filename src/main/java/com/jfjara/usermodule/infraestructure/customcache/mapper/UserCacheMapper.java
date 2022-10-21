package com.jfjara.usermodule.infraestructure.customcache.mapper;

import com.jfjara.usermodule.domain.model.UserDto;
import com.jfjara.usermodule.infraestructure.customcache.model.UserCache;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserCacheMapper {

    UserDto toDto(final UserCache userCache);

    UserCache toCacheModel(final UserDto userDto);
}

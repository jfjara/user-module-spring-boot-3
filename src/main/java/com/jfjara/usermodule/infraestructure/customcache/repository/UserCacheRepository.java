package com.jfjara.usermodule.infraestructure.customcache.repository;

import com.jfjara.usermodule.domain.model.UserDto;
import com.jfjara.usermodule.domain.repository.UserRepository;
import com.jfjara.usermodule.infraestructure.customcache.mapper.UserCacheMapper;
import com.jfjara.usermodule.infraestructure.customcache.model.UserCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserCacheRepository implements UserRepository {

    private Map<String, UserCache> cache = new HashMap<>();

    @Autowired
    private UserCacheMapper userCacheMapper;

    @Override
    public UserDto get(final String username) {
        return userCacheMapper.toDto(cache.get(username));
    }

    @Override
    public UserDto create(final String username, final String mail, final String phone) {
        var userDto = UserDto.builder()
                .username(username)
                .mail(mail)
                .phone(phone)
                .build();
        cache.put(username, userCacheMapper.toCacheModel(userDto));
        return userDto;
    }


}

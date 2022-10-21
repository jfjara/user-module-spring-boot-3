package com.jfjara.usermodule.domain.repository;

import com.jfjara.usermodule.domain.model.UserDto;

public interface UserRepository {

    UserDto get(final String username);
    UserDto create(final String username, final String mail, final String phone);

}

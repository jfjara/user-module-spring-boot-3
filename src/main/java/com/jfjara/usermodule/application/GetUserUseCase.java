package com.jfjara.usermodule.application;

import com.jfjara.usermodule.domain.model.UserDto;
import com.jfjara.usermodule.domain.repository.UserRepository;

public class GetUserUseCase {

    private final UserRepository userRepository;

    public GetUserUseCase(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto execute(final String username) {
        return userRepository.get(username);
    }
}

package com.jfjara.usermodule.boot.config;

import com.jfjara.usermodule.application.GetUserUseCase;
import com.jfjara.usermodule.infraestructure.customcache.repository.UserCacheRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public GetUserUseCase getUserUseCase(final UserCacheRepository userRepository) {
        return new GetUserUseCase(userRepository);
    }

}

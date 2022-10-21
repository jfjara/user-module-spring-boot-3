package com.jfjara.usermodule.boot.config;

import com.jfjara.usermodule.infraestructure.customcache.repository.UserCacheRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MockDataConfig {

    @Autowired
    private UserCacheRepository userCacheRepository;

    @PostConstruct
    private void createData() {
        userCacheRepository.create("jfjara", "jfjara@test.es", "955453212");
        userCacheRepository.create("jjb", "jjb@test.es", "955453212");
        userCacheRepository.create("juanjb", "juanjb@test.es", "955453212");
    }


}

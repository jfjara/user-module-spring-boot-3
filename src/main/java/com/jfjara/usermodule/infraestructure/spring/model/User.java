package com.jfjara.usermodule.infraestructure.spring.model;

import java.util.Objects;

public record User (String username, String phone, String mail) {

    public User {
        Objects.requireNonNull(username);
        Objects.requireNonNull(phone);
        Objects.requireNonNull(mail);
    }

}

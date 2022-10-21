package com.jfjara.usermodule.domain.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(toBuilder = true)
public class UserDto {

    private String username;
    private String phone;
    private String mail;

}

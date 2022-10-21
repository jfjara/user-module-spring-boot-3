package com.jfjara.usermodule.infraestructure.customcache.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(toBuilder = true)
public class UserCache {

    private String username;
    private String mail;
    private String phone;

}

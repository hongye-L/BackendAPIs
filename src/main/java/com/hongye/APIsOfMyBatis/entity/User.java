package com.hongye.APIsOfMyBatis.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * The type User.
 *
 * @author 竑也
 */
@Data
public class User implements Serializable {
    private String username;
    private String password;
    private String id;
    private String registration_time;
    @Override
    public String toString() {
        return "User{"+"id="+id+
                "，username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", registration_time="+registration_time+'}';
    }
}

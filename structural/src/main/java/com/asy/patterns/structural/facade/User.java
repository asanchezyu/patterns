package com.asy.patterns.structural.facade;

import java.util.Date;

/**
 * User entity.
 *
 * @author asanchezyu@gmail.com.
 * @version 1.0.
 * @since 25/4/16.
 */
public class User {

    private String username;

    private String password;

    private String system;

    private Date registrationDate;

    public User() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

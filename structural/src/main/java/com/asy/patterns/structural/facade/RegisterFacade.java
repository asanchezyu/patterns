package com.asy.patterns.structural.facade;

import java.util.Date;

/**
 * Facade for registration process.
 *
 * @author asanchezyu@gmail.com.
 * @version 1.0.
 * @since 25/4/16.
 */
public class RegisterFacade {

    private RegistrationManager registrationManager;

    public RegisterFacade() {

        registrationManager = new RegistrationManager();

    }

    public void registerUser(String username, String password) {

        User user = new User();

        user.setUsername(username);

        user.setPassword(password);

        user.setRegistrationDate(new Date());

        user.setSystem("MacOS X - 10.10.5");

        registrationManager.makeRegistry(user);

    }

}

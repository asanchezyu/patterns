package com.asy.patterns.structural.facade;

import java.text.SimpleDateFormat;

/**
 * Registration manager.
 *
 * @author asanchezyu@gmail.com.
 * @version 1.0.
 * @since 25/4/16.
 */
public class RegistrationManager {

    public void makeRegistry(User user) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

        System.out.println(
                "We'll made the registration for user with data: "
                        + "\n\tUsername:\t" + user.getUsername()
                        + "\n\tPassword:\t" + user.getPassword()
                        + "\n\tSystem:\t" + user.getSystem()
                        + " \n\tRegistration date:\t" + sdf.format(user.getRegistrationDate())
        );

        // We will make the registration in our system here.Database, rest services,etc...

    }

}

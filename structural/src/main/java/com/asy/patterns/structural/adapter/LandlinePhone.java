package com.asy.patterns.structural.adapter;

/**
 * LandlinePhone entity.
 *
 * @author asanchezyu@gmail.com.
 * @version 1.0.
 * @since 25/4/16.
 */
public class LandlinePhone implements Phone {

    @Override
    public void dialNumbers() {
        System.out.println("Dialing numbers from landline phone");
    }

    @Override
    public void makeCall() {
        System.out.println("Making phone call from landline phone");
    }
}

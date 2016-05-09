package com.asy.patterns.structural.adapter;

/**
 * Wrapper from {@link SmartPhone} to {@link Phone}.
 *
 * @author asanchezyu@gmail.com.
 * @version 1.0.
 * @since 25/4/16.
 */
public class SmartphoneWrapper implements Phone {

    private SmartPhone smartPhone = new SmartPhone();

    @Override
    public void dialNumbers() {
        smartPhone.touchScreenForNumbers();
    }

    @Override
    public void makeCall() {
        smartPhone.makePhoneCall();
    }
}

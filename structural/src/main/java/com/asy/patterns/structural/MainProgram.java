package com.asy.patterns.structural;

import com.asy.patterns.structural.adapter.LandlinePhone;
import com.asy.patterns.structural.adapter.Phone;
import com.asy.patterns.structural.adapter.SmartphoneWrapper;
import com.asy.patterns.structural.facade.RegisterFacade;
import com.asy.patterns.structural.proxy.HtmlWebParserProxy;
import com.asy.patterns.structural.proxy.WebParser;

public class MainProgram {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("ADAPTER");

        Phone landlinePhone = new LandlinePhone();
        Phone smartphoneWrapper = new SmartphoneWrapper();

        landlinePhone.makeCall();
        landlinePhone.dialNumbers();

        smartphoneWrapper.makeCall();
        smartphoneWrapper.dialNumbers();

        System.out.println("=================================");
        System.out.println("FACADE");
        RegisterFacade registerFacade = new RegisterFacade();
        registerFacade.registerUser("asanchezyu@gmail.com", "123456");


        System.out.println("=================================");
        System.out.println("PROXY");
        WebParser connection = new HtmlWebParserProxy("http://blog.asanchez-portfolio.es");
        System.out.println(connection.getHtmlContent());
        System.out.println(connection.getHtmlContent());

    }

}

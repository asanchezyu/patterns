package es.asy.patterns.creational;

import es.asy.patterns.creational.builder.Car;
import es.asy.patterns.creational.factorymethod.factory.ApplicationEnvironmentFactory;
import es.asy.patterns.creational.factorymethod.factory.EnvironmentFactory;
import es.asy.patterns.creational.factorymethod.model.Environment;
import es.asy.patterns.creational.singleton.DbManager;

/**
 * Class Description.
 *
 * @author asanchezy.
 * @version 1.0.
 * @since 22/4/16.
 */
public class Main {


    public static void main(String[] args) {

        //Builder sample
        Car car = new Car.Builder("1111-XXX", "987654321-W")
                .setColour("Blue")
                .setType("Van")
                .setYear("2016")
                .build();

        System.out.println("Driver License :" + car.getOwnerDrivingLicenseId() + "\t Colour :" + car.getColour());

        //Singleton Sample
        DbManager dbManager = DbManager.getInstance();
        System.out.println("Database name " + dbManager.getDbName());

        //Factory method Sample
        ApplicationEnvironmentFactory applicationEnvironmentFactory = new ApplicationEnvironmentFactory();

        Environment devEnvironment = applicationEnvironmentFactory.getEnvironment(EnvironmentFactory.EnvironmentType.DEVELOPMENT);
        Environment prodEnvironment = applicationEnvironmentFactory.getEnvironment(EnvironmentFactory.EnvironmentType.PRODUCTION);

        System.out.println("Development " + devEnvironment.getBlogUrl());
        System.out.println("Production " + prodEnvironment.getBlogUrl());
    }

}

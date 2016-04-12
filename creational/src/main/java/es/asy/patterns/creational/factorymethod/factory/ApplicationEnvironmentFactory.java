package es.asy.patterns.creational.factorymethod.factory;

import es.asy.patterns.creational.factorymethod.model.DevEnvironment;
import es.asy.patterns.creational.factorymethod.model.Environment;
import es.asy.patterns.creational.factorymethod.model.ProductionEnvironment;

/**
 * Class that represents one type of environment creator: Our application environment factory.
 *
 * @author asanchezyu@gmail.com.
 * @version 1.0.
 * @since 8/4/16.
 */
public class ApplicationEnvironmentFactory implements EnvironmentFactory {

    @Override
    public Environment getEnvironment(EnvironmentType environmentType) {
        Environment environment;

        switch (environmentType) {
            case DEVELOPMENT:
                environment = new DevEnvironment();
                break;
            case PRODUCTION:
                environment = new ProductionEnvironment();
                break;
            default:
                environment = new DevEnvironment();
                break;
        }

        return environment;
    }
}

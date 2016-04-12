package es.asy.patterns.creational.singleton;

/**
 * Database manager.
 *
 * @author asanchezyu@gmail.com.
 * @version 1.0.
 * @since 8/4/16.
 */
public class DbManager {

    private static volatile DbManager instance = null;

    private DbManager() {
        // No instances created from outside.
    }

    public static DbManager getInstance() {
        if (instance == null) {
            synchronized (DbManager.class) {
                if (instance == null) {
                    instance = new DbManager();
                }
            }
        }
        return instance;
    }

}
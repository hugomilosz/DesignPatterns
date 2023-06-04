package Singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // initialise fields in here
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

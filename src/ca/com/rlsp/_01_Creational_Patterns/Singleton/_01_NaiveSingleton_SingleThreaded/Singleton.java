package ca.com.rlsp._01_Creational_Patterns.Singleton._01_NaiveSingleton_SingleThreaded;

public final class Singleton {

    private static Singleton instance;
    public String someValue;

    private Singleton(String someValue) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.someValue = someValue;
    }

    public static Singleton getInstance(String someValue) {
        if(instance == null) {
            instance = new Singleton(someValue);
        }
        return instance;
    }
}

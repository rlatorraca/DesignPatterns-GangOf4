package ca.com.rlsp._01_Creational_Patterns.Singleton._01_SingletonThreadSafeLazyLoading;

public final class Singleton {

    // The field must be declared volatile so that double check lock would work correctly.
    private static volatile Singleton instance;

    public String someValue;

    private Singleton(String someValue) {
        this.someValue = someValue;
    }

    /**
     * The approach taken here is called double-checked locking (DCL). [https://refactoring.guru/java-dcl-issue]
     *
     * It exists to prevent race condition between multiple threads that may attempt to get singleton instance
     *    at the same time, creating separate instances as a result.
     *
     * It may seem that having the `result` variable here is completely pointless. There is, however, a very
     *    important caveat when implementing double-checked locking in Java, which is solved by introducing this
     *    local variable.
     *
     * @param someValue
     * @return
     */
    public static Singleton getInstance(String someValue) {


        Singleton result = instance;

        if (result != null) {
            return result;
        }
        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new Singleton(someValue);
            }
            return instance;
        }
    }

}

package ca.com.rlsp._01_Creational_Patterns.Singleton._01_NaiveSingleton_SingleThreaded;

public class DemoSingleThread {

    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (That is it !!!)" + "\n" +
                "If you see different values, then 2 singletons were created (Number 2 is ON)" + "\n\n" +
                "Final RESULT:" );
        Singleton singleton01 = Singleton.getInstance("Number01");
        Singleton singleton02 = Singleton.getInstance("Number02");
        System.out.println(singleton01.someValue);
        System.out.println(singleton02.someValue);
    }
}

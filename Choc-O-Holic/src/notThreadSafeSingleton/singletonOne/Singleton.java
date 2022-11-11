package notThreadSafeSingleton.singletonOne;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    //разные методы
    public String otherMetod() {
        return "otherMetod...";
    }
}

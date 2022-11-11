package improvement.сreationInAdvance;

// создаем экземпляр заранее
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    public String OtherMetods() {
        return "OtherMetods";
    }
}
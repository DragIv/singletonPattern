package improvement.сreationInAdvance;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.OtherMetods());
        // вызов уже имеющегося экземпляра
        Singleton singleton2 = Singleton.getInstance();
    }
}

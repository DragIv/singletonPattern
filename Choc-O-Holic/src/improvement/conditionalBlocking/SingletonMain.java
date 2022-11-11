package improvement.conditionalBlocking;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        // вызов уже имеющегося экземпляра
        Singleton singleton2 = Singleton.getInstance();
    }
}

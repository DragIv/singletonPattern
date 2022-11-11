package improvement.withEnum;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton singleton = Singleton.UNIQUE_INSTANCE;
        System.out.println(singleton.OtherMetods());
    }
}

package improvement.conditionalBlocking;

// решение с условной блокировкой для оптимизации затрат.
// В этом случае синхронизация будет выполняться только при первом вызове.


public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}

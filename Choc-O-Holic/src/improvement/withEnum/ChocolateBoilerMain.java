package improvement.withEnum;

public class ChocolateBoilerMain {
    public static void main(String[] args) {
        ChocolateBoiler3 chocolateBoiler = ChocolateBoiler3.UNIQUE_INSTANCE;
//        chocolateBoiler.boil();
//        chocolateBoiler.drain();
        chocolateBoiler.fill();

        // уже не выполнится тк бак заполнен.
        ChocolateBoiler3 chocolateBoiler2 = ChocolateBoiler3.UNIQUE_INSTANCE;
        chocolateBoiler.fill();
    }
}

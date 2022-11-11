package notThreadSafeSingleton.ChocolateBoiler;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    public ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    // Заполнение
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Заполнение");
        }
    }

    // Слить
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
            System.out.println("Слить");
        }
    }

    // Довести до кипения
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
        System.out.println("Довести до кипения");
    }
    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }

    // проблема многопоточного доступа
}
package notThreadSafeSingleton.ChocolateBoilerWthoutImprovement;

import notThreadSafeSingleton.ChocolateBoiler.ChocolateBoiler;


// решение класса одиночка с решением проблемы многопоточного доступа, но без ее усовершенствования.
public class ChocolateBoiler2 {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler2() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Создал бойлер");
            uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("Вернул бойлер");
        return uniqueInstance;
    }

    // Заполнить
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    // Слить
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    // Довести до кипения
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}

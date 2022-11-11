package improvement.withEnum;


public enum ChocolateBoiler3 {
    UNIQUE_INSTANCE;

    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler3() {
        empty = true;
        boiled = false;
    }


    // Заполнить
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Заполнить");
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
            System.out.println("Довести до кипения");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}




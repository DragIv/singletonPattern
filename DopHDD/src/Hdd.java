//With Enum
public enum Hdd {
    UNIQUE_INSTANCE;

    private boolean saved;
    private boolean empty;

    private Hdd() {
        empty = true;
        saved = false;
    }


    // Заполнить
    public void fill() {
        if (isEmpty()) {
            empty = false;
            saved = false;
            System.out.println("В жестком диске есть информация");
        }
    }

    // Удалить
    public void delite() {
        if (!isEmpty() && !isSaved()) {
            empty = true;
            System.out.println("Временная информация удалена");
        }
    }

    // Сохранить временную информацию
    public void save() {
        if (!isEmpty() && !isSaved()) {
            saved = true;
            System.out.println("Информация сохранена");
        }
    }

    // Удалить временную информацию
    public void deliteSave() {
        if (!isEmpty() && isSaved()) {
            empty = true;
            saved = false;
            System.out.println("Временная информация удалена");
        }
        else {
            System.out.println("Нечего удалять");
        }
    }


    public boolean isEmpty() {
        return empty;
    }

    public boolean isSaved() {
        return saved;
    }

}




//    private volatile static Window uniqueInstance;
//
//    private Window() {}
//
//    public static Window getInstance() {
//        if (uniqueInstance == null) {
//            synchronized (Window.class) {
//                if (uniqueInstance == null) {
//                    uniqueInstance = new Window();
//                }
//            }
//        }
//        return uniqueInstance;
//    }




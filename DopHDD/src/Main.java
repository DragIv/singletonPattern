public class Main {
    public static void main(String[] args) {
        Hdd hdd = Hdd.UNIQUE_INSTANCE;
        hdd.fill();
        hdd.save();
//        hdd.deliteSave();

        Hdd hdd2 = Hdd.UNIQUE_INSTANCE;
        System.out.println(hdd2.isSaved());
    }
}

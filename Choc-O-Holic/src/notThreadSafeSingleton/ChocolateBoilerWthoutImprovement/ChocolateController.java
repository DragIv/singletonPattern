package notThreadSafeSingleton.ChocolateBoilerWthoutImprovement;

import notThreadSafeSingleton.ChocolateBoiler.ChocolateBoiler;
import notThreadSafeSingleton.ChocolateBoilerWthoutImprovement.ChocolateBoiler2;

public class ChocolateController {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler2.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();

        //вернет существующий экземпляр
        ChocolateBoiler boiler2 = ChocolateBoiler2.getInstance();
    }
}

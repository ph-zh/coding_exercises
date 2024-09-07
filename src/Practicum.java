/*

 */
class Coffee {
    protected double espresso;
    protected double milk;

    public Coffee(double newEspresso, double newMilk) { // конструктор суперкласса
        espresso = newEspresso;
        milk = newMilk;
    }

    public double mixAndGetVolume() {
        return espresso + milk;
    }
}

class Cappuccino extends Coffee {

    public Cappuccino() {
        //вызываем конструктор суперкласса
        super(100.0, 250.0); // о ключевом слове super поговорим подробно чуть позже
    }
}

public class Practicum {
    public static void main(String[] args) {
        Cappuccino cappuccino = new Cappuccino();
        System.out.println("Объём капучино - " + cappuccino.mixAndGetVolume());
    }
}
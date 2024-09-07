/*

 */
class Coffee {
    protected double espresso;
    protected double milk;

    public Coffee() {
        espresso = 50.0;
        milk = 250.0;
    }

    public double mixAndGetVolume() {
        return espresso + milk;
    }
}

class Cappuccino extends Coffee {
    protected double espresso = 30.0;
}

public class Practicum {
    public static void main(String[] args) {
        Cappuccino cappuccino = new Cappuccino();
        System.out.println("Объём эспрессо - " + cappuccino.espresso);
    }
}
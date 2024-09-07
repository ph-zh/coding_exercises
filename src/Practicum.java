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
}

class Latte extends Coffee {
}

public class Practicum {
    public static void main(String[] args) {
        Cappuccino cappuccino = new Cappuccino();
        // напрямую используем метод суперкласса:
        System.out.println("Объём чашки капучино - " + cappuccino.mixAndGetVolume());
        Latte latte = new Latte();
        // напрямую используем переменную суперкласса:
        System.out.println("Объём эспрессо в латте - " + latte.espresso);
    }
}
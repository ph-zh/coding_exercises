/*
После расширения с помощью extends в классе-наследнике можно делать следующее:
Использовать унаследованные поля и методы напрямую.
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
    private double milkFoam; // добавили поле

    public double getMilkFoam() { // добавили метод
        milkFoam = milk/2; // использовали переменную суперкласса
        return milkFoam;
    }
}

public class Practicum {
    public static void main(String[] args) {
        Cappuccino cappuccino = new Cappuccino();
        System.out.println("Объём молочной пены - " + cappuccino.getMilkFoam());
    }
}
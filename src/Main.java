/*

 */

public class Main {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.makeCoffee("Капучино");
    }
}

class CoffeeMachine {

    public void makeCoffee(String coffeeType) {
        if (coffeeType.equals("Капучино")) {
            makeEspresso();
            addMilk();
        } else if (coffeeType.equals("Американо")) {
            makeEspresso();
            addWater();
        } else if (coffeeType.equals("Эспрессо")) {
            makeEspresso();
        } else {
            System.out.println("Такой тип кофе я не готовлю!");
        }

    }

    private void makeEspresso() {
        System.out.println("Приготовлено эспрессо.");
    }

    private void addMilk() {
        System.out.println("Добавлено молоко.");
    }

    private void addWater() {
        System.out.println("Добавлена вода.");
    }
}
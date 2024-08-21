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
        switch (coffeeType) {
            case "Капучино":
                makeEspresso();
                addMilk();
                break;
            case "Американо":
                makeEspresso();
                addWater();
                break;
            case "Эспрессо":
                makeEspresso();
                break;
            default:
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
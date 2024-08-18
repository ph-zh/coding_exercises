/*

 */
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Результат умножения = " + multiply(random));
    }

    static int multiply(Random random) {
        int argument = random.nextInt(100);
        System.out.println("Первый аргумент = " + argument);
        argument = random.nextInt(100);
        System.out.println("Второй аргумент = " + argument);
        return argument * argument;
    }
}
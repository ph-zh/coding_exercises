/*

 */

public class Main {

    public static void main(String[] args) {
        String language = "Java";

        switch (language) {
            case "Java":
                System.out.println("Java — это язык для всего.");
                break;
            case "Python":
                System.out.println("На Python часто обрабатывают данные и разрабатывают нейронные сети.");
                break;
            case "JavaScript":
                System.out.println("JavaScript - отличный выбор для веб-разработки");
                break;
            default:
                System.out.println("Про язык программирования " + language + " мы ничего не знаем.");
        }
    }
}
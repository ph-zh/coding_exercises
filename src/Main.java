/*

 */
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Россия", "Москва");
        capitals.put("Италия", "Рим");
        System.out.println("Столица России - " + capitals.get("Россия"));
    }
}
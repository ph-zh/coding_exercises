/*

 */
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> officeTool = new HashMap<>();
        officeTool.put("S234", "Большой степлер");
        officeTool.put("P342", "Чёрно-белый принтер");
        officeTool.put("N845", "Острые ножницы");

        String tool = officeTool.get("N845");
        System.out.println(tool); // Получили "Острые ножницы"
    }
}
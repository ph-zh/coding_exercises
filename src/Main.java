/*

 */

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> officeTool = new HashMap<>();
        officeTool.put("A234", "Большой степлер");
        officeTool.put("Z342", "Чёрно-белый принтер");
        officeTool.put("X845", "Острые ножницы");

        for (String inventory : officeTool.keySet()) {
            System.out.println(inventory);
        }
    }
}
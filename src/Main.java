/*
Напишите код: создайте хеш-таблицу statesCapitals и добавьте в неё страны с их столицами:
Канада → Торонто, Ирак → Багдад, Австрия → Вена. Затем исправьте допущенную ошибку:
столица Канады на самом деле Оттава. Хеш-таблицу распечатайте.
 */
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> statesCapitals = new HashMap<>();
        statesCapitals.put("Канада", "Торонто");
        statesCapitals.put("Ирак", "Багдад");
        statesCapitals.put("Австрия", "Вена");
        System.out.println(statesCapitals);
        statesCapitals.put("Канада", "Оттава");
        System.out.println(statesCapitals);
    }
}
/*

 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int action = scanner.nextInt();
        while (action != 0) {
            System.out.println(action);
            action = scanner.nextInt();
    }
  }
}
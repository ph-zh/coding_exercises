import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько вы хотите положить на счёт?");
        long money = scan.nextLong();
        bank.setMoney(money);
        System.out.println("На вашем счету " + bank.getMoney() + " руб.");
        System.out.println("Комиссия составила " + bank.getCommission() + " руб.");
    }
}

class Bank {
    private long money = 0;
    private int commission = 100; // доступ к полю ограничен

    public long getMoney() {
        return money;
    }

    public void setMoney(long newMoneyAmount) {
        calculateCommission(newMoneyAmount); // усложняем логику
        if (newMoneyAmount > 0 && newMoneyAmount > commission) {
            money = newMoneyAmount - commission;
        } else {
            commission = 0;
            System.out.println("Минимальная сумма - 51 рубль.");
        }
    }

    // Добавляем get-метод - комиссию можно будет показать пользователю
    public int getCommission() {
        return commission;
    }

    private void calculateCommission(long newMoneyAmount) {
        if (newMoneyAmount < 5000) {
            commission = 50;
        }
        else {
            commission = 100;
        }
    }
}
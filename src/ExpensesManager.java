import java.util.ArrayList;

public class ExpensesManager {
    ArrayList<Expense> expenses;

    ExpensesManager() {
        expenses = new ArrayList<>();
    }

    double saveExpense(double moneyBeforeSalary, double expense) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        expenses.add(new Expense(expense));
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.size(); i++) {
            Expense exp = expenses.get(i);
            System.out.println("Трата № " + (i + 1) + ". Потрачено " + exp.getValue() + " рублей, код транзакции: "+exp.getTransaction());
        }
    }

    double findMaxExpense() {
        double maxExpense = 0;
        for (Expense exp : expenses) {
            if (exp.getValue() > maxExpense) {
                maxExpense = exp.getValue();
            }
        }
        return maxExpense;
    }

    // Добавьте метод removeAllExpenses()
    // Текст для печати: "Список трат пуст."
    void removeAllExpenses() {
        expenses.clear();
        System.out.println("Список трат пуст.");
    }

            // Добавьте метод removeExpense(int transaction)
            /* Текст для печати: "Список трат пуст."
        "Трата удалена!"
        "Такой траты нет."
        - метод removeExpense(int transaction) должен проверять, содержится ли указанное пользователем значение в списке.
Если в списке нет ни одной траты, то нужно сообщить пользователю, что «Список трат пуст». Если трата найдена, то её нужно
удалить и сообщить об этом. Если указанной суммы расходов в списке нет, то нужно вывести на экран, что «Такой траты нет».
- В этом задании мы добавляем функцию поиска. Так как поиск по значению траты не будет точным (ведь могут существовать периодические
одинаковые траты, а сравнение чисел Double на одинаковость не может быть гарантировано), мы предлагаем перейти к использованию
класса-контейнера для значения трат и для хранения уникального номера этой траты (назовём его номером транзакции).
- Чтобы удалить элемент, вам потребуется вычислить его индекс — используйте для этого цикл и не забудьте его прервать. Найденный
индекс сохраните в переменную index. Обратите внимание, несмотря на наличие метода remove для элемента, в этом задании мы
предлагаем удалять первый найденный элемент по индексу.
        */
    void removeExpense(int transaction) {
        boolean isContains = expenses.contains(transaction);
        if(expenses.isEmpty()) {
            System.out.println("Список трат пуст.");
        } else {
            if(isContains) {
                expenses.remove(transaction);
                System.out.println("Трата удалена!");
            } else {
                System.out.println("Такой траты нет.");
            }
        }
    }

}
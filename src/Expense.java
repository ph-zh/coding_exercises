public class Expense {

    //величина траты
    private double value;

    //номер транзакции
    private int transaction;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Integer getTransaction() {
        return transaction;
    }

    public void setTransaction(Integer transaction) {
        this.transaction = transaction;
    }
    
    public Expense(double value) {
        this.value = value;
        this.transaction = (int) (Math.random() * 1000000); //реализуйте создание уникального номера транзакции
    }
}
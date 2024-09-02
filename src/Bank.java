class Bank {
    private long money = 0;

    // создаём get-метод - с помощью него сможем получить значение money
    public long getMoney() {
        return money;
    }

    // создаём set-метод - он позволяет сохранить в money новое значение
    public void setMoney(long newMoneyAmount) {
        if (newMoneyAmount > 0) { // можно сохранить только положительные значения
            money = newMoneyAmount;
        }
    }
}
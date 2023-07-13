public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount += sum;
    }

    public void withdraw(double sum) throws LimitException{
        if (sum > amount){
            throw new LimitException("Сумма на снятие больше, чем остаток на счёте", + amount);
        }
        amount -= sum;
    }
}

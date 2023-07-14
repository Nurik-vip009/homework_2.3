public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(15000);

        double withdrawalAmount = 6000;
        try {
            while (true){
                account.withdraw(withdrawalAmount);
            }
        } catch (LimitException e) {
            System.out.println("Произошло исключение: " + e.getMessage());
            System.out.println("Снято только: " + e.getRemainingAmount() + " сом");

            try {
                account.withdraw(e.getRemainingAmount());
            } catch (LimitException ex) {
                System.out.println("Произошло исключение при снятии остатка: " + ex.getMessage());
            }
        }
    }
}
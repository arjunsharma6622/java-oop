public class Main {
    public static void main(String[] args) {

        BankAccount acc1;
        acc1 = new BankAccount();
        acc1.balance = 1000;
        acc1.ownerName = "Arjun Sharma";

        acc1.deposit(500);
        acc1.showDetails();

        acc1.withdraw(2000);

        acc1.withdraw(1000);
        acc1.showDetails();
    }
}
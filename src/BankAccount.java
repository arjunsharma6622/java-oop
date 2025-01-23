
public class BankAccount {
    public int balance;
    public String ownerName;

    public void deposit(int amount){
        this.balance += amount;
        System.out.println("Amount deposited.\nAvailable balance : " + this.balance);
    }

    public void withdraw(int amount){
        if(amount > this.balance){
            System.out.println("Insufficient balance.\nAvailable balance : "+ this.balance);
        }
        else{
            this.balance -= amount;
            System.out.println("Amount withdrawn.\nAvailable balance : "+ this.balance);
        }
    }

    public void showDetails(){
        System.out.println("Owner name : " + this.ownerName);
        System.out.println("Balance : " + this.balance);
    }
}

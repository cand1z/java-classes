package utilities;

public class BankAccount {
    private int number;
    private String holder;
    private double balance;

    public int getNumber() {
        return number;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount(int number, String name){
        holder = name;
        this.number = number;
    }

    public BankAccount(int number, String name, double amount){
        holder = name;
        this.number = number;
        balance = amount;
    }

    public void bankDraft(double amount){
        balance -= amount + 5;
    }

    public void bandDeposit(double amount){
        balance += amount;
    }

    public String toString(){
        return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
    }
}

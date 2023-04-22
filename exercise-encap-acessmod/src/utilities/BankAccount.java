package utilities;

public class BankAccount {
    private final double TAX;

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
        TAX = 5.00;
    }

    public BankAccount(int number, String name, double amount){
        holder = name;
        this.number = number;
        balance = amount;
        TAX = 5.00;
    }

    public void bankDraft(double amount){
        balance = balance - amount - TAX;
    }

    public void bandDeposit(double amount){
        balance += amount;
    }

    public String toString(){
        return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
    }
}

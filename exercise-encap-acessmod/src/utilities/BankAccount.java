package utilities;

public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double amount;

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    private final double TAX;

    public BankAccount(int number, String name){
        accountHolder = name;
        accountNumber = number;
        TAX = 5.00;
    }

    public BankAccount(int number, String name, double amount){
        accountHolder = name;
        accountNumber = number;
        this.amount = amount;
        TAX = 5.00;
    }

    public void bankDraft(double amount){
        this.amount = this.amount - amount - TAX;
    }

    public void bandDeposit(double amount){
        this.amount += amount;
    }

    public String toString(){
        return "Account " + accountNumber + ", Holder: " + accountHolder + ", Balance: $ " + amount;
    }
}

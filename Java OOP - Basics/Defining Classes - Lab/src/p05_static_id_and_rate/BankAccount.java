package p05_static_id_and_rate;

class BankAccount {
    private static int id;
    private static int counter;

    private double balance = 0;
    private static double interestRate = 0.02;

    BankAccount() {
        id = ++counter;
    }

    public static int getId() { return id; }
    public static void setId(int id) { BankAccount.id = id; }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interest) {
        BankAccount.interestRate = interest;
    }

    public double getInterest(int years) {
        return this.balance * BankAccount.interestRate * years;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public String toString() {
        return "ID" + id;
    }
}

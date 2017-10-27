package p04_define_person_class;

class BankAccount {
    private int id;
    private double balance;

    BankAccount (int id){
        this.id = id;
        this.balance = 0.0;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    void withdraw(double amount) {
        if (this.balance - amount >= 0) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    @Override
    public String toString() {
        return String.format("Account ID%d, balance %.2f", this.id, this.balance);

    }
}

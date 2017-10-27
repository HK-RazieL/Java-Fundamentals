package p02_getters_and_setters;

class BankAccount {
    private int id;
    private double balance;

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit (double amount) {
        this.balance += amount;
    }

    public void withdrawal (double amount) {
        if (this.balance - amount > 0) {
            this.balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "ID" + this.id;
    }
}

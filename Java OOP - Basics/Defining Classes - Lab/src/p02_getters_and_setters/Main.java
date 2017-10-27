package p02_getters_and_setters;

public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        ba.setId(1);
        ba.deposit(15);
        ba.withdrawal(5);
        ba.deposit(20);

        System.out.printf("Account %s, balance %.2f", ba, ba.getBalance());
    }
}

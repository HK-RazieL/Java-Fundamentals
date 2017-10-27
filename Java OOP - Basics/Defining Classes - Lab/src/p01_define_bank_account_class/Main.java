package p01_define_bank_account_class;

public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        ba.id = 1;
        ba.balance = 15;

        System.out.printf("Account ID%d, balance %.2f", ba.id, ba.balance);
    }
}

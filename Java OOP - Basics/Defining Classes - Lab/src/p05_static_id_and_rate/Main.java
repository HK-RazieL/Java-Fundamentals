package p05_static_id_and_rate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static HashMap<Integer, BankAccount> clients = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] input = reader.readLine().split(" ");
            if (input[0].equalsIgnoreCase("End")) break;

            switch (input[0]) {
                case "Create":
                    createBankAccount();
                    break;
                case "Deposit":
                    depositAmount(Integer.valueOf(input[1]), Double.valueOf(input[2]));
                    break;
                case "SetInterest":
                    setInterest(Double.valueOf(input[1]));
                    break;
                case "GetInterest":
                    getInterest(Integer.valueOf(input[1]), Integer.valueOf(input[2]));
                    break;
            }
        }
    }

    private static void setInterest(double interest) {
        BankAccount.setInterestRate(interest);
    }

    public static void createBankAccount() {
            BankAccount ba = new BankAccount();
            clients.put(BankAccount.getId(), ba);
            System.out.printf("Account ID%s created\n", BankAccount.getId());

    }

    public static void depositAmount(int id, double amount) {
            if (clients.containsKey(id)) {
                clients.get(id).deposit(amount);
                System.out.printf("Deposited %.0f to ID%d\n", amount, id);
            } else {
                System.out.println("Account does not exist");
            }
    }

    public static void getInterest(int id, int years) {
        if (clients.containsKey(id)) {
            clients.get(id).getInterest(years);
            System.out.printf("%.2f\n", clients.get(id).getInterest(years));
        } else {
            System.out.println("Account does not exist");
        }
    }
}

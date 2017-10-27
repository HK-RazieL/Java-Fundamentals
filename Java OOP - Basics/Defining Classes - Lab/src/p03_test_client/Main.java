package p03_test_client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    private static HashMap<Integer, BankAccount> clients = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            String[] input = reader.readLine().split(" ");
            if (input[0].equalsIgnoreCase("end")) break;

            switch (input[0]) {
                case "Create":
                    createAccount(Integer.valueOf(input[1]));
                    break;
                case "Deposit":
                    depositSum(Integer.valueOf(input[1]), Double.valueOf(input[2]));
                    break;
                case "Withdraw":
                    withdrawSum(Integer.valueOf(input[1]), Double.valueOf(input[2]));
                    break;
                case "Print":
                    print(Integer.valueOf(input[1]));
                    break;
            }
        }
    }

    private static void createAccount(Integer id) {
        if (clients.containsKey(id)) {
            System.out.println("Account already exists");
        } else {
            BankAccount ba = new BankAccount(id);
            clients.put(id, ba);
        }
    }

    private static void depositSum(Integer id, Double amount) {
        if (!clients.containsKey(id)) {
            System.out.println("Account does not exist");
        } else {
            clients.get(id).deposit(amount);
        }
    }

    private static void withdrawSum(Integer id, Double amount) {
        if (!clients.containsKey(id)) {
            System.out.println("Account does not exist");
        } else {
            clients.get(id).withdraw(amount);
        }
    }

    private static void print(Integer id) {
        if (!clients.containsKey(id)) {
            System.out.println("Account does not exist");
        } else {
            System.out.println(clients.get(id));
        }
    }


}

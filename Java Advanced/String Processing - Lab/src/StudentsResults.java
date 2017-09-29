import java.util.Scanner;

public class StudentsResults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        String[][] students = new String[number][5];
        String[] names = new String[number];
        double[] jadv = new double[number];
        double[] oop = new double[number];
        double[] advoop = new double[number];
        double[] average = new double[number];

        for (int i = 0; i < number; i++) {
            students[i] = scan.nextLine().split(",\\s|[\\s-\\s]+");
            names[i] = students[i][0];
            jadv[i] = Double.parseDouble(students[i][1]);
            oop[i] = Double.parseDouble(students[i][2]);
            advoop[i] = Double.parseDouble(students[i][3]);
            average[i] = (jadv[i] + oop[i] + advoop[i]) / 3;

        }


        System.out.printf("%-7s|%7s|%7s|%7s|%7s|\n", "Name", "JAdv", "JavaOOP", "AdvOOP", "Average");
        for (int i = 0; i < number; i++) {
                System.out.printf("%-7s|%7.2f|%7.2f|%7.2f|%7.4f|\n", names[i], jadv[i], oop[i], advoop[i], average[i]);


        }
    }
}

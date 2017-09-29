import java.util.Scanner;

public class StudentsResultsWorseVersion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] students = scan.nextLine().split(",\\s|[\\s-\\s]+");
        String names = students[0];
        double jadv = Double.parseDouble(students[1]);
        double oop = Double.parseDouble(students[2]);
        double advoop = Double.parseDouble(students[3]);
        double average = (jadv + oop + advoop) / 3;


        System.out.printf("%-10s|%7s|%7s|%7s|%7s|\n", "Name", "JAdv", "JavaOOP", "AdvOOP", "Average");
        System.out.printf("%-10s|%7.2f|%7.2f|%7.2f|%7.4f|\n", names, jadv, oop, advoop, average);

    }
}

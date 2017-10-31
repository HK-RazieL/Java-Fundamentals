package p04_company_roster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfEmployees = Integer.parseInt(reader.readLine());
        Map<String, List<Employee>> employeesByDepartment = new HashMap<>();

        while (numberOfEmployees-- > 0) {
            String[] person = reader.readLine().split("\\s+");

            Employee employee = null;

            switch (person.length) {
                case 4:
                    employee = new Employee(person[0], Double.parseDouble(person[1]), person[2], person[3]);
                    break;
                case 5:
                    if (person[4].contains("@")) {
                        employee = new Employee(person[0], Double.parseDouble(person[1]), person[2], person[3], person[4]);
                    } else {
                        employee = new Employee(person[0], Double.parseDouble(person[1]), person[2], person[3], Integer.parseInt(person[4]));
                    }
                    break;
                case 6:
                    employee = new Employee(person[0], Double.parseDouble(person[1]), person[2], person[3], person[4], Integer.parseInt(person[5]));
                    break;
            }

            if (!employeesByDepartment.containsKey(employee.getDepartment())) {
                employeesByDepartment.putIfAbsent(employee.getDepartment(), new ArrayList<>());
            }
            employeesByDepartment.get(employee.getDepartment()).add(employee);

        }

        employeesByDepartment.entrySet()
                .stream()
                .sorted((d1, d2) -> Double.compare(d2.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble(),
                        d1.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble())).limit(1).forEach(d -> {
            StringBuilder sb = new StringBuilder(String.format("Highest Average Salary: %s%n", d.getKey()));

            d.getValue().stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(e -> sb.append(e).append(System.lineSeparator()));
            System.out.println(sb.toString());
        });
    }
}

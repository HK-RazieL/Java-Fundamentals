package p08_military_elite;

import java.util.LinkedHashMap;
import java.util.Map;

public class Engineer extends SpecializedSoldier implements ISoldier, IPrivate, ISpecialisedSoldier {

    Map<String, Integer> repairs = new LinkedHashMap<>();

    public Engineer(int id, String firstName, String lastName, double salary, String corpse) {
        super(id, firstName, lastName, salary, corpse);
        this.corpse = corpse;
    }

    public void addRepairs(String part, int hours) {
       this.repairs.put(part, hours);
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String getCorps() {
        return this.corpse;
    }

    @Override
    public String toString() {
        System.out.printf("Name: %s %s Id: %d Salary: %.2f%nCorps: %s%nRepairs:", this.firstName, this.lastName, this.id, this.salary, this.corpse);
        for (Map.Entry<String, Integer> s : repairs.entrySet()) {
            System.out.printf("%n  Part Name: %s Hours Worked: %d", s.getKey(), s.getValue());
        }
        return "";
    }

    @Override
    public void completeMission(String missionName) {

    }
}

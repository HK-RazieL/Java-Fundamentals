package p08_military_elite;

public class Private extends Soldier implements IPrivate {

    double salary;

    public Private(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
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
    public String toString() {
        return String.format("Name: %s %s Id: %d Salary: %.2f", this.firstName, this.lastName, this.id, this.salary);
    }

    @Override
    public void addMission(String codeName, String status) {

    }

    @Override
    public void completeMission(String missionName) {

    }

    @Override
    public void addRepairs(String part, int hours) {

    }

    @Override
    public void addPrivates(Private id) {

    }

    @Override
    public String getCorps() {
        return null;
    }
}

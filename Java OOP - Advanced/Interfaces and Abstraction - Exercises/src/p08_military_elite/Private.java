package p08_military_elite;

public class Private extends Soldier implements IPrivate {

    private double salary;

    public Private(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Salary: %.2f", this.salary);
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

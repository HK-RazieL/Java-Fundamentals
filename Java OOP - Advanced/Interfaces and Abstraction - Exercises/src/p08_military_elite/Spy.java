package p08_military_elite;

public class Spy extends Soldier implements ISpy{

    int codeNumber;

    public Spy(int id, String firstName, String lastName, int codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
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
    public int getCodeNumber() {
        return this.codeNumber;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %d%nCode Number: %d", this.firstName, this.lastName, this.id, this.codeNumber);
    }

    @Override
    public double getSalary() {
        return 0;
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
    public String getCorps() {
        return null;
    }

    @Override
    public void addPrivates(Private id) {

    }
}

package p08_military_elite;

public class Spy extends Soldier implements ISpy {

    private int codeNumber;

    public Spy(int id, String firstName, String lastName, int codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public int getCodeNumber() {
        return 0;
    }

    @Override
    public double getSalary() {
        return 0;
    }


    @Override
    public String getCorps() {
        return null;
    }

    @Override
    public void addPrivates(Private id) {

    }

    @Override
    public String toString() {
        return super.toString() + String.format("%nCode Number: %d", this.codeNumber);

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
}
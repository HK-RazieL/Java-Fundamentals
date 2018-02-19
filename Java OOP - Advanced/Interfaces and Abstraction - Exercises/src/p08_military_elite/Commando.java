package p08_military_elite;

import java.util.LinkedHashMap;
import java.util.Map;

public class Commando extends SpecializedSoldier implements ISoldier, ISpecialisedSoldier, ICommando {

    Map<String, String> missions = new LinkedHashMap<>();

    public Commando(int id, String firstName, String lastName, double salary, String corpse) {
        super(id, firstName, lastName, salary, corpse);
        this.missions = new LinkedHashMap<>();
    }

    public void completeMission(String missionName) {
        if (this.missions.containsKey(missionName)){
            this.missions.replace(missionName, "Finished");
        }
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
    public String getCorps() {
        return this.corpse;
    }

    @Override
    public String toString() {
        System.out.printf("Name: %s %s Id: %d Salary: %.2f%nCorps: %s%nMissions:", this.firstName, this.lastName, this.id, this.salary, this.corpse);
        for (Map.Entry<String,String> s : missions.entrySet()) {
            System.out.printf("%n Code Name: %s State: %s", s.getKey(), s.getValue());
        }
        return "";
    }

    @Override
    public void addMission(String codeName, String status) {
        this.missions.put(codeName, status);
    }

    @Override
    public void addRepairs(String part, int hours) {

    }

    @Override
    public void addPrivates(Private id) {

    }
}

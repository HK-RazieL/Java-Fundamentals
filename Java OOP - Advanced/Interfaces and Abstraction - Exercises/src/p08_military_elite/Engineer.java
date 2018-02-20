package p08_military_elite;

import java.util.LinkedHashMap;
import java.util.Map;

public class Engineer extends SpecializedSoldier implements ISoldier, IPrivate, ISpecialisedSoldier {

    private Map<String, Integer> repairs = new LinkedHashMap<>();

    public Engineer(int id, String firstName, String lastName, double salary, String corpse) {
        super(id, firstName, lastName, salary, corpse);
    }

    public void addRepairs(String part, int hours) {
       this.repairs.put(part, hours);
    }


    @Override
    public String toString() {
        System.out.printf("%s%n%s%nRepairs:", super.toString(), super.getCorps());
        for (Map.Entry<String, Integer> s : repairs.entrySet()) {
            System.out.printf("%n Part Name: %s Hours Worked: %d", s.getKey(), s.getValue());
        }
        return "";
    }

    @Override
    public void completeMission(String missionName) {

    }
}

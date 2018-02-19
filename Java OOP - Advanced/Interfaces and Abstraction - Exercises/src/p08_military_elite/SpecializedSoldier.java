package p08_military_elite;

public class SpecializedSoldier extends Private implements ISpecialisedSoldier {

    String corpse;

    public SpecializedSoldier(int id, String firstName, String lastName, double salary, String corpse) {
        super(id, firstName, lastName, salary);
        this.corpse = corpse;
    }

    @Override
    public String getCorps() {
        return null;
    }

}

package p08_military_elite;

import java.util.ArrayList;
import java.util.List;

public class LeutenantGeneral extends Private implements ILeutenantGeneral, IPrivate {

    private List<Private> privates = new ArrayList<>();

    public LeutenantGeneral(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
    }

    @Override
    public String toString() {
        privates.sort((x,y) -> Integer.compare(y.getId(), x.getId()));
        System.out.printf("%s%nPrivates:", super.toString());
        for (Private p : privates) {
            System.out.printf("%n %s", p.toString());
        }
        return "";
    }

    @Override
    public void addPrivates(Private id) {
        this.privates.add(id);
    }

    @Override
    public void completeMission(String missionName) {

    }
}

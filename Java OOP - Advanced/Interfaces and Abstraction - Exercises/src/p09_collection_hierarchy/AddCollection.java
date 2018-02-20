package p09_collection_hierarchy;

import java.util.ArrayList;
import java.util.List;

public class AddCollection {

    private List<String> list = new ArrayList<>();
    private StringBuilder sbAdd = new StringBuilder();

    public void Add (String string) {
        this.list.add(string);
        this.sbAdd.append(this.list.size() - 1);
        this.sbAdd.append(" ");
    }

    public String Print(){
        return String.format("%s", this.sbAdd.toString().trim());
    }
}
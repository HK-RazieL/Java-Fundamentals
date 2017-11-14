package its_in_the_blood.entity;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Organism {
    private String name;
    public LinkedHashMap<String, Cluster> clusters;

    public Organism(String name) {
        this.name = name;
        this.clusters = new LinkedHashMap<>();
    }

    public String getOrganismName() {
        return this.name;
    }

    public HashMap<String, Cluster> getClusters() {
        return this.clusters;
    }

    public int totalCells(){
        int sum = 0;
        for (Map.Entry<String, Cluster> s : clusters.entrySet()) {
            sum += s.getValue().cells.size();
        }
        return sum;
    }

    @Override
    public String toString() {
        return String.format("----Cluster %s", this.name);
    }
}

package its_in_the_blood.entity;

import its_in_the_blood.entity.cells.Cell;
import java.util.ArrayList;

public class Cluster {
    private String name;
    private int rows;
    private int cols;
    public ArrayList<Cell> cells;

    public Cluster(String name, int rows, int cols) {
        this.name = name;
        this.rows = rows;
        this.cols = cols;
        this.cells = new ArrayList<>();
    }

    public ArrayList<Cell> getCells(){
        return this.cells;
    }

    public String getClusterName() {
        return this.name;
    }

    @Override
    public String toString() {
        return String.format("----Cluster %s", this.name);
    }
}

package its_in_the_blood.entity.cells;

public class Cell{
    public String id;
    private int health;
    private int positionRow;
    private int positionCol;

    public Cell(String id, int health, int positionRow, int positionCol) {
        this.id = id;
        this.health = health;
        this.positionRow = positionRow;
        this.positionCol = positionCol;
    }

    public int getHealth() {
        return this.health;
    }

    public String getId() {
        return this.id;
    }

    public int getPositionRow() {
        return this.positionRow;
    }

    public int getPositionCol() {
        return this.positionCol;
    }

    @Override
    public String toString() {
        return String.format("%s [%d,%d]\n", this.id, this.positionRow, this.positionCol);
    }
}

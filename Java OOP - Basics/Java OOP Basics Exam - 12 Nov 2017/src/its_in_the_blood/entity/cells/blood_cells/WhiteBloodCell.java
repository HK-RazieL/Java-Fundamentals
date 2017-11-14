package its_in_the_blood.entity.cells.blood_cells;

public class WhiteBloodCell extends BloodCell{
    private int size;

    public WhiteBloodCell(String id, int health, int positionRow, int positionCol, int size) {
        super(id, health, positionRow, positionCol);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return String.format("Size: %d | Energy: %d", this.size, (super.getHealth() + this.size) * 2);
    }
}

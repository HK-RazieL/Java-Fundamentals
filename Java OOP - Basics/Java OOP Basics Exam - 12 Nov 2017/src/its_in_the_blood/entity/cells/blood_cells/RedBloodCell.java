package its_in_the_blood.entity.cells.blood_cells;

public class RedBloodCell extends BloodCell{
    private int velocity;

    public RedBloodCell(String id, int health, int positionRow, int positionCol, int velocity) {
        super(id, health, positionRow, positionCol);
        this.velocity = velocity;
    }

    @Override
    public String toString() {
        return String.format("Velocity: %d | Energy: %d", this.velocity, super.getHealth() + this.velocity);
    }
}

package its_in_the_blood.entity.cells.blood_cells;

import its_in_the_blood.entity.cells.Cell;

public abstract class BloodCell extends Cell {
    public BloodCell(String id, int health, int positionRow, int positionCol) {
        super(id, health, positionRow, positionCol);
    }
}

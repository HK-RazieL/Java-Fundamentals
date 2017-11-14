package its_in_the_blood.entity.cells.microbes;

public class Fungi extends Microbe{
    private int virulence;

    public Fungi(String id, int health, int positionRow, int positionCol, int virulence) {
        super(id, health, positionRow, positionCol, virulence);
    }

    @Override
    public String toString() {
        return String.format("Virulence: %d | Energy: %d", this.virulence, (super.getHealth() + this.virulence) / 4);
    }
}

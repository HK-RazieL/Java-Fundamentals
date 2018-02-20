package p10_mood_3;

public class Demon extends CharacterType implements Characters {

    public Demon(String username, String charType, double specialPoints, int level) {
        super(username, charType, specialPoints, level);
    }

    @Override
    public String hashedPassword() {
        return String.valueOf(this.username.length() * 217);
    }

    @Override
    public String specialPoints() {
        return String.format("%.1f", this.specialPoints * this.level);
    }

    @Override
    public String toString() {
        return String.format("\"%s\" | \"%s\" -> %s%n%s", this.username, this.hashedPassword(), this.charType, this.specialPoints());
    }
}

package p10_mood_3;

public class Archangel extends CharacterType implements Characters {
    Archangel(String username, String charType, double specialPoints, int level) {
        super(username, charType, specialPoints, level);
    }

    @Override
    public String hashedPassword() {
        StringBuilder sb = new StringBuilder();
        return sb.append(this.username).reverse().append(this.username.length() * 21).toString();
    }

    @Override
    public String specialPoints() {
        return String.format("%.0f", this.specialPoints * this.level);
    }

    @Override
    public String toString() {
        return String.format("\"%s\" | \"%s\" -> %s%n%s", this.username, this.hashedPassword(), this.charType, this.specialPoints());
    }
}

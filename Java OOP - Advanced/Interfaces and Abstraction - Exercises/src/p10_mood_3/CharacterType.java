package p10_mood_3;

public abstract class CharacterType {
    String username;
    String charType;
    int level;
    double specialPoints;

     CharacterType(String username, String charType, double specialPoints, int level) {
        this.username = username;
        this.charType = charType;
        this.level = level;
        this.specialPoints = specialPoints;
    }
}

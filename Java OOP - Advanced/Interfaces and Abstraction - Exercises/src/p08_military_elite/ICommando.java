package p08_military_elite;

public interface ICommando extends ISpecialisedSoldier{
    void addMission(String codeName, String status);
    void completeMission(String missionName);
}

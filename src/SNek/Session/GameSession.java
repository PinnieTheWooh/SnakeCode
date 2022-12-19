package SNek.Session;

import SNek.Size.Size;
import SNek.Versions.Version;

public class GameSession {
    private Size dimension;
    private Difficulty spawnRateWall;
    private Version version;

    public GameSession(Size dimension, Difficulty spawnRateWall, Version version) {
        this.dimension = dimension;
        this.spawnRateWall = spawnRateWall;
        this.version =version;
    }

    public GameSession() {
    }

    public void setDimension(Size dimension) {
        this.dimension = dimension;
    }

    public void setSpawnRateWall(Difficulty spawnRateWall) {
        this.spawnRateWall = spawnRateWall;
    }

    public void setControls(Version version) {
        this.version = version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "GameSession{\n" +
                "dimension= " + dimension +
                "\nspawnRateWall= " + spawnRateWall +
                "\nversion= " + version +
                "\n}";
    }

    public static void main(String[] args) {
        MainMenu.startSettings();
        MainMenu.menuSelect();

    }

}

package SNek.PlayArea;

import SNek.Session.Difficulty;
import SNek.Session.GameSession;
import SNek.Size.Size;

import java.time.LocalDateTime;
import java.util.Scanner;

public class  SpawnRateWall {
    private double frequency;

    public SpawnRateWall(double frequency) {
        this.frequency = frequency;
    }

    public double getFrequency() {
        return frequency;
    }

}

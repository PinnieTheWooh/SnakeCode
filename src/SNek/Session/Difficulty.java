package SNek.Session;

import SNek.PlayArea.SpawnRateWall;
import SNek.Size.Size;

import java.util.Scanner;

public enum Difficulty {
    EASY,NORMAL,HARD,IMPOSSIBLE,GOD;
    public SpawnRateWall spawnRateWall(){
        return switch (this){
            case EASY -> new SpawnRateWall(3);
            case NORMAL -> new SpawnRateWall(2.5);
            case HARD -> new SpawnRateWall(2);
            case IMPOSSIBLE -> new SpawnRateWall(1.5);
            case GOD -> new SpawnRateWall(1);
        };
    }
    public static Difficulty setDifficulty(){

        Scanner scanner = new Scanner(System.in);
        System.out.print(String.format("-_-_-_-_-_-_-_-_-&&-_-_-_-_-_-_-_-_-\n|%-35s|\n|%-35s|\n|%-35s|\n|%-35s|\n|%-35s|\n|%-35s|\n|%-35s|\n|%-35s: ",
                "welke Difficulty moet",
                "het spel hebben?",
                "1. EASY",
                "2. NORMAL",
                "3. HARD",
                "4. IMPOSSIBLE",
                "5. GOD",
                "Keuze"));
        String var1 = scanner.nextLine();
        try {
            Difficulty difficulty=Difficulty.valueOf(var1.toUpperCase());
            System.out.println(String.format("-_-_-_-_-_-_-_-_-&&-_-_-_-_-_-_-_-_-\n|%-35s|",
                    "deze Difficulty bestaad WEL"));
            return difficulty;
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(String.format("-_-_-_-_-_-_-_-_-&&-_-_-_-_-_-_-_-_-\n|%-35s|",
                    "deze Difficulty bestaad NIET"));
            return Difficulty.NORMAL;
        }
    }
}

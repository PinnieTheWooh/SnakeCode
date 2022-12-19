package SNek.Session;

import SNek.PlayArea.Board;
import SNek.Size.Size;
import SNek.Versions.Version;

import java.util.Scanner;

public class MainMenu {
    public static GameSession gameSession=new GameSession();
    public static void menuSelect() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(String.format("-_-_-_-_-_-_-_-_-&&-_-_-_-_-_-_-_-_-\n|%-35s|\n|%-35s|\n|%-35s|\n|%-35s|\n|%35s:",
                "Welkom bij SNek",
                "Wat wil je doen?",
                "Spel Spelen.(spelen).",
                "Settings.(settings)",
                "Keuze"));
        String keuze = scanner.nextLine();
        if (keuze.toUpperCase().equals("SETTINGS")) {
            editSettings();
        } else if (keuze.toUpperCase().equals("SPELEN")) {
            System.out.println("dit is SNek SNek SNEk");
            System.out.println(gameSession);
        }

    }
    public static void startSettings() {
        Size size = Board.setSize();
        Difficulty difficulty = Difficulty.setDifficulty();
        Version version=Version.setVersion();
        //hier komt Controls
        gameSession.setDimension(size);
        gameSession.setSpawnRateWall(difficulty);
        gameSession.setVersion(version);
        GameSession gameSession = new GameSession(size, difficulty,version);
    }
    public static void editSettings() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(String.format("-_-_-_-_-_-_-_-_-&&-_-_-_-_-_-_-_-_-\n|%-35s|\n|%-35s|\n|%-35s|\n|%-35s|\n|%-35s|\n|%35s:",
                "Wat wil je aanpassen.",
                "Size.",
                "Difficulty.",
                "Version.",
                "Back.",
                "Keuze"));
        String keuze2 = scanner.nextLine();
        if (keuze2.toUpperCase().equals("SIZE")) {
            gameSession.setDimension(Board.setSize());
            editSettings();
        } else if (keuze2.toUpperCase().equals("DIFFICULTY")) {
            gameSession.setSpawnRateWall(Difficulty.setDifficulty());
            editSettings();
        } else if (keuze2.toUpperCase().equals("VERSION")) {
            gameSession.setVersion(Version.setVersion());
            editSettings();
        }  //hier volgt version en controls
        else if (keuze2.toUpperCase().equals("BACK")) {
            menuSelect();
        }
    }
}


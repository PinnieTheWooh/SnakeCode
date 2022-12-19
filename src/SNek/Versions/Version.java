package SNek.Versions;

import SNek.Session.Difficulty;

import java.lang.constant.Constable;
import java.util.Scanner;

public enum Version {
    INVERSE,NORMAL;
    public Constable version(){
        return switch (this){
            case NORMAL -> Normal.testModule();
            case INVERSE -> Inverse.testModule();
        };
    }
    public static Version setVersion(){

        Scanner scanner = new Scanner(System.in);
        System.out.print(String.format("-_-_-_-_-_-_-_-_-&&-_-_-_-_-_-_-_-_-\n|%-35s|\n|%-35s|\n|%-35s|\n|%-35s: ",
                "welke Versie wil je spelen",
                "1. NORMAL",
                "2. INVERSE",
                "Keuze"));
        String var1 = scanner.nextLine();
        try {
            Version version=Version.valueOf(var1.toUpperCase());
            System.out.println(String.format("-_-_-_-_-_-_-_-_-&&-_-_-_-_-_-_-_-_-\n|%-35s|",
                    "deze Versie bestaad WEL"));
            return version;
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(String.format("-_-_-_-_-_-_-_-_-&&-_-_-_-_-_-_-_-_-\n|%-35s|",
                    "deze Difficulty bestaad NIET"));
            return Version.NORMAL;
        }
    }
}

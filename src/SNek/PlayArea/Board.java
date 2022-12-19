package SNek.PlayArea;

import SNek.Size.Size;

import java.util.Scanner;

public class Board {
    private int height;
    private int width;

    public Board(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    public static Size setSize(){
        Scanner scanner = new Scanner(System.in);

        System.out.print(String.format("-_-_-_-_-_-_-_-_-&&-_-_-_-_-_-_-_-_-\n|%-35s|\n|%-35s|\n|%-35s|\n|%-35s|\n|%-35s|\n|%-35s|\n|%-35s|\n|%-35s: ",
                "welke groote moet het",
                "speelbord zijn",
                "1. S",
                "2. M",
                "3. L",
                "4. XL",
                "5. XXL",
                "6. XXXL"));
        String var1 = scanner.nextLine();
        try {
            Size size=Size.valueOf(var1.toUpperCase());
            Size.valueOf(var1.toUpperCase());
            System.out.println(String.format("-_-_-_-_-_-_-_-_-&&-_-_-_-_-_-_-_-_-\n|%-35s|",
                    "Deze Size bestaad WEL"));
            return size;
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(String.format("-_-_-_-_-_-_-_-_-&&-_-_-_-_-_-_-_-_-\n|%-35s|",
                    "deze Size bestaad NIET"));
            return Size.M;
        }
    }
}

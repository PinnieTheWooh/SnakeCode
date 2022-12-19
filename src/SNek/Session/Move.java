package SNek.Session;

import SNek.Size.Size;

import java.util.Scanner;

public class Move {
    private String move;//dit veranderd nog voor op het bord te veranderen van plek

    public Move(String move) {
        this.move = move;
    }

    public String getMove() {
        return move;
    }

    @Override
    public String toString() {
        return "Move{" +
                "move='" + move + '\'' +
                '}';
    }
}

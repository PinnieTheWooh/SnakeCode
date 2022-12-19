package SNek.Size;

import SNek.PlayArea.Board;

public enum Size {
    S,M,L,XL,XXL,XXXL;

    public Board getSize(){
        return switch (this){
            case S -> new Board(10,10);
            case M -> new Board(20,20);
            case L -> new Board(30,30);
            case XL -> new Board(40,40);
            case XXL -> new Board(50,50);
            case XXXL -> new Board(60,60);
        };
    }
}

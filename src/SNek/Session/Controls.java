package SNek.Session;

public enum Controls {
    ARROWUP,ARRODOWN,ARROWLEFT,ARROWRIGHT,W,A,S,D,Z,Q;
    public Move move(){
        return switch (this){
            case ARROWUP -> new Move("UP");//coord y+1
            case W -> new Move("UP");//coord y+1
            case Z -> new Move("UP");//coord y+1
            case ARRODOWN -> new Move("DOWN");//coord y-1
            case S -> new Move("DOWN");//coord y-1
            case ARROWLEFT -> new Move("LEFT");//coord x+1
            case A -> new Move("LEFT");//coord x+1
            case Q -> new Move("LEFT");//coord x+1
            case ARROWRIGHT -> new Move("RIGHT");
            case D -> new Move("RIGHT");
        };
    }
}

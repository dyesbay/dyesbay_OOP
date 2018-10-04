public class Pawn extends Piece {
    Color color;
    public Pawn (Color color){
        this.color=color;
    }
    public boolean isLegalMove (Position a, Position b){
        return (a.x==b.x && (color==Color.white &&( b.y==a.y+1 || (a.y==2 && b.y==4))) || (color==Color.black &&( b.y==a.y-1 || (a.y==7 && b.y==5))) );
    }
}

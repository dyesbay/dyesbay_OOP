public class Knight extends Piece {
    public boolean isLegalMove(Position a, Position b){
        return ((Math.abs(a.x-b.x)==2 && Math.abs(a.y-b.y)== 1) || (Math.abs(a.x-b.x)==1 && Math.abs(a.y-b.y)== 2));
    }
}

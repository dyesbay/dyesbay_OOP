public class Bishop extends Piece{
    public boolean isLegalMove (Position a, Position b){
        return ((Math.abs(a.x-b.x)==Math.abs(a.y-b.y)));
    }
}

public class King extends Piece{
    public boolean isLegalMove (Position a, Position b){
        return (Math.sqrt(Math.pow(a.x-b.x,2)+Math.pow(a.y-b.y,2))<2);
    }
}

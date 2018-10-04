public class Cube {
    private double a;
    public Cube(double a){
        this.a = a;
    }
    public double baseArea(){
        return a*a;
    }
    public double volume (){
        return baseArea()*a;
    }
    public double sideSurfaceArea(){
        return a*a*4;
    }
    public double surfaceArea (){
        return (this.sideSurfaceArea()+2*this.baseArea());
    }
}

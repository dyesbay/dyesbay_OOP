public class Sphere {
    private double radius;
    public Sphere (double radius){
        this.radius=radius;
    }
    public void setRadius (double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public double volume (){
        return (4*Math.PI*Math.pow(radius,3)/3);
    }
    public double surfaceArea (){
        return (4*Math.PI*Math.pow(radius,2));
    }
}

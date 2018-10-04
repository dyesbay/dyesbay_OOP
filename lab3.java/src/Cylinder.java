import java.math.*;
public class Cylinder extends Shape {
    private double height;
    private double radius;

    public void setRadius (double radius){
        this.radius=radius;
    }public void setHeight (double height){
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
    public double getRadius(){
        return radius;
    }

    public double baseArea(){
        return ( Math.PI*radius*radius);
    }
    public double sideSurfaceArea (){
        return (2*Math.PI*radius*height);
    }
    public double surfaceArea (){
        return (this.sideSurfaceArea()+this.baseArea());
    }
    public double volume(){
        return (this.baseArea()*height);
    }
}

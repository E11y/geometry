package mat.m.circle;

/**
 * Created by user on 24.10.2016.
 */
public class Circle {
    private double r;
    private double p=3.14;
    public Circle(double r){
        this.r=r;
    }
    public double s1(){
        return 2*Math.PI*(this.r*this.r);
    }
    public double d1(){

        return 2*Math.PI*this.r;
    }
}

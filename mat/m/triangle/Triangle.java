package mat.m.triangle;

import static java.lang.Math.sqrt;

/**
 * Created by user on 24.10.2016.
 */
public class Triangle {
    private int a,b,c;
    public Triangle(int a, int b,int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double PP (){
        return (this.a+this.b+this.c)/2;

    }
    public double S (){
        return sqrt(PP()*(PP()-a)*(PP()-b)*(PP()-c));
    }
}

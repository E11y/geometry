package mat.m.rect;

/**
 * Created by user on 21.10.2016.
 */
public class Rect {
    private int  a,b;
    public Rect(int a1, int b1) {

        this.a=a1;
        this.b=b1;
    }

    //метод расчета площади
    public int s1(){

        return this.a*this.b;
    }
    public int p1(){

        return 2*(this.a*this.b);
    }
}

package mat.m;

/**
 * Created by user on 21.10.2016.
 */
import java.util.Scanner;

import mat.m.circle.Circle;
import mat.m.rect.Rect;
import mat.m.triangle.Triangle;

public class mat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ведите номер фигуры 1- прямоугольник, 2 треугольникб 3-круг");
        int figure= sc.nextInt();
        if(figure==1){
            System.out.println("Введите длинну:");
            int a= sc.nextInt();
            System.out.println("Введите ширину:");
            int b = sc.nextInt();
            sc.close();
            Rect s = new Rect(a,b);
            System.out.println("Площадь:"+(s.s1())+"ериметр:"+s.p1());
        }
        else if (figure == 2) {
                System.out.println("Введите сторону а:");
                int a= sc.nextInt();
                System.out.println("Введите сторону b:");
                int b = sc.nextInt();
                System.out.println("Введите сторону c:");
                int c = sc.nextInt();
                sc.close();
                if (a>b+c || b>a+c || c>a+b){
                    System.out.println("Сумма двух любых сторон не должнабыть меньше 3й");
                }
                else {
                    Triangle s = new Triangle(a,b,c);
                    System.out.println("Периметр треугольника"+(s.PP()*2)+" "+"Площадь треуголника ="+" "+s.S());
                }
        }
        else if(figure ==3){
                System.out.println("Введите радиус R:");
                double r= sc.nextInt();
                sc.close();
            Circle s= new Circle(r);
            System.out.println("Длинна:"+(s.d1())+"Площадь:"+s.s1());


            }
        }
}

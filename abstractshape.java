import static java.lang.Math.PI;
import java.util.Scanner;
abstract class abstractshape {
     abstract void  areaC(float a);
    abstract void areaR(float x,float y);
}
class shape extends abstractshape{
    void areaC(float a){
        System.out.println("area of circle ="+(PI*a*a));
    }
    void areaR(float x,float y){
        System.out.println("area of rectangle ="+(x*y));
    }
}
class Mainn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        shape circle = new shape();
        shape rect = new shape();
        System.out.println("enter length,breadth:");
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        rect.areaR(x, y);
        System.out.println("enter radius:");
        float r = sc.nextFloat();
        circle.areaC(r);
    }
}

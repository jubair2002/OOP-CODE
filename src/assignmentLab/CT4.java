package assignmentLab;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

abstract class Conics{
    int a,b,h,g,f,c;
    List<Integer>number= new ArrayList<>();
    Conics(int ...varargs){
        for(int x:varargs){
            this.number.add(x);
        }
        this.a=number.get(0);
        this.b = number.get(1);
        this.h = number.get(2);
        this.g = number.get(3);
        this.f = number.get(4);
        this.c = number.get(5);
         }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getH() {
        return h;
    }

    public int getG() {
        return g;
    }

    public int getF() {
        return f;
    }

    public int getC() {
        return c;
    }
    public double getRadius(){
        double R = Math.pow(g,2) + Math.pow(f,2) - c;
        double Radius = Math.sqrt(R)/3;
        return Radius;
    }
    public Point getCenter(){
          return new Point(-g/2,-f/2);
    }
    public abstract boolean whichConics();
}

class Circle extends Conics{
 double radius ;
 Point center;
 public Circle(int ...varargs){
     super(varargs);
     this.radius=getRadius();
     this.center=getCenter();
 }

    @Override
    public boolean whichConics() {
        if(this.a == this.b && this.h == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Parabola extends Conics{

    Parabola(int ...varargs){
        super(varargs);
    }

    @Override
    public boolean whichConics() {
        if(this.b == 0 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
public class CT4 {
    public static void showConicsName(Conics c) {
        if (c.whichConics()) {
            if (c instanceof Circle) {
                System.out.println("geometry.Circle");
            } else if (c instanceof Parabola) {
                System.out.println("geometry.Parabola");
            }
        } else {
            System.out.println("None of them.");
        }
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(1,1,0,4,-6,5);
        Circle c2 = new Circle(2,1,0,4,-6,5);
        Parabola p1 = new Parabola(1,0,0,-2,-1,-3);
        System.out.println(c1.radius);
        System.out.println(c1.center);
        showConicsName(c1);
        showConicsName(p1);
        showConicsName(c2);
    }
}


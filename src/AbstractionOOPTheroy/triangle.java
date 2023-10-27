package AbstractionOOPTheroy;

public class triangle extends Shape{
    double b;
    double h;
    triangle(double b,double h){
        this.b=b;
        this.h=h;
    }
    double getArea(){
        return 0.5*b*h;
    }
}

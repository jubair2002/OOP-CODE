package AbstractionOOPTheroy;

public class Rectangle extends Shape{
    double b,h;
    Rectangle(double b,double h){
        this.b=b;
        this.h=h;
    }
    double getArea(){
        return 0.5*b*h;
    }
}

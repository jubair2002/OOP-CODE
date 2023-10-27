package InterfaceOOPTheroy_class9;

import javax.swing.*;

interface Flyable{
    void fly();
}
interface swimmable{
    void swim();
}
class Fish implements swimmable{
    public void swim(){
        System.out.println("Fish is Swimming !");
    }
}
class Bird implements Flyable{
    public void fly(){
        System.out.println("birds can fly");
    }
    public void sleep(){
        System.out.println("bird are sleeping !");
    }
}
class Duck implements Flyable,swimmable{
    public void fly(){
        System.out.println("bird can fly");
    }
    public void swim(){
        System.out.println("duck can swim !");
    }
}


public interface TestInterface {
    public static void main(String[] args) {
        Duck d= new Duck();
        d.fly();
        d.swim();

        Bird b= new Bird();
        b.fly();


    }
}

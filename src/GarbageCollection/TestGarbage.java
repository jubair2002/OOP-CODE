package GarbageCollection;
import Inheritance.Student;
public class TestGarbage {
    public static void main(String[] args) {
        Garbage g1= new Garbage();
        Garbage g2= new Garbage();
        g1=g2;
        new Garbage();
        System.gc();
        Student s1 = new Student();
        s1.display();
        Student.show();


    }
}

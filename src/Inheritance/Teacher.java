package Inheritance;
public class Teacher extends Student{
    public Teacher(){
        System.out.println("this is teacher");
    }
    public Teacher(String name){
        System.out.println("this is teacher "+super.getName());
    }


}

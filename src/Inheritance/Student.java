package Inheritance;

public class Student extends Person{
    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public  Student(){
        System.out.println("this is student");
    }
    public Student(String name){
        super();
        System.out.println("this is student"+name);
    }
    public void display(){
        super.display();
//        System.out.println("hello world");
    }
    public static void show(){
        System.out.println("testing");
    }
}

package ArrayList;

public class Student{
    int id;
    double cgpa;
    String name;
    public Student(){
        id=0;
        cgpa=0.0;
        name=null;
    }
    public String getName(){
        return this.name;
    }
    public Student(int id,double cgpa,String name){
        this.id=id;
        this.cgpa=cgpa;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", cgpa=" + cgpa +
                ", name='" + name + '\'' +
                '}';
    }



}

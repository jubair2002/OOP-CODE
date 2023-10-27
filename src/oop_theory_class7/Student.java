package oop_theory_class7;
public class Student {
    String name;
    int studentID;
    double cgpa;
   public Student(String name,int studentID,double cgpa){
        this.name=name;
        this.studentID=studentID;
        this.cgpa=cgpa;
    }
    @Override
   public String toString(){
       return this.name+ " "+this.studentID+ " "+this.cgpa;
   }
    public static void main(String[] args) {
        Student s1= new Student("Abir",294,4.00);
        System.out.println(s1);

    }
}

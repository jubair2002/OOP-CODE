package ArrayList;

public class StudentInfo {
    String name;
    int id;
    double cgpa;

    public StudentInfo(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public StudentInfo() {
        name=null;
        id=0;
        cgpa=0.0;
    }
    public String getName(){
        return name;
    }


    @Override
    public String toString() {
        return "StudentInfo[" + "name='" + name + '\'' + ", id=" + id + ", cgpa=" + cgpa + ']';
    }
}

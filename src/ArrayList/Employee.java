package ArrayList;

public class Employee implements Comparable<Employee>{
   String name;
   int age;
   double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if (this.age<o.age){
            return 1;
        }
        return -1;
    }
}

package LabPracticeProblem;
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    Employee(int id,String firstName,String lastName,int salary){
        this.id=id;
        this.firstName= firstName;
        this.lastName=lastName;
        this.salary=salary;
    }
    public int getID(){
        return this.id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getName(){
        String name=this.firstName+this.lastName;
        return name;
    }
    public void setSalary(int s){
        this.salary=s;
    }
    public int getSalary(){
        return this.salary;
    }
    public int getAnnualSalary(){
        return this.salary*12;
    }
    public int raiseSalary(int persent){
        int s= this.salary*persent/100;
        return this.salary+s;
    }

    public String toString(){
        return "id:"+this.id+" "+"name:"+this.getName()+" "+"salary :"+this.salary;
    }
    public void display(){
        System.out.println(this.firstName);
        System.out.println(this.lastName);
    }
}

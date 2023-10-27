package InheritancePracticeProblem;
public class Person {
    private String name;
    private String address;
    Person(){

    }
    public Person(String name,String address){
        this.name=name;
        this.address=address;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String toString(){
        return "Name :"+this.name +" " +" Address :"+this.address;
    }
}

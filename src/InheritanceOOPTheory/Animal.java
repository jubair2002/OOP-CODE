package InheritanceOOPTheory;
class Citizen{
    String name;
   private String NID;
    public Citizen(String name,String NID){
        System.out.println("hello from citizen class");
        this.name= name;
        this.NID=NID;
    }
    public  void castVote() {
        System.out.println("the vote has been casted.....");
    }

}
class Student extends Citizen{
    String uniName;
    int StudentID;
    public Student(String name,String NID,String uniName,int studentID){
        super(name,NID);
        System.out.println("hello from student class");

        this.uniName=uniName;
        this.StudentID=studentID;
    }
    void printInformation(){
        System.out.println(super.name+" "+this.uniName);
    }
}
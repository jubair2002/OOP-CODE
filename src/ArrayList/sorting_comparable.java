package ArrayList;

public class sorting_comparable {
    String name;
    int age;
    public sorting_comparable(){

    }
    public sorting_comparable(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "[" + "name='" + name + ", age=" + age + ']';
    }
    public String getName(){
        return name;
    }

//    @Override
//    public int compareTo(sorting_comparable that) {
//        if(this.age>that.age){
//            return 1;
//        }
//        return -1;
//    }
}

package HashMap;

import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer,String> Student= new HashMap<>();
        //put for add data
        //get for show data
        Student.put(101,"Abir");
        Student.put(102,"Bahar");
        Student.put(103,"Jubair");
        Student.put(104,"Mehrin");
        Student.put(104,"Arif");
        System.out.println(Student.get(104));
    }
}

package HasSet;

import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<String> ss= new HashSet<String>();
        ss.add("Abir");
        ss.add("Jubair");
        ss.add("Bahar");
        System.out.println(ss);
        System.out.println("Size :"+ss.size());

        ss.clear();
        System.out.println(ss.size());

    }
}

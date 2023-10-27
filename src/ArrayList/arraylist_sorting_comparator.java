package ArrayList;

import java.util.*;

public class arraylist_sorting_comparator {
    public static void main(String[] args) {
        List<StudentInfo> cc= new ArrayList<>();

        cc.add(new StudentInfo("Abir",1,3.00));
        cc.add(new StudentInfo("Anisa",2,3.10));
        cc.add(new StudentInfo("Bahar",3,3.450));
        cc.add(new StudentInfo("Afrin",4,2.00));
        cc.add(new StudentInfo("Jubair",5,4.00));
        Comparator<StudentInfo> comp = new Comparator<StudentInfo>() {
            @Override
            public int compare(StudentInfo o1, StudentInfo o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Collections.sort(cc,comp);
        for (StudentInfo i: cc) {
            System.out.println(i);

        }


    }
}

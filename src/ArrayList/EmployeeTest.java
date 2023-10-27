package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> list= new ArrayList<Employee>();
        list.add(new Employee("Abir",22,2000.0));
        list.add(new Employee("Atik",10,5000.0));
        list.add(new Employee("Jami",45,6000.0));
        list.add(new Employee("Anisa",60,54000.0));
        list.add(new Employee("Jami",35,20100.0));

        Collections.sort(list);
        for(Employee e:list){
            System.out.println(e+" ");
        }

    }
}

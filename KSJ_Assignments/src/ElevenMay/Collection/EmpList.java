package ElevenMay.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmpList {
    public static void main(String[] args) {
       ArrayList<Employee> em=new ArrayList<Employee>();
       em.add(new Employee(1,100,"anant"));
       em.add(new Employee(3,1001,"kumar"));
       em.add(new Employee(2,1002,"pandey"));

        System.out.println(em);


        Collections.sort(em);


        Iterator it=em.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }







    }
}

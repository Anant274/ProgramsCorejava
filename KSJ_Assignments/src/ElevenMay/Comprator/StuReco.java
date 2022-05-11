package ElevenMay.Comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StuReco {
    public static void main(String[] args) {
        List<Student> st=new ArrayList<Student>();
        st.add(new Student(1,"kumar","rambag"));
        st.add(new Student(3,"anant","shantiniketan"));
        st.add(new Student(2,"ramanujan","pokhran"));

        Collections.sort(st,new IdComprator());

        Iterator it=st.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("================================================================================");

        Collections.sort(st,new NameComprator());
        Iterator itr=st.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("==================================================================================");

        Collections.sort(st,new AddressCompare());
        Iterator itre=st.iterator();
        while (itre.hasNext())
        {
            System.out.println(itre.next());
        }


    }
}

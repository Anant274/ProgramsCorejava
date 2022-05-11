package ElevenMay.Comprator;

import java.util.Comparator;

public class IdComprator implements Comparator<Student> {
    @Override
    public int compare(Student o, Student ob) {
        if(o.getId()==ob.getId())
        {
            return 0;
        } else if (o.getId()>ob.getId()) {
            return 1;

        }
        else {
            return -1;
        }



    }
}

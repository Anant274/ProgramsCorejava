package ElevenMay.Comprator;

import java.util.Comparator;

public class NameComprator implements Comparator<Student>{
    @Override
    public int compare(Student e, Student ee) {
        Student s=(Student) e;
        Student ss=(Student) ee;

        return s.getName().compareTo(ss.getName());
    }
}

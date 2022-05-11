package ElevenMay.Comprator;

import java.util.Comparator;

public class AddressCompare implements Comparator<Student> {
    @Override
    public int compare(Student e, Student ee) {
        Student s1=(Student) e;
        Student s2=(Student) ee;
        return s1.getAddress().compareTo(s2.getAddress());
    }
}

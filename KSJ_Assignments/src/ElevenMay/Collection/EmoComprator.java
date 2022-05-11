package ElevenMay.Collection;

import java.util.Comparator;

public class EmoComprator implements Comparator<EmoComprator> {
    private int empid;
    private int empmono;
    private String name;

    public EmoComprator() {
    }

    public EmoComprator(int empid, int empmono, String name) {
        this.empid = empid;
        this.empmono = empmono;
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmoComprator{" +
                "empid=" + empid +
                ", empmono=" + empmono +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compare(EmoComprator empid, EmoComprator empname) {
        if (empid.empid == empname.empid) {
            return 0;
        } else if (empid.empid > empname.empid) {
            return 1;

        } else {
            return -1;
        }
    }


}

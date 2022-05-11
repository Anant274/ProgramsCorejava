package ElevenMay.Collection;

public class CollectionProgram {
    private int aadhar;
    private String name;
    private String sname;

    public CollectionProgram(int aadhar, String name, String sname) {
        this.aadhar = aadhar;
        this.name = name;
        this.sname = sname;
    }

    public int getAadhar() {
        return aadhar;
    }

    public void setAadhar(int aadhar) {
        this.aadhar = aadhar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}

package ElevenMay.Collection;

public class Employee implements Comparable<Employee> {
    private int eid;
    private int emono;
    private String name;

    public Employee(int eid, int emono, String name) {
        this.eid = eid;
        this.emono = emono;
        this.name = name;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getEmono() {
        return emono;
    }

    public void setEmono(int emono) {
        this.emono = emono;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", emono=" + emono +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee employee )
    {
        if(eid==employee.eid)
        {
            return 0;
        }
        else if (eid>employee.eid)
        {
            return 1;
        }
        else
        return -1;
    }

}


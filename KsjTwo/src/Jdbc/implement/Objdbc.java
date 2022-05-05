package Jdbc.implement;



public class Objdbc implements Comparable<Objdbc> {
	
	
	int EmpId;
	String EmpName;
	int EmpSalary;
	
	public Objdbc(int empId, String empName, int empSalary) {
		this.EmpId = empId;
		EmpName = empName;
		EmpSalary = empSalary;
	}
	
	
	
	public int getEmpId() {
		return EmpId;
	}
	
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	
	public String getEmpName() {
		return EmpName;
	}
	
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	
	public int getEmpSalary() {
		return EmpSalary;
	}
	
	public void setEmpSalary(int empSalary) {
		EmpSalary = empSalary;
	}
	
	
	
	@Override
	public String toString() {
		return "Employ [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpSalary=" + EmpSalary + "]";
	}
	
	
	
	
	

	@Override
	public int compareTo(Objdbc o) {

		if(o.getEmpId()> this.getEmpId() )
		{
			return 1;
		}
				else if(o.getEmpId()< this.getEmpId())
					{
						return -1;
					}
		return 0;
	}
	

}

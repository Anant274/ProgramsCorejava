package Jdbc.implement.Insert.Object;

public class EmployeeData {
	private Integer id;
	private String name;
	private Integer salary;
	
	public EmployeeData(Integer id, String name, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeData [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public EmployeeData()
	{
		super();
	}
	

}

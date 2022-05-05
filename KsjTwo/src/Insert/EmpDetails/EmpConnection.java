package Insert.EmpDetails;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
public class EmpConnection {
	public static void main(String []arg) throws Exception
	{

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/ksj","root","");
		Statement st=con.createStatement();
		
		int id;
		String name;
		int salary;
		
		List<Employee> lin=new ArrayList<Employee>();
		lin.add(new Employee(1,"Kuljeet",1000));
		lin.add(new Employee(2,"ramanujan",2000));
		lin.add(new Employee(3,"manjeet",3000));
		
		
	for(Employee e:lin)
	{
		id=e.getId();
		name=e.getName();
		salary=e.getSalary();
		
		st.addBatch("insert into empolyee(id,name,salary) values("+id+",'"+name+"',"+salary+")");
		
		int [] result=st.executeBatch();
		
	}
	System.out.println("Employee Record inserted Successfull ");
	
	}
	
	

}

package Insert.EmpDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class EmployeeUpdate {
	public static void main(String []arg) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/ksj","root","");
		Statement st=con.createStatement();
		
		int id;
		String name;
		int salary;
		
		List<Employee> lin=new ArrayList<Employee>();
		lin.add(new Employee(7,"Kuljeet",1000));
		lin.add(new Employee(8,"ramanujan",2000));
		lin.add(new Employee(9,"manjeet",3000));
		
		for(Employee e:lin)
		{
			id=e.getId();
			name=e.getName();
			salary=e.getSalary();
			
			st.addBatch("update empolyee set salary=5000 where id=1");
			int result[]=st.executeBatch();
		}
		System.out.println("Employee Record Updated Successfully Successfull");
	}
}

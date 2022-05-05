package Insert.EmpDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Jdbc.implement.Insert.Object.EmployeeData;

public class EmpolyDelete {
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
			
			st.addBatch("delete from empolyee where id=9");
			
			int [] result=st.executeBatch();
			
		}	
		System.out.println("Employee Record deleted Successfull ");
	}
	

}

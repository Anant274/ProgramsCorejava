package Jdbc.implement.Insert.Object;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class Empolyee {
	public static void main(String []arg) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://jdbc","root","");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from empolyee");
		
		List<EmployeeData> lis=new ArrayList<EmployeeData>();
		while(rs.next())
		{
			EmployeeData e=new EmployeeData();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setSalary(rs.getInt(3));
			lis.add(e);
		}
		
		for(EmployeeData e: lis)
		{
			System.out.println("empoly id :"+e.getId());
			System.out.println("empoly Name :"+e.getName());
			System.out.println("empoly Salary :"+e.getSalary());
		}
		
	}

}

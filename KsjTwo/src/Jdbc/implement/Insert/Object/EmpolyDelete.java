package Jdbc.implement.Insert.Object;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpolyDelete {
	public static void main(String[] arg) throws Exception
	{

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://jdbc","root","");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("delete from empolyee");
		
		List<EmployeeData> emp=new ArrayList<EmployeeData>();
		while(rs.next())
		{
			EmployeeData e=new EmployeeData();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setSalary(rs.getInt(3));
			emp.add(e);
		}
		
		
		
		
		
	}
	

}

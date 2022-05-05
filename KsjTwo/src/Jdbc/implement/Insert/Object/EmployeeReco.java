package Jdbc.implement.Insert.Object;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class EmployeeReco {

	public static void main(String []arg) throws Exception
	{
		int id;
		String name;
		int salary;
		
		List<EmployeeData> li=new ArrayList<EmployeeData>();
		

		li.add(new EmployeeData(4,"Anant",2000));
		li.add(new EmployeeData(5,"ram",3000));
		li.add(new EmployeeData(6,"kumar",2000));
		
		Connection con=DriverManager.getConnection("jdbc:mysql://jdbc","root","");
		Statement st=con.createStatement();
		for(EmployeeData e:li)
		{
			id=e.getId();
			name=e.getName();
			salary=e.getSalary();
			st.addBatch("insert into employee(id,name,salary) values("+id+",'"+name+"',"+salary+")");
		}
		int[] result=st.executeBatch();
		boolean flag=true;
		
		for(int i=0;i<result.length;i++)
		{
			if(result[i]==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println(result.length+" Record is Store in data base");
		}else
		{
			System.out.println(result.length+" Record is not inserted");
		}
		
	}
	
	
}

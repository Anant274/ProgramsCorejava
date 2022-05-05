package Employee.Java8Feat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Employees {

	public static void main(String[] args) {
		
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(1,"Anant",2000));
		emp.add(new Employee(8,"kumar",5000));
		emp.add(new Employee(6,"vinod",6000));
		emp.add(new Employee(3,"badsha",3000));
		
		System.out.println("===================Before======================");
		Iterator<Employee> itr=emp.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("");
		System.out.println("===================After======================");
		System.out.println("");
		System.out.println("sorting by id");
		Collections.sort(emp,Comparator.comparingInt(Employee::getEmpId));
		itr=emp.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("");
		System.out.println("=============Sorting by name===========");
		System.out.println("");
		Collections.sort(emp,Comparator.comparing(Employee::getEmpName));
		itr=emp.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("");
		System.out.println("=============Sorting by Salary===========");
		System.out.println("");
		Collections.sort(emp,Comparator.comparingDouble(Employee::getEmpSalary));
		itr=emp.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}

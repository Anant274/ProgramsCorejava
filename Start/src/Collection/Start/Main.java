package Collection.Start;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Student s1=new Student(11,"Narendra",67.00F);
		Student s2=new Student(12,"Anant",55.00F);
		Student s3=new Student(13,"jarjumar",89.00F);
		Student s4=new Student(14,"polkitr",93.00F);
		Student s5=new Student(15,"kimhug",60.00F);
		
		List<Student>list=new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		System.out.println(list);
		
		System.out.println("Student who are in first division ");
		list.stream().filter(e->e.getMarks()>75).forEach(e->System.out.println("Student Name "+e.getName()+"Student Marks:"+e.getMarks()+"Student id:"+e.getStudid()));
		
	}

}

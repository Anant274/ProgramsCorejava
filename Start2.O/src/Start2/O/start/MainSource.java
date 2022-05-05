package Start2.O.start;

import java.util.ArrayList;
import java.util.List;

public class MainSource {
	public static void main (String arg[])
	{
		Marks m1=new Marks(11,100,55.65F);
		Marks m2=new Marks(11,100,55.65F);
		Marks m3=new Marks(11,100,55.65F);
		Marks m4=new Marks(11,100,55.65F);
		
	
		float res1=m1.percentage(m1.obtainMarks, m1.maxMarks);
		float res2=m2.percentage(m2.obtainMarks, m2.maxMarks);
		float res3=m3.percentage(m3.obtainMarks, m3.maxMarks);
		float res4=m4.percentage(m4.obtainMarks, m4.maxMarks);
		
		List<Marks> mk=new ArrayList<Marks>();
		mk.add(m1);
		mk.add(m2);
		mk.add(m3);
		
		Student s1=new Student(11,"Anantkumar",mk);
		Student s2=new Student(12,"rama",mk);
		Student s3=new Student(13,"kuku",mk);
		
		List<Student> std=new ArrayList<Student>();
		std.add(s1);
		std.add(s2);
		std.add(s3);
		
		System.out.println("Student who are getting more then 75%\n");
		//mk.stream().filter(e->e.obtainMarks>75)
		
		
		
		
	}

}

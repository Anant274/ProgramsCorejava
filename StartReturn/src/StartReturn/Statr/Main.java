package StartReturn.Statr;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] arg)
	{
		Marks m1=new Marks(11,100,90);
		Marks m2=new Marks(12,100,40);
		Marks m3=new Marks(13,100,50);
		Marks m4=new Marks(14,100,77);
		
		List<Marks> mk=new ArrayList<Marks>();
		mk.add(m1);
		mk.add(m2);
		mk.add(m3);
		mk.add(m4);
		
		Student s1=new Student(11,"Narendra",mk);
		Student s2=new Student(12,"Anant",mk);
		Student s3=new Student(13,"ram",mk);
		Student s4=new Student(14,"kalani",mk);
		
		List<Marks> mks=s1.getMarks();
	
		
		mks.stream().filter(e->e.getObtainMarks()>75).forEach(e->System.out.println("Student id:"+e.getSubid()+",Total marks:"+e.getMaxMarks()+",obtained Marks:"+e.getObtainMarks()));
	}
}

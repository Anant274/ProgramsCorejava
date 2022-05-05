package StartReturn.Statr;

import java.util.List;

public class Student {
	private int id;
	private String name;
	private List<Marks> marks;
	
	public void setid(int id)
	{
		this.id=id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}

	public List<Marks>getMarks()
	{
		return marks;
	}
	
	public void setMarks(List<Marks>marks)
	{
		this.marks=marks;
	}
	
	public Student(int id,String name,List<Marks>marks)
	{
		super();
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	@Override
	public String toString()
	{
		return"Student[id="+id+",name="+name+",marks="+marks+"]";
	}
}

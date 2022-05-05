package Collection.Start;

public class Student {
	private int studid;
	private String name;
	private float marks;
	
	public int getStudid()
	{
		return studid;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public float getMarks()
	{
		return marks;
	}
	
	public void setMarks(float marks)
	{
		this.marks=marks;
	}
	
	@Override
	public String toString()
	{
		return "Student[studid="+studid+",name="+name+",marks="+marks+"]";
	}
	public Student(int studid,String name,float marks) {
		super();
		this.studid=studid;
		this.name=name;
		this.marks=marks;
	}
	
	
	
}

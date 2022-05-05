package StartReturn.Statr;

public class Marks {
	private int subid;
	private int maxMarks;
	private int obtainMarks;
	
	public int getSubid()
	{
		return subid;
	}
	public void setSubid(int subid)
	{
		this.subid=subid;
	}
	
	public int getMaxMarks()
	{
		return maxMarks;
	}
	public void setMaxMarks(int maxMarks)
	{
		this.maxMarks=maxMarks;
	}
	
	public int getObtainMarks() 
	{
		return obtainMarks;
	}
	
	public void setObtainMarks(int obtainMarks) 
	{
		this.obtainMarks = obtainMarks;
	}
	
	public Marks(int subid,int maxMarks,int obtainMarks)
	{
		super();
		this.subid=subid;
		this.maxMarks=maxMarks;
		this.obtainMarks=obtainMarks;
	}
	@Override
	public String toString()
	{
		return "Marks[subid="+subid+",maxMarks="+maxMarks+",obtainMarks="+obtainMarks+"]";
	}
	

}

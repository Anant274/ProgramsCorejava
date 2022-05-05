package Start2.O.start;

public class Marks {
	int subId;
	int maxMarks;
	float obtainMarks;
	float per;
	
	public Marks(int subId, int maxMarks, float obtainMarks) {
		super();
		this.subId = subId;
		this.maxMarks = maxMarks;
		this.obtainMarks = obtainMarks;
	}

	@Override
	public String toString() {
		return "Marks [subId=" + subId + ", maxMarks=" + maxMarks + ", obtainMarks=" + obtainMarks + ", per=" + per
				+ "]";
	}
	
	public float percentage(float obtainmarks,int maxmarks)
	{
		this.per=(obtainmarks*maxmarks)/100;
		return per;
	}
	
	

}

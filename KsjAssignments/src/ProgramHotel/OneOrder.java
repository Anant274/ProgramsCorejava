package ProgramHotel;



public class OneOrder implements Comparable<OneOrder> {
	
	private int id;
	private String state;
	private String date;
	
	
	
	public OneOrder(int id, String state, String date) {
		super();
		this.id = id;
		this.state = state;
		this.date = date;
	}
	
	
	/*
	public OneOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	*/
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
	//Date 
	/*
	OneOrder(String date)
	    {
	 
	      
	        this.date = date;
	    }
	*/
	//Date
	
	
	
	
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	@Override
	public String toString() {
		return "OneOrder [id=" + id + ", state=" + state + ", date=" + date + "]";
	}
	
	@Override
	public int compareTo(OneOrder o) {
		
		return state.compareTo(o.state);
	}
	
	/*
	@Override
	public int compareTo(OneOrder o) {
		return state.compareTo(o.state);
	}*/
	
	/*
	@Override
	public int hashCode() {
		return Objects.hash(date, id, state);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		OneOrder other = (OneOrder) obj;
		return Objects.equals(date, other.date) && id == other.id && Objects.equals(state, other.state);
	}*/
	
	
	}
	
	
	
	
	
	
	
	
	
	
//	public static void main(String []arg)
//	{
//		
//	}



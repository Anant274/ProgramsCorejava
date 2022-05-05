package Create.Our.Own.Lists;

public class ArrayList {
	
	Object arr[];
	int s;
	int capacity;
	ArrayList()
	{
		capacity=10;
		s=0;
		arr=new Object[capacity];
	}
	
	void add(Object item)
	{
		arr[s++]=item;
	}
	
	Object get(int index)
	{
		return arr[index];
	}
	
	int size()
	{
		return s;
	}
	
	public class CustomArrayList{
		public static void main(String []arg)
		{
			ArrayList ar=new ArrayList();
			ar.add(1);
			ar.add(2);
			ar.add(3);
			ar.add("String");
			ar.add("12.12");
			ar.add("null");
			
			for(int i=0;i<ar.size();i++)
			{
				System.out.println(ar.get(i));
			}
			
		}	
	}
}

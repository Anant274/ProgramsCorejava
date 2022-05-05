package Collection.ArrayList;

public class ReverseString {
	public static void main(String []arg)
	{
		String st="anantkumar";
		String s="";
		char ch;
		
		for(int i=0;i<st.length();i++)
		{
			ch=st.charAt(i);
			s=ch+s;
		
		}
		System.out.println(s);
	}

}

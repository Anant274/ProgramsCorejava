package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Duplicate {
	public static void main (String []arg)
	{
		String str= "Anant";
		char ch[]=new char[str.length()];	
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[i]);
				}
			}
		}
	}

}

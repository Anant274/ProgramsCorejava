package com.Stream.Basic.Program;



import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FirstStream {
	public static void main(String []arg)
	{
		//List<String> str = Array.asList("anant","kumar","pandey");
		//List<String> str = Arrays.asList("anant","kumar","pandey");
		//long count =str.stream().filter(e-> e.isEmpty()).count();
		
		List<Integer> str = Arrays.asList(2,3,4,5);
		
		List<Integer> ins=str.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(ins);
		
		List<String> str2=Arrays.asList("kumar","anant","pandey");
		
		List<String> st=str2.stream().filter(e->e.startsWith("k")).collect(Collectors.toList());
		System.out.println(st);
		
		List<String> str3=str2.stream().sorted().collect(Collectors.toList());
		System.out.println(str3);
		
		List<Integer> number=Arrays.asList(1,2,3,4,5);
		
		List<Integer> str5=number.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println(str5);
		
		List<Integer> number1=Arrays.asList(1,2,3,4,5);
		
		number.stream().map(x->x*x).forEach(y->System.out.println(y));

		
	}

}

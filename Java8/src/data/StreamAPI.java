package data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI 
{
	public static void main(String args[])
	{
		
	// stream can be created with static data
	Stream<String> s1=Stream.of("I","G","A","T","E","\n");
//	s1.sorted().forEach((str)-> System.out.print(str));
	
	// not poosible stream is closed
	// s1.sorted().foreach((str)-> System.out.printt(str));
	
	// stream to array
	Object[] arr=s1.toArray();
	for(Object o:arr)
	{
		System.out.print(o);
	}
	
	// stream can be acquired from arrAY or collections
	
	String[] loc=new String[] {"Pune","Mumbai","Parbhani","Nanded","Delhi"};
	List<String> locations =Arrays.asList(loc);
	Stream<String> s2=locations.stream();
	s2.forEach((str)->System.out.println(str));
	//s2.forEach((str)->System.out.println());

 	}
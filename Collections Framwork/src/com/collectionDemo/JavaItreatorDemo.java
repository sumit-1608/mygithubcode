package com.collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaItreatorDemo 
{
	public static void main(String args[])
	{
		ArrayList<String> city=new ArrayList<String>();
		
		city.add("PUNE");
//		city.add("Mumbai");
//		city.add("Delhi");
		
		Iterator a1=city.iterator();
		
		while(a1.hasNext()) // hasNext() return true if elements are present more than one
		{
			System.out.println(a1.next()); // next() calling next elements/object
		}
		
		Iterator a2=city.iterator();
		
		
		
		
		String str=" ";
		while(a2.hasNext())
		{
			str=(String) a2.next();
			if(str.equals("Delhi"))
			{
				a2.remove();
				System.out.println();
				System.out.println("delhi removed ");
				break;
			}
		}
		for(String s:city)
		{
			System.out.println(s);
		}
		
				System.out.println();
	}

}

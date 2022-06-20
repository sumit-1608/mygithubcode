package data;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaFun
{
	public static void main(String args[])
	{
		Consumer<String> c1=(String str)-> System.out.println(str);
		c1.accept("hellow sumeet ..."); // accpeting the string
		
		Supplier<String> s1=()-> "Hello from sumeet";
		c1.accept(s1.get()); // its getting a string from consumer
		
		
		//even number test
		Predicate<Integer> p1=num-> num%2==0; // condition
		System.out.println(p1.test(24)); // it will return true 
		System.out.println(p1.test(17)); // it will return false
		
		
		//max test
		BiFunction<Integer,Integer,Integer>maxFunction =(x,y)->x > y ? x : y; // ternary operator
		System.out.println(maxFunction.apply(200, 134));
		
		
		
	}

}
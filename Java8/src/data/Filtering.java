package data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filtering 
{
	public static void main(String args[])
	{
		List<String> locations =Arrays.asList(new String[]{"Pune","Mumbai","Mumbai","jaipur","pune"});
		Stream<String> stream=locations.stream();
		List<String> result=stream.filter((location)->location.length()>4).distinct()
				.sorted().collect(Collectors.toList());
		result.stream().forEach((city)-> System.out.println(city));
		result.stream().limit(2).forEach(System.out::println);
		result.stream().skip(2).forEach(System.out::println);
		long i=result.stream().count();
		System.out.println(i);
		System.out.println(result);
		System.out.println(locations);
	}
}

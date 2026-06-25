package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionTest {
	public static void main(String[] args) {
		Predicate<Integer> isPositive = x -> x>0;
		
		List<Integer> numbers = Arrays.asList(5, -10, -22, 0, 43, 7);
		
		List<Integer> positiveNumbers =numbers.stream()
				.filter(isPositive)
				.collect(Collectors.toList());
		 System.out.println(positiveNumbers);
	 }	     
  }



package advance_java.DAY2.stream;
import java.util.*;

public class Program1 {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		/*
		List<Integer> even = new ArrayList<>();
		
		for(Integer n : list) {
			if ( n % 2 == 0) {
				even.add(n);
			}
		}
		*/
		
		List<Integer> even = list.stream()
				.filter( n -> n % 2 == 0)
				.map(n -> n*2)
				.toList();
		System.out.println(even);
		
		// Collection > Stream > Filter > Transform > Collect(eg. toList() ) > Result
		
	}

}

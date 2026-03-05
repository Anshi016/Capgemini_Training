package advance_java.DAY2.stream;
import java.util.*;

class Student1 {
	int id;
	String name;
	int age;
	
	public Student1 (int id , String name , int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
public class AllImplementation {
	public static void main(String[] args) {
		
		List<Student1>  students = List.of(
				new Student1(1 , "Hari" , 28), 
				new Student1 ( 2 , "Kumar" , 17)
		);
		
		List<Student1> adults = students.stream()
										.filter( s -> s.getAge() > 18)
										.toList();
		System.out.println(adults);
		
		// For each
		
		students.stream()
				.forEach( s -> System.out.println(s.getName()));
		
		// count
		long count = students.stream()
							.filter(s-> s.getAge() > 18)
							.count();
		System.out.println(count);
		
		//findFirst()
		
		Optional<Student1> first = students.stream()
											.filter(s -> s.getAge() > 18)
											.findFirst();
		//anyMatch()
		
		boolean anyMinor = students.stream()
									.anyMatch(s-> s.getAge() < 18);
		
		//allMatch()er
		boolean allAdults = students.stream()
									.allMatch(s->s.getAge() > 18);
		
		//noneMatch()
		boolean noneSenior = students.stream()
									  .noneMatch(s-> s.getAge() > 18);
		
		//reduce 
		 int totalAge = students.stream()
				 				.map(Student1:: getAge)
				 			//	.reduce(0,Integer:: sum);
				 				.reduce(0,(a , b) -> a + b);
		 
		 
		 System.out.println("toalAge : " + totalAge);
		
												
	}

}

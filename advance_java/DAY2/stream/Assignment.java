package advance_java.DAY2.stream;
import java.util.*;

class Student2 {
	
	String name;
	int age;
	
	public Student2 ( String name , int age) {
	
		this.name = name;
		this.age = age;
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

public class Assignment {
	public static void main(String[] args) {
		
		List<Student2>  students = List.of(
				new Student2("Ram" , 20), 
				new Student2 ("Hari" , 17),
				new Student2 ("Sita" , 25)
		);
		
		List<Student2> adult = students.stream()
										 .filter(s-> s.getAge() > 18)
										 .toList();
		
		students.stream()
				.forEach(s -> System.out.println(s.getName()));
				
		//2
		
		long count = adult.stream()
							 .filter(s -> s.getAge() > 18)
							 .count();
		
		System.out.println(count);
		
		//3
		
		List<Student2> doubleAge = students.stream()
										  .filter(s -> s.age >= 18 && s.age <= 40)
										  .map( s -> new Student2(s.name , s.age * 2))
										  .peek(s-> System.out.println("Name : " + s.name + " Age : " + s.age))
										  .toList();
		
		//4
		Optional<Student2> firstMinor = students.stream()
				.filter(s -> s.getAge() < 18)
				.findFirst();
		
		
		
	}

}

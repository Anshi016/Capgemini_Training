package advance_java.DAY2.stream;

import java.util.List;

class Student {
	
	int marks;
	String name; 
	int age;
	
	public Student(String name , int marks , int age ) {
		this.name = name;
		this.marks = marks;
		this.age = age;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
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

public class Student_Main {
	public static void main(String[] args) {
		List<Student> students = List.of(
				new Student ("A" , 22 , 18) ,
				new Student ( "B" , 66 , 20) , 
				new Student( "K" , 88 , 25) , 
				new Student( "Z" , 98 , 12)
		);
		
		List<Student> passed = students.stream()
				
				.filter(s -> s.marks > 60 && s.age >= 20 && s.age <= 40) // not transform or mutate
				.peek(s -> System.out.println("Passed :" + s.name))
				.peek(s -> s.setMarks(s.marks*2)) //mutating
				.peek(s -> s.marks = s.marks * 4)
				.map(s -> new Student(s.name , s.marks*2 , s.age)) // transform
				.peek(s -> System.out.println("Name :" + s.name + " Marks :" + s.marks + " Age :" + s.age))
				.peek(System.out::println)
				.toList(); 
		
		System.out.println(passed.size());
		
		
		
//		for(Student i: passed) {
//			System.out.println(i.name + " "+ i.marks + " "+ i.age);
//		}
		
		
		
	}
}


package OOPS.Fundamental.non_static.methods;

public class Test {
	public static void main(String[] args) {
		
		//Constructor 
		//NSM -- return type
		//Student, id, name , per constructor and display

		
		Person p1 = new Person("A", 20 , "M");
		p1.display();
		
		Student st1 = new Student();
		st1.display();
		st1.student(100, "a" , 10.5);
		
	
		
	}
}

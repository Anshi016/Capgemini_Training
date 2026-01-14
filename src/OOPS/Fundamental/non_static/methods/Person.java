package OOPS.Fundamental.non_static.methods;

public class Person {
		
		String name;
		int age;
		String gender;
		
		Person() {
			System.out.println("No argument");
		}
		
		Person (int a ) {
			System.out.println("Parameterized constructor");
		}
		
		
		public void display () {
			System.out.println("Name : " +  name);
			System.out.println("Age :" + age);
			System.out.println("Gender :" + gender);
		}
		
		Person ( String a , int b , String c ) {
			
			System.out.println("this :" +this);
			this.name = a;
			this.age = b;
			this.gender = c;
			
		}
		
		

}

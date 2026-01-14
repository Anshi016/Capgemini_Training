package OOPS.Fundamental.non_static.methods;

public class Student {
	public static void main(String[] args) {
		
		String name;
		int id;
		double percentage;
		
		public void display () {
			System.out.println("Id : " +  id);
			System.out.println("Name :" + name);
			System.out.println("Percentage :" + percentage);
		}
		

		public void Student ( int a , String b , double c ) {
			
			System.out.println("this :" +this);
			this.id = a;
			this.name = b;
			this.percentage = c;
		}
		
	}
}

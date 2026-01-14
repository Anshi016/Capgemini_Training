package methods;

public class Program4 {
	public static void main(String[] args) {
		num(1,2);
		num('A', 20);
		
		/*
		 * Compiler --> Actual argument
		 * process of binding between method call statement and implementation 
		 * of the method during compilation by the compiler 
		 * based on actual argument*/
		
	}
	
	public static void num(int a, int b) {
		System.out.println(a+b);
		System.out.println("int,int");
	}
	
	public static void num(double a , double b ) {
		System.out.println("double , double");
	}
	
	/*
	public static void num(char a , char b ) {
		System.out.println("char , char");
	}
	
	public static void num(int a , char b ) {
		System.out.println("int, char");
	}

	public static void num(char a , int b ) {
		System.out.println("char , int");
	}
	*/
}

package looping_tmt.whileloop;

public class Program2 {
	public static void main(String[] args) {
		
		//Reverse a number  
		
		int num = 1863;
		int rev = 0;
		
		while ( num !=0) {
		
			rev = num % 10 + rev*10;
			num = num/10;
		}
		
		System.out.println(rev);
		
		
	}

}

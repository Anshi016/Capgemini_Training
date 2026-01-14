package Assignment;

public class NeonNumber {
	
	public static void main(String[] args) {
		
		int num = 9;
		int square = num*num;
		int sum = 0 ;
		
		while ( square != 0) {
			sum = sum + (square % 10);
			square = square / 10;
			
		}
		System.out.println("Sum : "+sum);
		
		if ( num == sum) {
			System.out.println("Neon number");
		} else {
			System.out.println("Not a neon number");
		}
	}

}

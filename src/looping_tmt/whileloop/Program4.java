package looping_tmt.whileloop;

public class Program4 {
	public static void main(String[] args) {
		
		int num = 9;
		int temp = num;
		int square  = num*num;
		int sum = 0;
		
		while ( square != 0) {
			sum = sum + ( square % 10);
			square = square/10;
			
		}
		
		if (sum == temp) {
			System.out.println("Neon");
		} else {
			System.out.println("Not a neon ");
		}
	}

}

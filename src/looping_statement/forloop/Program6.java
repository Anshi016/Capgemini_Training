package looping_statement.forloop;

public class Program6 {
	public static void main(String[] args) {
		int n= 3 ;
		
		
		
		for ( int row = 1 ; row <= n ; row++) {
			for ( int k = 1 ; k <= (n-row) ; k++) {
				System.out.print(" ");
				
			}
			
			for ( int col = 1 ; col <= (2*row - 1) ; col++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}

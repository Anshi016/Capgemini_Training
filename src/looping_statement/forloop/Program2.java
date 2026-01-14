package looping_statement.forloop;

public class Program2 {
	public static void main(String[] args) {
		 int i = 3;
		 int count = 0;
		 
		 for ( int j=1;j<=i;j++) {
			 if ( i%j ==0) {
				 count++;
			 }
		 }
		 
		 if ( count == 2 ) {
			 System.out.println("Prime number");
		 } else {
			 System.out.println("Not");
		 }
	}
}

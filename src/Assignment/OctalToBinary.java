package Assignment;

public class OctalToBinary {
	public static void main(String[] args) {
		int num = 11;
		int temp = num;
		int binary=0;
		int place = 1;
		int count = 0;
		
		
		while( num != 0) {
			int rem = num % 2;
			binary = binary + rem * place;
			place = place *10;
			num = num / 2;
			
			if ( binary == 1) {
				count++;
			}
			
		}
		
		System.out.println("Binary form of " + temp + " is " + binary);
		
		if ( count % 2 == 0) {
			System.out.println("Evil Number");
		} else {
			System.out.println("Not an evil number");
		}
	}

}

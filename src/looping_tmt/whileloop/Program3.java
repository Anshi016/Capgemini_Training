package looping_tmt.whileloop;

public class Program3 {
	public static void main(String[] args) {
		
		//SPY number
		
		int num =123;
		int temp = num;
		int sum = 0;
		int product = 1;
		
		while(num != 0) {
			
			sum = sum + (num % 10);
			
			product = product * (num % 10);
			
			num = num/10;
		}
			
		System.out.println(sum);
		System.out.println(product);
		
		if ( sum == product) {
			System.out.println(temp +" is a spy number");
			
		} else {
			System.out.println(temp +" is not a spy number");
		}
			
		
	}

}

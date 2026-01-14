package methods;

public class Program6 {
	public static void main(String[] args) {
		int res = strongNumber(145);
		System.out.println(res);
		
	}
	
	public static long fact(int n) {
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        else {
        	
            return n * fact(n - 1);
        }


        
    }
	
	public static int strongNumber ( int num) {
		int temp = num;
		long sum =0;
		
		while ( num !=0) {
			int digit = num % 10;
			
			
			sum = sum +fact(digit);
		}
		
		if( temp == sum) {
			System.out.println("strongNumber");
		}
		else {
			System.out.println("Not strong");
		}
		return (int) sum;
		
		
		
	}

}

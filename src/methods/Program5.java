package methods;

public class Program5 {
	public static void main(String[] args) {
		 String res = sunnyNumber(8);
		 System.out.println(res);
	}
	
	public static String sunnyNumber ( int num) {
		int count = 0;
		for ( int i = 1 ; i <= num+1 ;i++) {
			if( i*i == num+1) {
				count++;
				break;
			}
		}
		
		return count == 1 ? "Sunny number " : "Not a sunny number";
	}
}

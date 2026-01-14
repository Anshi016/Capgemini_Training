package flowControlStatement.DecisionStatement;

public class Program3 {
	public static void main(String[] args) {
		//special 2 digit number
		
		int num = 29;
		int temp = num;
		int last = num % 10;
		int first = num /10;
		int sum = last + first;
		int product = last * first;
		
		if (temp == ( sum + product)) {
			System.out.println("Special 2 digit number");
		} else {
			System.out.println("Not a special 2 digit number");
		}
		
	}

}

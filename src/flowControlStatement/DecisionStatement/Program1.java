package flowControlStatement.DecisionStatement;

public class Program1 {
	
	public static void main(String[] args) {
		
		if(true) {
			System.out.println("1");
			System.out.println("2");
		}
		
		System.out.println("Main End");
		
		if(false) {
			System.out.println("1");
			System.out.println("2");
		}
		
		System.out.println("Main End 2");
		
		if(false)
		System.out.println("1");
		System.out.println("2");
		System.out.println("Main End");
		
		if(10>20) {
			System.out.println("1");
			System.out.println("2");
		}
		
		System.out.println("Main End");
			
		
	}

}

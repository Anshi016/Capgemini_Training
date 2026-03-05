package advance_java.DAY1.lambdaFunction;

public class Main {
	public static void main(String[] args) {
		 
		// Implemented using overriding
		
//		Demo demo = new DemoImplementation();
//		demo.sample();
		
		// Implemented using lambda expression --> if the method is not an argument method and not a return type method in the Function interfaces
		/*
		Demo demo = () -> {
			System.out.println("Method implemented using Lambda Expression");
		};
		
		demo.sample();
		
		
		Demo demo1 = () -> 
			System.out.println("Method implemented using Lambda Expression");
			System.out.println("Method implemented using Lambda ");
			
		demo1.sample();
		*/
		
		// Arugumented lambda expression
		
		Demo demo = (num1  , num2)-> {
			System.out.println("For two argument method");
			System.out.println(num1);
			System.out.println(num2);
			return  num1 +  num2;
		};
		
		
		demo.sample(1200 , 125);
		demo.sample(1201, 1258); 
		// If the method is single argument method and single statement is provided the method
		
		Demo demo1 = (num1 , num2) ->  num1 + num2;	
		System.out.println(demo1.sample(100, 120));
		
	}

}

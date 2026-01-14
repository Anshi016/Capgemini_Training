package array;

public class Program7 {
	public static void main(String[] args) {
		
//		int[] i = new int[3];
//		i[0] = 23;
//		i[1]=23;
//		i[2]=45;
		
		
		Employee[] employee = new Employee[5];
		employee[0] = new Employee(1 , "A" , 200000);
		employee[1] = new Employee(2 , "B" , 300000);
		employee[2] = new Employee(3 , "C" , 400000);
		
		
		for(int i = 0; i < employee.length; i++) {
			//System.out.println(employee[i]);
			employee[i].display();
		}
	}
}

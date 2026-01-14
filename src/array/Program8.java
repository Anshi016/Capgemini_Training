package array;

public class Program8 {
	public static void main(String[] args) {
		int[] arr = {5, 6, 3, 2, 1};
		int max = arr[0];
		int min = arr[0];
		
		if( arr.length == 1) {
			max = arr[0];
			min = arr[0];
		}
		
		else {
				for(int i = 0 ; i < arr.length ; i++) {
				
				if ( arr[i] > arr[i+1]) {
					max = arr[i];	
				} else if ( arr[i] < arr[i+1]) {
					min = arr[i];
				} 
			}
		}
		
		
	}
}

package advance_java.DAY1;




//Collections --> accept all type
class Box1 {
	Object value;
	
	void set(Object value) {
		this.value = value;
	}
	
	Object get() {
		return value;
	}
	
	
	// T - type , N - Number , K - Key , V - Value  , E - Element
	
}



//Generics --> accepts T type data
class Box2 <T> {
	T value;
	
	void set(T value) {
		this.value = value;
	}
	
	T get() {
		return value;
	}
	
	
	// T - type , N - Number , K - Key , V - Value  , E - Element
	
}

public class Collection {
	public static void main(String[] args) {
		
		
			Box2<String> box2 = new Box2();
			box2.set("10");
	
			
			String s3 =  box2.get();
			System.out.println(s3);
		
//			Box1 box1 = new Box1();
//			box1.set(10);
//			box1.set("Anshi");
//			String s1 = (String) box1.get();
//			int s2 = (int) box1.get();
//			System.out.println(s1);
//			System.out.println(s2);
		
		
			
		
	}
}
	
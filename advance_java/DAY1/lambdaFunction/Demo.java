package advance_java.DAY1.lambdaFunction;

@FunctionalInterface 
// It will restrict interface to create more than one interface (Only one non static method)

public interface Demo {
	
	int sample(int rollNumber , int name);
	static void test() {}
}

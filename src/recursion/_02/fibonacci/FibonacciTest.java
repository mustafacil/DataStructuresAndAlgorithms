package recursion._02.fibonacci;

public class FibonacciTest {
	
	public static void main(String[] args) {
		
		System.out.println(fibonacci(9));
		
	}
	
	public static int fibonacci(int n) {
		
		if(n < 1) throw new RuntimeException("Number must be greater than or equal to 1");
		
		else if (n==1 || n==2)
			return (n-1);
		
		else
			return fibonacci(n-1) + fibonacci(n-2);
		
		
		
	}

}

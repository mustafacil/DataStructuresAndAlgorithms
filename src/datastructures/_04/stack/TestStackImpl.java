package datastructures._04.stack;

public class TestStackImpl {

	public static void main(String[] args) {
		
		
		StackImpl<Integer> stackImpl = new StackImpl<>(5);
		
		System.out.println("After initialization:");
		stackImpl.display();
		
		System.out.println("After push 1:");
		stackImpl.push(1);
		stackImpl.display();
		
		System.out.println("After push 2:");
		stackImpl.push(2);
		stackImpl.display();
		
		System.out.println("After push 3:");
		stackImpl.push(3);
		stackImpl.display();
		
		System.out.println("After push 4:");
		stackImpl.push(4);
		stackImpl.display();
		
		System.out.println("After push 5:");
		stackImpl.push(5);
		stackImpl.display();
		
		System.out.println("After push 6:");
		stackImpl.push(6);
		stackImpl.display();
		
		System.out.println("After pop 5:");
		stackImpl.pop();
		stackImpl.display();
		
		System.out.println("After pop 4:");
		stackImpl.pop();
		stackImpl.display();
		
		System.out.println("After pop 3:");
		stackImpl.pop();
		stackImpl.display();
		
		System.out.println("After pop 2:");
		stackImpl.pop();
		stackImpl.display();
		
		System.out.println("After pop 1:");
		stackImpl.pop();
		stackImpl.display();
		
		System.out.println("After pop again:");
		stackImpl.pop();
		stackImpl.display();
	}
	
}

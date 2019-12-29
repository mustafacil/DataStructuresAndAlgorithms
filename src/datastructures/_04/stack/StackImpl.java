package datastructures._04.stack;

public class StackImpl<T> {

	private Object arr[];
	private int size;
	private int deepIndex;
	private int topIndex;
	private int numberOfElements;

	public StackImpl(int size) {

		this.size = size;
		arr = new Object[size];
		deepIndex = size;
		topIndex = size-1;
		
		
	}
	
	public boolean isFull() {
		 return numberOfElements == size;
	}

	public boolean isEmpty() {
		return numberOfElements == 0;
	}
	
	public void push(T value) {
		
		if(this.isFull()) {
			System.out.println("The Stack is Full");
			return;
		}
		
		for (int i = 1; i < arr.length; i++) {
			arr[i-1] = arr[i];
		}
		
		arr[topIndex] = value;
		--deepIndex;
		++numberOfElements;
		
	}
	
	public T pop() {
		
		if(this.isEmpty()) {
			System.out.println("The Stack is Empty");
			return null;
		}
		
		T value = (T) arr[topIndex]; 
		
		for (int i = arr.length-1; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		
		arr[deepIndex++] = null;
		--numberOfElements;
		return value;
	}
	
	public T peek() {
		return (T) arr[topIndex];
	}
	
	public void display() {
		
		for (int i = arr.length-1; i >=0; i--) {
			System.out.println("arr[" + i + "]: " + arr[i]);
		}
		
	}
}

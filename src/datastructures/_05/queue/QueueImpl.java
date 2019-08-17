package datastructures._05.queue;

public class QueueImpl <T>{
	
	private Object arr[];
	private int size;
	private int rearIndex;
	private int frontIndex;
	private int numberOfElements;
	
	public QueueImpl(int size) {
		
		this.size = size;
		arr = new Object[size];
		rearIndex = -1;
		
	}
	
	private boolean isFull() {
		return numberOfElements == size;
	}
	
	private boolean isEmpty() {
		return numberOfElements == 0;
	}
	
	public void enqueue(T value) {
		if(this.isFull()) {
			System.out.println("The Queue is Full");
			return;
		}
		
		arr[++rearIndex] = value;
		++numberOfElements;
	}
	
	public T dequeue() {
		
		if(this.isEmpty()) {
			System.out.println("The Queue is Empty");
			return null;
		}
		
		T value = (T) arr[frontIndex];
		
		for (int i = 1; i < arr.length; i++) {
			arr[i-1] = arr[i];
		}
		
		arr[rearIndex--] = null;
		--numberOfElements;
		
		return value;
		
	}
	
	public void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]: " + arr[i]);
		}
	}
}

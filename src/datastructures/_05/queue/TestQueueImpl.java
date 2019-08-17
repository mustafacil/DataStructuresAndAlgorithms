package datastructures._05.queue;

public class TestQueueImpl {
	
	public static void main(String[] args) {
		
		
		QueueImpl<Integer> queueImpl = new QueueImpl<>(5);
		
		System.out.println("After Initialization:");
		queueImpl.display();
		
		System.out.println("After enqueue 1:");
		queueImpl.enqueue(1);
		queueImpl.display();
		
		System.out.println("After enqueue 2:");
		queueImpl.enqueue(2);
		queueImpl.display();
		
		System.out.println("After enqueue 3:");
		queueImpl.enqueue(3);
		queueImpl.display();
		
		System.out.println("After enqueue 4:");
		queueImpl.enqueue(4);
		queueImpl.display();
		
		System.out.println("After enqueue 5:");
		queueImpl.enqueue(5);
		queueImpl.display();
		
		System.out.println("After enqueue 6:");
		queueImpl.enqueue(6);
		queueImpl.display();
		
		System.out.println("After dequeue 1:");
		queueImpl.dequeue();
		queueImpl.display();
		
		System.out.println("After dequeue 2:");
		queueImpl.dequeue();
		queueImpl.display();
		
		System.out.println("After dequeue 3:");
		queueImpl.dequeue();
		queueImpl.display();
		
		System.out.println("After dequeue 4:");
		queueImpl.dequeue();
		queueImpl.display();
		
		System.out.println("After dequeue 5:");
		queueImpl.dequeue();
		queueImpl.display();
		
		System.out.println("After dequeue again:");
		queueImpl.dequeue();
		queueImpl.display();
	}

}

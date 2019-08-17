package datastructures._02.linkedlist;

public class TestLinkedListImpl {
	
	public static void main(String[] args) {
		
		LinkedListImpl<Integer> linkedList = new LinkedListImpl<>();
		
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		
		linkedList.display();
		
		linkedList.remove();
		linkedList.remove();
		System.out.println("After removing two nodes: ");
		linkedList.display();
		
	}

}

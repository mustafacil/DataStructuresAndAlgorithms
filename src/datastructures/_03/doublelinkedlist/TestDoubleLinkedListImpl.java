package datastructures._03.doublelinkedlist;

public class TestDoubleLinkedListImpl {

	public static void main(String[] args) {
		
		DoubleLinkedListImpl<Integer> doubleLinkedListImpl = new DoubleLinkedListImpl<>();
		
		doubleLinkedListImpl.add(1);
		doubleLinkedListImpl.add(2);
		doubleLinkedListImpl.add(3);
		doubleLinkedListImpl.add(4);
		doubleLinkedListImpl.add(5);
		
		doubleLinkedListImpl.display();
		
		doubleLinkedListImpl.remove();
		doubleLinkedListImpl.remove();
		
		System.out.println("After remove two nodes: ");
		
		doubleLinkedListImpl.display();
		
	}
	
}

package datastructures._02.linkedlist;

public class LinkedListImpl <T>{
	
	private Node headNode;
	
	public void add(T value) {
		
		Node newNode = new Node(value, null);
		
		if(headNode==null) {
			headNode = newNode;
		}else {
			newNode.setNextNode(headNode);
			headNode = newNode;
		}
		
	}
	
	public void remove() {
		headNode = headNode.getNextNode();
	}
	
	public void display() {
		Node n = headNode;
		
		while(n!=null) {
			System.out.println(n.getValue());
			n = n.getNextNode();
		}
	}

}

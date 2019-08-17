package datastructures._03.doublelinkedlist;

public class DoubleLinkedListImpl<T> {

	private Node headNode;

	public void add(T value) {
		
		Node newNode = new Node(value, null, null);

		if (headNode == null) {
			
			headNode = newNode;
			
		}else {
			newNode.setNextNode(headNode);
			headNode.setPreviousNode(newNode);
			headNode = newNode;
		}

	}
	
	public void remove() {
		
		headNode = headNode.getNextNode();
		headNode.setPreviousNode(null);
		
	}

	public void display() {
		Node n = headNode;
		
		while(n!=null) {
			System.out.println(n.getValue());
			n = n.getNextNode();
		}
	}
	
}

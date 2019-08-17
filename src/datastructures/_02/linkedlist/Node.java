package datastructures._02.linkedlist;

public class Node {
	
	private Object value;
	private Node nextNode;
	
	public Node(Object value, Node nextNode) {
		super();
		this.value = value;
		this.nextNode = nextNode;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	
	
	
}

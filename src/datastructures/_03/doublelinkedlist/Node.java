package datastructures._03.doublelinkedlist;

public class Node {
	
	private Object value;
	private Node nextNode;
	private Node previousNode;
	
	public Node(Object value, Node nextNode, Node previousNode) {
		super();
		this.value = value;
		this.nextNode = nextNode;
		this.previousNode = previousNode;
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
	public Node getPreviousNode() {
		return previousNode;
	}
	public void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}
	
	

}

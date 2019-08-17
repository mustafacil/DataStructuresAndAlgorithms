package datastructures._07.binarysearchtree;

public class AVLTree implements Tree {

	private Node rootNode;

	@Override
	public void traverse() {

		inOrderTraverse(rootNode);

	}

	private void inOrderTraverse(Node node) {

		if (node == null)
			return;
		
		if(node.getLeftNode()!=null) {
			inOrderTraverse(node.getLeftNode());
		}

		System.out.println(node.getData());
		
		if(node.getRightNode()!=null) {
			inOrderTraverse(node.getRightNode());
		}
	}

	@Override
	public void insert(int data) {
		
		rootNode = insert(rootNode, data);

	}
	
	private Node insert(Node node, int data) {
		
		if(node == null) {
			return new Node(data, null, null);
		}
		
		if(data < node.getData()) {
			node.setLeftNode(insert(node.getLeftNode(), data));
		}else {
			node.setRightNode(insert(node.getRightNode(), data));
		}
		
		node.setHeight(Math.max(getHeight(node.getLeftNode()), getHeight(node.getRightNode()))+1);
		
		node = settleViolation(node, data);
		
		return node;
	}
	
	private Node settleViolation(Node node, int data) {
		
		int balance = getBalance(node);
		
		
		//Case-1 left - left
		if(balance > 1 && data < node.getLeftNode().getData()) {
			return rightRotation(node);
		}
		
		//Case-2 right - right
		if(balance < -1 && data > node.getRightNode().getData()) {
			return leftRotation(node);
		}
		
		//Case-3 left - right 
		if(balance > 1 && data > node.getLeftNode().getData()) {
			
			node.setLeftNode(leftRotation(node.getLeftNode()));
			return rightRotation(node);
			
		}
		
		//Case-4 right - left
		if(balance < -1 && data < node.getRightNode().getData()) {
			
			node.setRightNode(rightRotation(node.getRightNode()));
			return leftRotation(node);
			
		}
		
		return node;
	}
	
	private Node leftRotation(Node node) {
		
		System.out.println("Left Rotation: " + node.getData());
		
		Node tempRightNode = node.getRightNode();
		Node l = tempRightNode.getLeftNode();
		
		tempRightNode.setLeftNode(node);
		node.setRightNode(l);
		
		node.setHeight(Math.max(getHeight(node.getLeftNode()), getHeight(node.getRightNode()))+1);
		tempRightNode.setHeight(Math.max(getHeight(tempRightNode.getLeftNode()), getHeight(tempRightNode.getRightNode()))+1);
		
		return tempRightNode;
	}

	private Node rightRotation(Node node) {
		
		System.out.println("Right Rotation: " + node.getData());
		
		Node tempLeftNode = node.getLeftNode();
		Node r = tempLeftNode.getRightNode();
		
		tempLeftNode.setRightNode(node);
		node.setLeftNode(r);
		
		node.setHeight(Math.max(getHeight(node.getLeftNode()), getHeight(node.getRightNode()))+1);
		tempLeftNode.setHeight(Math.max(getHeight(tempLeftNode.getLeftNode()), getHeight(tempLeftNode.getRightNode()))+1);
		
		return tempLeftNode;
	}

	private int getBalance(Node node) {
		if(node == null) return 0;
		
		return getHeight(node.getLeftNode()) - getHeight(node.getRightNode());
	}
	
	private int getHeight(Node node) {
		
		if(node == null) return -1;
		
		return node.getHeight();
		
	}

}

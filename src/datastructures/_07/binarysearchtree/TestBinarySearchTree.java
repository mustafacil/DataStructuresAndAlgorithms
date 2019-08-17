package datastructures._07.binarysearchtree;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		
		Tree treeImplRR = new AVLTree();
		System.out.println("right right:");
		treeImplRR.insert(1);
		treeImplRR.insert(2);
		treeImplRR.insert(3);
		
		treeImplRR.traverse();
		
		System.out.println();
		
		Tree treeImplLL = new AVLTree();
		System.out.println("left left:");
		treeImplLL.insert(3);
		treeImplLL.insert(2);
		treeImplLL.insert(1);
		
		treeImplLL.traverse();
		
		System.out.println();

		Tree treeImplLR = new AVLTree();
		System.out.println("left right:");
		treeImplLR.insert(3);
		treeImplLR.insert(1);
		treeImplLR.insert(2);
		
		treeImplLR.traverse();
		
		System.out.println();
		
		Tree treeImplRL = new AVLTree();
		System.out.println("right left:");
		treeImplRL.insert(1);
		treeImplRL.insert(3);
		treeImplRL.insert(2);
		
		treeImplRL.traverse();
		
	}
	
}

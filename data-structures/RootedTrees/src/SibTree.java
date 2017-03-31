
public class SibTree {
	SibTreeNode root;
	int size;
	int height;
	
	public SibTree() {
		root = null;
	}
	
	public SibTree(SibTreeNode node) {
		root = node;
		size = 1;
		height = 1;
	}
	
	public void traversePreOrder() {
		
		System.out.println("Preorder Traversal");
		this.root.preOrderTraversal();
		System.out.print("\n");
		
	}
	
	public void traversePostOrder() {
		
		System.out.println("Postorder Traversal");
		this.root.postOrderTraversal();
		System.out.print("\n");
	}
	
	public void traverseInOrder() {
		
		System.out.println("Inorder Traversal");
		this.root.inOrderTraversal();
		System.out.print("\n");
	}	
}

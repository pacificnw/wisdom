
public class SibTreeNode {

	Object item;
	SibTreeNode parent;
	SibTreeNode firstChild;
	SibTreeNode nextSibling;
	
	public SibTreeNode(Object data) {
		item = data;
		parent = null;
		firstChild = null;
		nextSibling = null;
	}
	
	// Create a child from an existing parent
	public SibTreeNode addChild(SibTreeNode child) {
		
		child.parent = this;
		this.firstChild = child;
		
		return child;
	}
	
	// Create a sibling from an existing child
	public SibTreeNode addSibling(SibTreeNode sibling) {
		
		sibling.parent = this.parent;
		this.nextSibling = sibling;
		
		return sibling;
	}
	
	// Generate a Prefix Expression
	public void preOrderTraversal() {
	
		System.out.print(" " + this.item);
		
		if (this.firstChild != null) {
			this.firstChild.preOrderTraversal();
		}
		
		if (this.nextSibling != null) {
			this.nextSibling.preOrderTraversal();
		}
	}
	
	// Generate a Postfix Expression
	public void postOrderTraversal() {
		
		if (this.firstChild != null) {
			this.firstChild.postOrderTraversal();
		}
		
		System.out.print(" " + this.item);
		
		if (this.nextSibling != null) {
			this.nextSibling.postOrderTraversal();
		}
	}
	
	// Generate an Infix Expression
	public void inOrderTraversal() {
		
		// TODO : Come back and look into this...
		// It should be reporting 7 * 3 + 4 ^ 2 but seems to be doing some other traversal
		
		if (this.firstChild != null) {
			this.firstChild.inOrderTraversal();
		}
		
		if (this.nextSibling != null) {
			this.nextSibling.inOrderTraversal();
		}	
		
		System.out.print(" " + this.item);
		

	}
}

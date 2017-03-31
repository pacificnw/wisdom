
public class BinaryTreeNode {
	BinaryTreeNodeEntry entry;
	BinaryTreeNode nodeParent;
	BinaryTreeNode leftChild;
	BinaryTreeNode rightChild;
	
	public void InOrderTraversal() {
		if (leftChild != null) {
			leftChild.InOrderTraversal();
		}
		
		System.out.print(" " + this.entry.binaryTreeNodeEntryKey);
		
		if (rightChild != null) {
			rightChild.InOrderTraversal();
		}
	}

}

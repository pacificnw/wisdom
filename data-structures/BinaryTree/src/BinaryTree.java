
public class BinaryTree {
	BinaryTreeNode root;
	int size;
	
	public BinaryTree() {
		root = null;
		size = 0;
	}
	
	public Object find(Object k) {
		BinaryTreeNode node = root;
	
		// TODO : Add a mechanism to track the nodes that are largest but < k and smallest but > k
		
		while (node != null) {
			int comp = ((Comparable) k).compareTo(node.entry.binaryTreeNodeEntryKey);
			
			if (comp < 0) {
				node = node.leftChild;
			} else if (comp > 0 ) {
				node = node.rightChild;
			} else {
				return node.entry;
			}
		}

		return null;
	}	
	
	public Object first(Object k) {
		if (size == 0) { 
			return null;
		} else {
			// From root, walk to left, until reach node that has no more left child, that node will be the minimum key.
			// TODO : implement
			return null;
		}
	
	}
	
	public Object last(Object k) {
		if (size == 0) {
			return null;
		} else {
			// From root, walk to the right, until reach node that has no more right child, that node will be the maximum key.
			// TODO : implement
			return null;
		}
		
	}
	
	public BinaryTreeNodeEntry insert(Object k, Object v) {
		// Follow same path through tree as find(). When you reach null reference, replace null with new Entry(k,v).
		// If values are the same, just throw it on subtree the left.
		
		// TODO : Implement
		return new BinaryTreeNodeEntry(k, v);
	}
	
	public BinaryTreeNodeEntry remove(Object k) {
		// Find a node n with key k.
		// Return null if k not in tree.
		// If n has no children, detach it from parent.
		// If n has one child, move n's child up to take n's place
		// If n has two children : 
		// 		Let x be node in n's right subtree with the smallest key. (Keep going to the left)
		//		Remove x, x has no left child and is easily removed
		// 		Replace n's key with x's key.
		
		// TODO : Implement
		return new BinaryTreeNodeEntry(null, null);
	}
}

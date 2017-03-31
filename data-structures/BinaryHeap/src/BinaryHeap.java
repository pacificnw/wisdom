import java.util.*;
/*
 * Mapping of Binary Tree Nodes to Array Indexes is Node Level Numbering
 * Node i's children are 2i, 2i+1 and it's parent is floor[i/2]
 * 
 * Each tree node has two references (key,value) - OR use Entry object
 */
public class BinaryHeap {
	ArrayList<BinaryHeapEntry> binaryHeap;
	private final int treeRootNodeIndex = 1;
	
	private int leftChildIndex(int heapNodeIndex) {
		return 2 * heapNodeIndex;
	}
	
	private int rightChildIndex(int heapNodeIndex) {
		return 2 * heapNodeIndex + 1;
	}
	
	private int parentIndex(int heapNodeIndex) {
		return heapNodeIndex / 2;
	}
	
	public BinaryHeap() {
		binaryHeap = new ArrayList<BinaryHeapEntry>();
		binaryHeap.add(null);
	}
	
	public BinaryHeapEntry min() {
		// return the entry at the root of the tree
		if (!binaryHeap.isEmpty()) {
			return binaryHeap.get(treeRootNodeIndex);
		} else {
			return null;
		}
	}

	public void insertBubbleUpHeap(int index) {
		BinaryHeapEntry current = binaryHeap.get(index);
		BinaryHeapEntry parent = binaryHeap.get(parentIndex(index));
		
		// For simplicity - just use Integer for now - add a comparator later...
		if (index > treeRootNodeIndex) {
			if ((Integer)current.binaryHeapEntryKey < (Integer)parent.binaryHeapEntryKey) {
				binaryHeap.set(index, parent);
				binaryHeap.set(parentIndex(index), current);
				
				insertBubbleUpHeap(parentIndex(index));
			}
		}
	}
	
	public BinaryHeapEntry insert(BinaryHeapEntry entry) {
		return this.insert(entry.binaryHeapEntryKey, entry.binaryHeapEntryValue);
	}
	
	public BinaryHeapEntry insert(Object key, Object value) {

		// Let x be new Entry (k,v).
		// Place x at the bottom of the tree in the first open spot from the left - if full start new level.
		// -- Mean's you're always putting a new entry at the end of the array.
		
		// If the entry fails Entry Order Property of Binary Heap tree, bubble it up the nodes, until satisfied.
		
		// Repeat the following
		//     	compare x's key with parent's key, if x's key is less, then exchange with parent.
		//     	repeat until x can't move up anymore.
		BinaryHeapEntry entry = new BinaryHeapEntry(key, value);
		
		binaryHeap.add(entry);
		insertBubbleUpHeap(binaryHeap.size() - 1);
		
		return entry;
	}
	
	// TODO : Need to finish this implementation to rebuild the tree...
	public BinaryHeapEntry removeMin() {
		// Remove the entry at the root node. (Because of Heap Order Property).
		// Now there's a hole. Fill it with the last entry of the tree.
		// Bubble it down through the tree.
		
		// Repeat the following
		//    	If x > one or both of it children, swap x with it's minimum child.
		
		BinaryHeapEntry entry = new BinaryHeapEntry(null, null);
		
		return entry;
	}

	public void displayTree() {
		
		int newLevel = 1;
		
		for (int index = 1; index < binaryHeap.size(); index++) {
			if (index == newLevel * 2) {
				System.out.print("\n");
				newLevel *= 2;
			}
			System.out.print(" " + binaryHeap.get(index).binaryHeapEntryKey);
		}
	}
}

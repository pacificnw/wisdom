
public class Solution {

	public static void main(String[] arguments) {
		
		/*
		 * This is the implementation that a PriorityQueue would implement.
		 * It's a binary tree structure, but is represented with a list.
		 */
		
		BinaryHeap binaryHeap = new BinaryHeap();
		BinaryHeapEntry entry1 = new BinaryHeapEntry(5, "Chinook");
		BinaryHeapEntry entry2 = new BinaryHeapEntry(10, "Pink");
		BinaryHeapEntry entry3 = new BinaryHeapEntry(4, "Soho");
		BinaryHeapEntry entry4 = new BinaryHeapEntry(1, "Alaskan King");
		BinaryHeapEntry entry5 = new BinaryHeapEntry(3, "Copper River");
		BinaryHeapEntry entry6 = new BinaryHeapEntry(2, "Columbia River");
		BinaryHeapEntry entry7 = new BinaryHeapEntry(14, "Atlantic");
		BinaryHeapEntry entry8 = new BinaryHeapEntry(1, "Willamette");
		BinaryHeapEntry entry9 = new BinaryHeapEntry(13, "Cutthroat");
		BinaryHeapEntry entry10 = new BinaryHeapEntry(21, "Sockeye");
		BinaryHeapEntry entry11 = new BinaryHeapEntry(5, "Washington");
		BinaryHeapEntry entry12 = new BinaryHeapEntry(3, "Granny Smith");
		BinaryHeapEntry entry13 = new BinaryHeapEntry(44, "Delicious");
		BinaryHeapEntry entry14 = new BinaryHeapEntry(3, "Golden");
		BinaryHeapEntry entry15 = new BinaryHeapEntry(1, "Pink Lady");
		BinaryHeapEntry entry16 = new BinaryHeapEntry(3, "Jazz");
		BinaryHeapEntry entry17 = new BinaryHeapEntry(4, "Honeycrisp");
		BinaryHeapEntry entry18 = new BinaryHeapEntry(11, "Braeburn");
		BinaryHeapEntry entry19 = new BinaryHeapEntry(13, "Fuji");
		BinaryHeapEntry entry20 = new BinaryHeapEntry(21, "Gala");		
		
		binaryHeap.insert(entry1);
		binaryHeap.insert(entry2);
		binaryHeap.insert(entry3);
		binaryHeap.insert(entry4);
		binaryHeap.insert(entry5);
		binaryHeap.insert(entry6);
		binaryHeap.insert(entry7);
		binaryHeap.insert(entry8);
		binaryHeap.insert(entry9);
		binaryHeap.insert(entry10);
		binaryHeap.insert(entry11);
		binaryHeap.insert(entry12);
		binaryHeap.insert(entry13);
		binaryHeap.insert(entry14);
		binaryHeap.insert(entry15);
		binaryHeap.insert(entry16);
		binaryHeap.insert(entry17);
		binaryHeap.insert(entry18);
		binaryHeap.insert(entry19);
		binaryHeap.insert(entry20);		
		
		binaryHeap.displayTree();
	}
}

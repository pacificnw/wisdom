public class Solution {

	public static void main(String[] arguments) {
	
		Node node1 = new Node(5);
		Node node2 = new Node(3);
		Node node3 = new Node(1);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = null;
		
		System.out.println("Iteratively");
		
		Node nodeIterate = node1; // Set as head
		
		nodeIterate.displayNodes();
		
		Node node4 = new Node(4).add(5).add(6).add(7).add(8).add(9);
		
		nodeIterate = node4;
		
		System.out.println("");
		System.out.println("Chain");
		
		nodeIterate.displayNodes();
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		System.out.println("");
		System.out.println("Using Singly Linked List Object");		
		
		list.addNode(9);
		list.addNode(8);
		list.addNode(7);
		list.addNode(6);
		list.addNode(5);
		list.addNode(4);
		list.addNode(3);
		list.addNode(2);
		list.addNode(1);		
		
		list.displayNodes();
		
		list.displayLinkedList();
		
		list.reverseLinkedList();
		
		list.displayLinkedList();
		
	}
}

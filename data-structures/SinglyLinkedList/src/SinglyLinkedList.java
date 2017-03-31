
public class SinglyLinkedList {

	Node header;
	int count;
	
	public SinglyLinkedList() {
		header = null;
		count = 0;
	}
	
	public Node addNode(Object data) {
		
		if (header == null) {
			header = new Node(data);
		} else {
			
			Node currentNode = header;
			
			while (currentNode.next != null){
				currentNode = currentNode.next;
			}
			
			currentNode.add(data);
		}
		count++;
		
		return header;
	}
	
	public void reverseLinkedList() {
		
		Node before = null;
		Node current = header;
		Node after = header.next;
		
		this.reverse(before, current, after);
	}
	
	public void displayNodes() {
		header.displayNodes();
	}
	
	public void displayLinkedList() {
		System.out.print("[Count : " + count + "] ");
		header.displayLinkedList();
	}
	
	private void reverse(Node before, Node current, Node after) {

		current.next = before;
		
		if (after!=null)
		{
			reverse(current, after, after.next);
		}
		else
		{
			header = current;
		}
	}
	
	private void printTuple(Node before, Node current, Node after) {
		
		String beforeString = (before != null) ? Integer.toString((int)before.data) : "null";
		String currentString = (current != null) ? Integer.toString((int)current.data) : "null";
		String afterString = (after != null) ? Integer.toString((int)after.data) : "null";
		System.out.println("Swapping : [" + beforeString + " " + currentString + " " + afterString + "]");		
	}
}

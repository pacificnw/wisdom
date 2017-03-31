
public class Node {

	public Object data;
	public Node next;

	public Node(Object nodeData) {
		this.data = nodeData;
		this.next = null;
	}
	
	public Node add(Object nodeData) {
	
		Node newNode = new Node(nodeData);
		
		if (this.next == null) {
			this.next = newNode;
		} else {
			this.next.add(nodeData);
		}
		
		return this;
	}
	
	public Object display() {
		return this.data;
	}
	
	public void displayNodes() {
		Node currentNode = this;
		while (currentNode != null){
			
			System.out.println(currentNode + " : " + currentNode.display());
			currentNode = currentNode.next;
		}		
	}
	
	public void displayLinkedList() {
		Node currentNode = this;
		
		System.out.print("[");
		
		while (currentNode != null){
			System.out.print(" --> " + currentNode.display());
			currentNode = currentNode.next;
		}
		
		System.out.print(" ]\n");
	}	
}

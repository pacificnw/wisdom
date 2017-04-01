public class Vertex {
	protected int value;
	protected boolean visited;
	protected Vertex next;
	protected Vertex parent;
	protected int depth;
		
	public Vertex(int initialValue) {
		value = initialValue;
		visited = false;
		next = null;
		parent = null;
		depth = 0;
	}
	
	public void visit(Vertex origin) {
		this.parent = origin;
		if (origin == null) {
			this.depth = 0;
		} else {
			this.depth = origin.depth + 1;
		}
	}
	
	
	public Vertex addVertex(Vertex destination) {
		Vertex headVertex = this;
		Vertex currentVertex = headVertex;
		
		// there's something on the list, put the value in order
		while (currentVertex != null) {
			if (currentVertex.next != null && 
				currentVertex.value <= destination.value && 
				destination.value <= currentVertex.next.value) {
				
				// higher than prior, so insert here
				destination.next = currentVertex.next;
				currentVertex.next = destination;
				break;
			} else if (currentVertex.next == null) {
				// reached the end, so insert here
				destination.next = null;
				currentVertex.next = destination;
				break;
				
			} else {
				// continue processing
				currentVertex = currentVertex.next;
			}
		}
	
		return headVertex;
	}
}
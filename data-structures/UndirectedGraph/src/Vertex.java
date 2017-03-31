public class Vertex {
	int value;
	boolean visited;
	Vertex next;
		
	public Vertex(int initialValue) {
		value = initialValue;
		visited = false;
		next = null;
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
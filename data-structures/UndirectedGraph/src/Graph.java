import java.util.*;

public class Graph {
	
	private int numberVertices;
	private Hashtable<Integer, Vertex> vertices;
	
	public Graph() {
		vertices = new Hashtable<Integer, Vertex>();
		numberVertices = 0;
	}
	
	public void printGraphVertexList() {
		System.out.println("Graph contains " + numberVertices + " vertices");
		for (Integer vertexKey : vertices.keySet()) {
			System.out.print("[" + vertexKey + "] : ");
			Vertex vertex = vertices.get(vertexKey);
			
			while (vertex != null) {
				System.out.print("[Vertex " + vertex.value + "]");
				vertex = vertex.next;
			}
			
			System.out.println("\n");
		}
	}
	
	/*
	 * The order of origin and destination will always be ordered	
	 */
	public void addVertex(Vertex origin, Vertex destination) {
		
		Vertex minVertex;
		Vertex maxVertex;
		
		if (origin == null && destination == null) {
			return;
		} else if (origin == null) {
			minVertex = origin;
			maxVertex = destination;
		} else if (destination == null) {
			minVertex = destination;
			maxVertex = origin;
		} else {
			minVertex = (origin.value <= destination.value) ? origin : destination;
			maxVertex = (minVertex.value == origin.value) ? destination : origin;
		}
		
		insertVertex(minVertex, maxVertex);
		numberVertices++;
	}
	
	private void insertVertex(Vertex origin, Vertex destination) {
		
		if (origin == null) {
			System.out.println("About to default " + destination.value);
			//vertices.put(destination.value, destination);
		} else if (vertices.containsKey(origin.value)) {
			// Found, get the list and traverse it, add to list
			Vertex dest = vertices.get(origin.value);
			vertices.replace(origin.value, dest.addVertex(destination));
			System.out.println("About to append " + origin.value + " " + destination.value);
		} else {
			vertices.put(origin.value, destination);
			System.out.println("About to insert " + origin.value + " " + destination.value);
		}
	}
}

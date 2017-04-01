import java.util.*;

public class Graph {
	
	private int numberVertices;
	private Hashtable<Integer, Vertex> vertices;
	private Queue<Vertex> queue;
	
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
	 * The order of origin and destination will always be ordered for my implementation.
	 * I'm also assuming that this is a directed graph and there will exist no more than
	 * a single edge between two particular vertices. Also, assume that points, based on
	 * this logic, will be inserted in order, so the largest will be on the edges of the graph.
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
	
	public void performDepthFirstSearch(Vertex origVertex) {
		System.out.print(" " + origVertex.value);
		origVertex.visited = true;
		
		// Get all edges that stem from vertex
		Vertex destVertex = vertices.get(origVertex.value);
		
		while (destVertex != null) {
			if (destVertex.visited != true) {
				performDepthFirstSearch(destVertex);
			}
			destVertex = destVertex.next;
		}
	}
	
	public void performBreadthFirstSearch(Vertex origVertex) {
		System.out.print(" " + origVertex.value);
		origVertex.visit(null);
		origVertex.visited = true;
		
		queue = new LinkedList<Vertex>();
		queue.add(origVertex);
		
		while (!queue.isEmpty()) {
			
			Vertex parentVertex = queue.remove();
			Vertex childVertex = vertices.get(parentVertex.value);
			
			while (childVertex != null) {
				if (childVertex.visited != true) {
					System.out.print(" " + childVertex.value);
					childVertex.visit(parentVertex);
					childVertex.visited = true;
					
					queue.add(childVertex);

				}
				childVertex = childVertex.next;
			}			
			
		}
		
		
		
	}
}

package Graphs;

import java.util.*;

public class Graph {

	public HashMap<Integer, LinkedList> adjacencyList;
	
	public Graph() {
		adjacencyList = new HashMap<Integer, LinkedList>();
	}
	
	public void addVertex(Vertex vertex) {
		if (adjacencyList.containsKey(vertex.value)) {
			Vertex vertexAdd = adjacencyList.get(vertex.value);
			vertexAdd
			//search the list and add it
		} else { 
			
		}
	}
	
	public void graphDepthFirstSearch(Vertex origVertex) {
		// origVertex.visit();
		// origVertex.visited = true;
		
		for (Vertex destVertex : such that (origVertex, destVertex)) {  // This is done for every edge, in order (key)
			if ()
		}
	}
}

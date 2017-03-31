package Graphs;

public class Vertex {

	int value;
	Vertex adjacentVertex;
	
	public Vertex(int vertexValue) {
		value = vertexValue;
		adjacentVertex = null;
	}
	
	public void joinVertex(Vertex vertex) {
		adjacentVertex = vertex;
	}
	
	public void addVertex(int value) {
		Vertex vertex = new Vertex(value);
		adjacentVertex = vertex;
	}
}

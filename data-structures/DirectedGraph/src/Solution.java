public class Solution {

	public static void main(String[] arguments) {
		
		Graph graph = new Graph();
		
		graph.addVertex(new Vertex(1), null);
		graph.addVertex(new Vertex(1), new Vertex(2));
		graph.addVertex(new Vertex(1), new Vertex(3));
		graph.addVertex(new Vertex(4), new Vertex(1));
		graph.addVertex(new Vertex(5), new Vertex(3));
		graph.addVertex(new Vertex(2), new Vertex(7));
		graph.addVertex(new Vertex(5), new Vertex(8));
		graph.addVertex(new Vertex(9), new Vertex(5));
		graph.addVertex(new Vertex(10), new Vertex(5));
		graph.addVertex(new Vertex(6), new Vertex(4));
		graph.addVertex(new Vertex(14), new Vertex(6));
		graph.addVertex(new Vertex(15), new Vertex(6));
		graph.addVertex(new Vertex(16), new Vertex(6));
		graph.addVertex(new Vertex(8), new Vertex(24));
		graph.addVertex(new Vertex(9), new Vertex(22));
		graph.addVertex(new Vertex(10), new Vertex(33));
		graph.addVertex(new Vertex(5), new Vertex(19));
		graph.addVertex(new Vertex(5), new Vertex(32));
		graph.addVertex(new Vertex(3), new Vertex(62));

		System.out.print("\n");
		
		graph.printGraphVertexList();
		
		System.out.println("Depth First Search"); 
		
		//graph.performDepthFirstSearch(new Vertex(1));
		
		graph.performBreadthFirstSearch(new Vertex(1));
	}
}
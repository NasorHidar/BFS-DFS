package dfs;

public class DFSMain {

	public static void main(String[] args) {
		Graph graph = new Graph(6);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);

        // Perform DFS starting from node 1
        graph.dfs(1);
	}

}

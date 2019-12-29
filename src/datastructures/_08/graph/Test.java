package datastructures._08.graph;

public class Test {

	public static void main(String[] args) {
		Graph graph = new Graph();

        graph.addVertex('A'); //0
        graph.addVertex('B'); //1
        graph.addVertex('C'); //2
        graph.addVertex('D'); //3
        graph.addVertex('E'); //4
        graph.addVertex('F'); //5
        graph.addVertex('G'); //6
        graph.addVertex('H');
        graph.addVertex('I');


        graph.addEdge(0, 1);
        graph.addEdge(0, 6);
        graph.addEdge(1, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 8);
        graph.addEdge(4, 5);
        graph.addEdge(3, 4);
        graph.addEdge(6, 8);
        graph.addEdge(6, 7);

        //graph.bfs();
        graph.dfs();
	}

}

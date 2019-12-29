package datastructures._08.graph;

import datastructures._04.stack.StackImpl;
import datastructures._05.queue.QueueImpl;

public class Graph {

	private int MAX_VERTEX = 20;
	private Vertex vertexList[];
	private int nVertexs;
	private int adjacencyMat[][];
	private QueueImpl<Integer> queueImp;
	private StackImpl<Integer> stackImp;

	public Graph() {
		vertexList = new Vertex[MAX_VERTEX];
		nVertexs = 0;
		adjacencyMat = new int[MAX_VERTEX][MAX_VERTEX];
		queueImp = new QueueImpl<>(MAX_VERTEX);
		stackImp = new StackImpl<>(MAX_VERTEX);
	}

	public void addVertex(char label) {
		vertexList[nVertexs++] = new Vertex(label);
	}

	public void addEdge(int start, int end) {
		adjacencyMat[start][end] = 1;
		adjacencyMat[end][start] = 1;
	}

	public void displayVertex(int v) {
		System.out.println(vertexList[v].label);
	}

	public int getUnVisitedAdjacency(int v) {

		for (int i = 0; i < nVertexs; i++) {
			if (adjacencyMat[v][i] == 1 && vertexList[i].wasVisited == false) {
				return i;
			}
		}
		return -1;
	}

	public void bfs() {

		vertexList[0].wasVisited = true;
		displayVertex(0);
		queueImp.enqueue(0);
		int v2;

		while (!queueImp.isEmpty()) {

			int v1 = queueImp.dequeue();

			while ((v2 = getUnVisitedAdjacency(v1)) != -1) {

				vertexList[v2].wasVisited = true;
				displayVertex(v2);
				queueImp.enqueue(v2);

			}

		}

	}

	public void dfs() {

		vertexList[0].wasVisited = true;
		displayVertex(0);
		stackImp.push(0);
		int v2;

		while (!stackImp.isEmpty()) {

			int v1 = stackImp.peek();

			while ((v2 = getUnVisitedAdjacency(v1)) != -1) {

				vertexList[v2].wasVisited = true;
				displayVertex(v2);
				stackImp.push(v2);
				v1 = v2;

			}
			
			if(v2 == -1) {
				stackImp.pop();
			}

		}

	}
}

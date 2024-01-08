package udemy.graph;

import java.util.ArrayList;


public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<>();
    int[][] adjacencyMatrix;

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addUndirectedEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }


    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for (GraphNode graphNode : nodeList) {
            s.append(graphNode.name).append(" ");
        }
        s.append("\n");
        for(int i = 0; i < nodeList.size(); i++){
            s.append(nodeList.get(i).name).append(": ");
            for(int j : adjacencyMatrix[i]){
                s.append(j).append(" ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}

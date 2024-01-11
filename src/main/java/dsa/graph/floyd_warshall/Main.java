package dsa.graph.floyd_warshall;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new WeightedNode("A", 0));
        nodeList.add(new WeightedNode("B", 1));
        nodeList.add(new WeightedNode("C", 2));
        nodeList.add(new WeightedNode("D", 3));


        WeightedGraph graph = new WeightedGraph(nodeList);
        graph.addWeightedEdge(0,3,1);
        graph.addWeightedEdge(0,1,8);
        graph.addWeightedEdge(1,2,1);
        graph.addWeightedEdge(2,0,4);
        graph.addWeightedEdge(3,1,2);
        graph.addWeightedEdge(3,2,9);

        System.out.println("Printing floyd Warshall");
        System.out.println("                           A B C D");
        graph.floydWarshall();
    }
}

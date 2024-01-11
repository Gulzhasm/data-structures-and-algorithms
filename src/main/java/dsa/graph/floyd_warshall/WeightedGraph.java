package dsa.graph.floyd_warshall;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class WeightedGraph {

    ArrayList<WeightedNode> nodeList = new ArrayList<>();

    public WeightedGraph(ArrayList<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }


    void dijkstra(WeightedNode node) {
        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        node.distance = 0;
        queue.addAll(nodeList);

        while (!queue.isEmpty()) {
            WeightedNode currentNode = queue.remove();

            for (WeightedNode neighbor : currentNode.neighbors) {
                if (queue.contains(neighbor)) {
                    if (neighbor.distance > currentNode.distance + currentNode.weightedMAp.get(neighbor)) {
                        neighbor.distance = (currentNode.distance) + currentNode.weightedMAp.get(neighbor);
                        neighbor.parent = currentNode;
                        queue.remove(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }
        for (WeightedNode nodeToCheck : nodeList) {
            System.out.print(" Node " + nodeToCheck + ", distance: " + nodeToCheck.distance + ", Path: ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }


    public static void pathPrint(WeightedNode node) {
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }

    public void addWeightedEdge(int i, int j, int d) {
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.neighbors.add(second);
        first.weightedMAp.put(second, d);
    }


    void bellmanFord(WeightedNode sourceNode) {
        sourceNode.distance = 0;

        for (int i = 0; i < nodeList.size(); i++) {
            for (WeightedNode currentNode : nodeList) {
                for (WeightedNode neighbor : currentNode.neighbors) {
                    if (neighbor.distance > currentNode.distance + currentNode.weightedMAp.get(neighbor)) {
                        neighbor.distance = (currentNode.distance) + currentNode.weightedMAp.get(neighbor);
                        neighbor.parent = currentNode;
                    }
                }
            }
        }

        System.out.println("Checking for negative cycle....");
        for (WeightedNode currentNode : nodeList) {
            for (WeightedNode neighbor : currentNode.neighbors) {
                if (neighbor.distance > currentNode.distance + currentNode.weightedMAp.get(neighbor)) {
                    System.out.println("Negative cycle found");
                    System.out.println("Vertex name " + neighbor.name);
                    System.out.println("Cost: " + neighbor.distance);
                    int newCost = currentNode.distance + currentNode.weightedMAp.get(neighbor);
                    System.out.println("new cost: " + newCost);
                }
            }
        }

        System.out.println("Negative not found");
        for (WeightedNode nodeToCheck : nodeList) {
            System.out.print(" Node " + nodeToCheck + ", distance: " + nodeToCheck.distance + ", Path: ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }

    void floydWarshall() {
        int size = nodeList.size();
        int[][] V = new int[size][size];

        for (int i = 0; i < size; i++) {
            WeightedNode first = nodeList.get(i);
            for (int j = 0; j < size; j++) {
                WeightedNode second = nodeList.get(j);
                if (i == j) {
                    V[i][j] = 0;
                } else if (first.weightedMAp.containsKey(second)) {
                    V[i][j] = first.weightedMAp.get(second);
                } else {
                    V[i][j] = Integer.MAX_VALUE / 10;
                }
            }
        }

        for (int k = 0; k < nodeList.size(); k++) {
            for (int i = 0; i < nodeList.size(); i++) {
                for (int j = 0; j < nodeList.size(); j++) {
                    if (V[i][j] > V[i][k] + V[k][j]) {
                        V[i][j] = V[i][k] + V[k][j];
                    }
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(" distance list for node " + nodeList.get(i) + ": ");
            for (int j = 0; j < size; j++) {
                System.out.print(V[i][j] + " ");
            }
            System.out.println();
        }

    }


}

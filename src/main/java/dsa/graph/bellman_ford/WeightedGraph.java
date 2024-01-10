package dsa.graph.bellman_ford;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class WeightedGraph {
    
    ArrayList<WeightedNode> nodeList = new ArrayList<>();
    public WeightedGraph(ArrayList<WeightedNode> nodeList){
        this.nodeList = nodeList;
    }


    void dijkstra(WeightedNode node){
        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        node.distance = 0;
        queue.addAll(nodeList);

        while(!queue.isEmpty()){
            WeightedNode currentNode = queue.remove();

            for(WeightedNode neighbor : currentNode.neighbors){
                if(queue.contains(neighbor)){
                    if(neighbor.distance > currentNode.distance + currentNode.weightedMAp.get(neighbor)){
                        neighbor.distance = (currentNode.distance) + currentNode.weightedMAp.get(neighbor);
                        neighbor.parent = currentNode;
                        queue.remove(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }
        for(WeightedNode nodeToCheck : nodeList){
            System.out.print(" Node " + nodeToCheck + ", distance: " + nodeToCheck.distance + ", Path: ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }


    public static void pathPrint(WeightedNode node){
        if(node.parent != null){
            pathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }

    public void addWeightedEdge(int i, int j, int d){
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.neighbors.add(second);
        first.weightedMAp.put(second, d);
    }


    void bellmanFord(WeightedNode sourceNode){
        sourceNode.distance = 0;

        for(int i =0; i < nodeList.size(); i++){
            for(WeightedNode currentNode: nodeList){
                for(WeightedNode neighbor: currentNode.neighbors){
                    if(neighbor.distance > currentNode.distance + currentNode.weightedMAp.get(neighbor)){
                        neighbor.distance = (currentNode.distance) + currentNode.weightedMAp.get(neighbor);
                        neighbor.parent = currentNode;
                    }
                }
            }
        }

        System.out.println("Checking for negative cycle....");
        for(WeightedNode currentNode : nodeList){
            for(WeightedNode neighbor: currentNode.neighbors){
                if(neighbor.distance > currentNode.distance + currentNode.weightedMAp.get(neighbor)){
                    System.out.println("Negative cycle found");
                    System.out.println("Vertex name " + neighbor.name);
                    System.out.println("Cost: "+ neighbor.distance);
                    int newCost = currentNode.distance + currentNode.weightedMAp.get(neighbor);
                    System.out.println("new cost: " + newCost);
                }
            }
        }

        System.out.println("Negative not found");
        for(WeightedNode nodeToCheck : nodeList){
            System.out.print(" Node " + nodeToCheck + ", distance: " + nodeToCheck.distance + ", Path: ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }
}

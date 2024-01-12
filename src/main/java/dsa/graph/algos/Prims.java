package dsa.graph.algos;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims {
    ArrayList<WeightedNode> nodeList = new ArrayList<>();

    public Prims(ArrayList<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addWeightedUndirectedEdge(int firstIndex, int secondIndex, int weight) {
        WeightedNode first = nodeList.get(firstIndex);
        WeightedNode second = nodeList.get(secondIndex);
        first.neighbors.add(second);
        second.neighbors.add(first);
        first.weightedMAp.put(second, weight);
        second.weightedMAp.put(first, weight);
    }

    //prims
    void prims(WeightedNode source){
        for(int i=0; i <nodeList.size(); i++){
            nodeList.get(i).distance = Integer.MAX_VALUE;
        }
        source.distance = 0;

        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        queue.addAll(nodeList);
        while(!queue.isEmpty()){
            WeightedNode currentNode = queue.remove();
            for(WeightedNode neighbor : currentNode.neighbors){
                if(queue.contains(neighbor)){
                    if(neighbor.distance > currentNode.weightedMAp.get(neighbor)){
                        neighbor.distance = currentNode.weightedMAp.get(neighbor);
                        neighbor.parent = currentNode;
                        queue.remove(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }
        int cost = 0;

        for(WeightedNode node : nodeList){
            System.out.println("Node: " + node + ", key: " + node.distance + " Parent: " + node.parent);
            cost = cost + node.distance;
        }
        System.out.println("\n Total cost of MST: " + cost);
    }
}

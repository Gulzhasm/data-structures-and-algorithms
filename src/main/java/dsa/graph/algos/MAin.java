package dsa.graph.algos;

import java.util.ArrayList;

public class MAin {
    public static void main(String[] args) {
        ArrayList<WeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new WeightedNode("A"));
        nodeList.add(new WeightedNode("B"));
        nodeList.add(new WeightedNode("C"));
        nodeList.add(new WeightedNode("D"));

        DisjointSet set = new DisjointSet();
        set.makeSet(nodeList);
        WeightedNode firstNode = nodeList.get(0);
        WeightedNode secondNode = nodeList.get(1);

        DisjointSet output = set.findSet(secondNode);
        output.print();
        set.union(firstNode,secondNode);
        DisjointSet output1 = set.findSet(secondNode);
        output1.print();
    }
}

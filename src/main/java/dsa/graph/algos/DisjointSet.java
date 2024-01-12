package dsa.graph.algos;

import java.util.ArrayList;

public class DisjointSet {
    private ArrayList<WeightedNode> nodeList = new ArrayList<>();

    public void makeSet(ArrayList<WeightedNode> nodeList){
        for(WeightedNode weightedNode: nodeList){
            DisjointSet set = new DisjointSet();
            set.nodeList.add(weightedNode);
            weightedNode.set = set;
        }
    }

    public DisjointSet findSet(WeightedNode node){
        return node.set;
    }


    public DisjointSet union(WeightedNode node1, WeightedNode node2){
        if(node1.set.equals(node2.set)){
            return null;
        }else {
            DisjointSet set1 = node1.set;
            DisjointSet set2 = node2.set;

            if(set1.nodeList.size() >  set2.nodeList.size()){
                ArrayList<WeightedNode> nodeSet2 = set2.nodeList;
                for(WeightedNode node : nodeSet2){
                    node.set = set1;
                    set1.nodeList.add(node);
                }
                return set1;
            } else{
                ArrayList<WeightedNode> nodeSet1 = set1.nodeList;
                for(WeightedNode node : nodeSet1){
                    node.set = set2;
                    set2.nodeList.add(node);
                }
                return set2;
            }
        }
    }


    public void print(){
        System.out.println("Printing the sets");
        for(WeightedNode node: nodeList){
            System.out.print(node.name + " ");
        }
        System.out.println();
    }
}

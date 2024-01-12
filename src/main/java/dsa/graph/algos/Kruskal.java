package dsa.graph.algos;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Kruskal {
    ArrayList<WeightedNode> nodeList = new ArrayList<>();
    ArrayList<UndirectedEdge> edgeList = new ArrayList<>();

    public Kruskal(ArrayList<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addWeightedUndirectedEdge(int firstIndex, int secondIndex, int weight) {
        UndirectedEdge edge = new UndirectedEdge(nodeList.get(firstIndex), nodeList.get(secondIndex), weight);
        WeightedNode first = edge.first;
        WeightedNode second = edge.second;
        first.neighbors.add(second);
        second.neighbors.add(first);
        first.weightedMAp.put(second, weight);
        second.weightedMAp.put(first, weight);
        edgeList.add(edge);
    }

    void kruskal() {
        DisjointSet ds = new DisjointSet();
        ds.makeSet(nodeList);
        Comparator<UndirectedEdge> comparator = new Comparator<UndirectedEdge>() {
            @Override
            public int compare(UndirectedEdge o1, UndirectedEdge o2) {
                return o1.weight-o2.weight;
            }
        };
        Collections.sort(edgeList, comparator);

        int cost = 0;
        for(UndirectedEdge edge : edgeList){
            WeightedNode first = edge.first;
            WeightedNode second = edge.second;

            if(!ds.findSet(first).equals(ds.findSet(second))){
                ds.union(first, second);
                cost+=edge.weight;
                System.out.println("Taken edge " + edge);
            }
        }
    }
}

package dsa.graph.dijkstra;

import java.util.ArrayList;
import java.util.HashMap;

public class WeightedNode implements Comparable<WeightedNode> {

    public String name;
    public ArrayList<WeightedNode> neighbors = new ArrayList<>();
    public HashMap<WeightedNode, Integer> weightedMAp = new HashMap<>();
    public boolean isVisited = false;
    public WeightedNode parent;
    public int distance;
    public int index;

    public WeightedNode(String name, int index) {
        this.name = name;
        distance = Integer.MAX_VALUE;
        this.index = index;
    }

    @Override
    public String toString() {
        return "WeightedNode{" +
                "name='" + name + '\'' +
                ", neighbors=" + neighbors +
                ", weightedMAp=" + weightedMAp +
                ", isVisited=" + isVisited +
                ", parent=" + parent +
                ", distance=" + distance +
                ", index=" + index +
                '}';
    }

    @Override
    public int compareTo(WeightedNode o) {
        return this.distance - o.distance;
    }
}

package leetcode.topicWise.graph.dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdjacencyListDFS {
    public static void main(String[] args) {
       int n = 3, source = 0, destination = 2;
       int[][] edges = {{0,1},{1,2},{2,0}};
       validPath(n, edges, source,destination);
    }
    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        //1. create a map as graph with Integer and List and add neighbors from edge[][]
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph.computeIfAbsent(u, value -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, value -> new ArrayList<>()).add(u);
        }
        System.out.println(graph);
        boolean[] visited = new boolean[n];
        return dfs(graph, source, destination, visited, n);
    }

    private static  boolean dfs(Map<Integer, List<Integer>> graph, int source, int destination, boolean[] visited, int n) {
        if (source == destination) return true;
        visited[source] = true;

        for (int neighbor : graph.get(source)) {
            if (!visited[neighbor]) {
                if (dfs(graph, neighbor, destination, visited, n))
                    return true;
            }
        }
        return false;
    }
}

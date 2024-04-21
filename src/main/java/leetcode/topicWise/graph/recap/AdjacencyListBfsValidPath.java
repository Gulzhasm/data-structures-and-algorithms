package leetcode.topicWise.graph.recap;

import java.util.*;

public class AdjacencyListBfsValidPath {
    //Input: n = 3, edges = [[0,1],[1,2],[2,0]], source = 0, destination = 2
    //Output: true
    //Explanation: There are two paths from vertex 0 to vertex 2:
    //- 0 → 1 → 2
    //- 0 → 2

    //1. create a map,  Map<Integer, List<Integer>> map = new HashMap<>();
    //2. get each row and loop by edge and vertex,
    // add to the map, use compute if absent

    // created vis[] and mark source visited true
    // use BFS -> bfs with Queue, when you use Queue, first offer source and remove check if curr == destination, and then add neighbors if not visited

    public static void main(String[] args) {
        int n = 3, source = 0, destination = 2;
        int[][] edges = {{0,1},{1,2},{2,0}};
        validPath(n, edges, source, destination);
    }

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph.computeIfAbsent(u, val -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, val -> new ArrayList<>()).add(u);
        }
        System.out.println(graph);
        boolean[] vis = new boolean[n];
        vis[source] = true;

        //use BFS with Queue
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (curr == destination) return true;

            for (int neighbor : graph.get(curr)) {
                if (!vis[neighbor]) {
                    q.offer(neighbor);
                    vis[neighbor] = true;
                }
            }
        }
        return false;
    }
}

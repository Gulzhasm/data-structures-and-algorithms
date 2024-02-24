package leetcode.topicWise.graph.dfs;

import java.util.Arrays;

public class AdjacencyMatrixDFS {
    public boolean validPath(int n, int[][] edges, int source, int destination) {//O(V^2)
        boolean[][] graph = new boolean[n][n];
        for(boolean[] rows : graph){
            Arrays.fill(rows, false);
        }

        for(int[] edge: edges){
            int u = edge[0], v = edge[1];
            graph[u][v] = true;
            graph[v][u] = true; // bidirectional graph
        }

        boolean[] vis = new boolean[n];
        return dfs(graph, source, destination, vis, n);
    }

    private boolean dfs(boolean[][] graph, int source, int destination, boolean[] vis, int n) {
        if(source == destination) return true;
        vis[source] = true;
        for(int i = 0; i < n; i++) {
            if (graph[source][i] && !vis[i]) {
                if (dfs(graph, i, destination, vis, n)) {
                return true;
                }
            }
        }
        return false;
    }
}

package leetcode.topicWise.graph.bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class AdjacencyMatrixBFS {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        //1. create a bool matrix and fill as false initially
        boolean[][] graph = new boolean[n][n];
        for(boolean[] row : graph){
            Arrays.fill(row, false);
        }
        //2. now we need to connect/make it true connected edges from edges[][] matrix

        for(int[] edge : edges){
            int u = edge[0], v = edge[1];
            graph[u][v] = true;
            graph[v][u] = true; // bidirectional
        }

        //3. create a boolean array for visited edges
        boolean[] visited = new boolean[n];
        for(int i = 0; i <n; i++) visited[i] = false;

        //bfs
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
         while(!q.isEmpty()){
             int current = q.remove();
             if(current == destination) return true;

             // otherwise, we need add next edge to the queue and mark it as visited
             for(int i = 0; i<n; i++){
                 if(graph[current][i] && !visited[i]){
                     q.add(i);
                     visited[i] = true;
                 }
             }
         }
         return false;
    }
}

package leetcode.topicWise.graph.bfs;

import java.util.*;

public class AdjacencyListBFS {
    //edges = [[1,2],[2,3],[4,2]]
    public static void main(String[] args) {
        int[][] edges = {{1,2}, {2,3},{4,2}};
        System.out.println(findCenter(edges));
    }
    public static  int findCenter(int[][] edges) {
        int n = edges.length + 1;
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph.computeIfAbsent(u, val -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, val -> new ArrayList<>()).add(u);
        }

        Queue<Integer> q = new LinkedList<>();
        q.offer(edges[0][0]);

        while (!q.isEmpty()) {
            int currNode = q.remove();
            int countAdj = 0;

            for (int neighbor : graph.get(currNode)) {
                q.offer(neighbor);
                countAdj++;
            }
            if (countAdj == n - 1) {
                return currNode;
            }
        }
        return -1;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {// TC - O(V+E), SC-O(N)
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            map.computeIfAbsent(u, value -> new ArrayList<>()).add(v);
            map.computeIfAbsent(v, value -> new ArrayList<>()).add(u);
        }

        boolean[] vis = new boolean[n];
        vis[source] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);

        while (!queue.isEmpty()) {
            int curr = queue.remove();
            if (curr == destination) return true;

            for (int neighbor : map.get(curr)) {
                if (!vis[neighbor]) {
                    queue.offer(neighbor);
                    vis[neighbor] = true;
                }
            }
        }

        return false;
    }
}

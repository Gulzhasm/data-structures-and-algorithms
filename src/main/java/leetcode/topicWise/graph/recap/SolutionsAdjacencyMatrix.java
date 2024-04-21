package leetcode.topicWise.graph.recap;

public class SolutionsAdjacencyMatrix {

   //Input: n = 3, edges = [[0,1],[1,2],[2,0]], source = 0, destination = 2
    //Output: true
    //Explanation: There are two paths from vertex 0 to vertex 2:
    //- 0 → 1 → 2
    //- 0 → 2

    //1. create a graph matrix 2d Boolean
    //2. get each row and loop by edge and vertex
    //3. and mark true

    public boolean validPath(int n, int[][] edges, int source, int destination) {
       boolean[][] matrix = new boolean[n][n];

       for(int[] edge : edges){
           int u = edge[0], v = edge[1];
           matrix[u][v] = true;
           matrix[v][u] = true;
       }
       boolean[] visited = new boolean[n];
       return dfs(matrix, source, destination, visited,n);
    }

    private boolean dfs(boolean[][] matrix, int source, int destination, boolean[] visited, int n){
        if(source == destination) return true;
        visited[source] = true;
        for(int i = 0; i < n; i++){
            if(matrix[source][i] && !visited[i]){
                if(dfs(matrix, i, destination, visited, n)) return true;
            }
        }
        return false;
    }
}

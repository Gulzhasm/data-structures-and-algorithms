package dsa.graph.neighbors;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<>();

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addUndirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);

        first.neighbors.add(second);
        second.neighbors.add(first);
    }

    void bfsVisit(GraphNode node) { // O(V+E) V-vertices, E - edges, Space Complexity is also O(V+E) as we are using Queue for an extra space
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove();
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            for (GraphNode neighbor : currentNode.neighbors) {
                if (!neighbor.isVisited) {
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    public void bfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited) bfsVisit(node);
        }
    }


    //internal DFS
    void dfsVisit(GraphNode node) {
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()){
            GraphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            for(GraphNode neighbor : currentNode.neighbors){
                if(!neighbor.isVisited){
                    stack.push(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    public void dfs(){
        for(GraphNode node : nodeList){
            if(!node.isVisited){
                dfsVisit(node);
            }
        }
    }

//topological sort
   public void addDirectedEdge(int i, int j){
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbors.add(second);
   }

   void topologicalVisit(GraphNode node, Stack<GraphNode> stack){
        for(GraphNode neighbor : node.neighbors){
            if(!neighbor.isVisited){
                topologicalVisit(neighbor, stack);
            }
        }
        node.isVisited = true;
        stack.push(node);
   }


   public void topologicalSort(){
        Stack<GraphNode> stack = new Stack<>();
        for(GraphNode node: nodeList){
            if(!node.isVisited){
                topologicalVisit(node, stack);
            }
        }
         while(!stack.isEmpty()){
             System.out.print(stack.pop().name + " ");
         }
   }

    public static void pathPrint(GraphNode node){
        if(node.parent != null){
            pathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }

    public void bfsForSSSPP(GraphNode node){
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()){
          GraphNode currentNode = queue.remove();
            currentNode.isVisited = true;
            System.out.print( "Printing path for node " + currentNode.name + ": ");
            pathPrint(currentNode);
            System.out.println();

            for(GraphNode neighbor : currentNode.neighbors){
                if(!neighbor.isVisited){
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                    neighbor.parent = currentNode;
                }
            }
        }
    }



    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name).append(": ");
            for (int j = 0; j < nodeList.get(i).neighbors.size(); j++) {
                if (j == nodeList.get(i).neighbors.size() - 1) {
                    s.append(nodeList.get(i).neighbors.get(j).name);
                } else {
                    s.append(nodeList.get(i).neighbors.get(j).name).append(" -> ");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }
}

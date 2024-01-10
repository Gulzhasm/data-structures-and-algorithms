Single Source Shortest Path Problem

1. BFS for SSSPP
BFS only works for unweighted graph

Enqueue any starting vertex 
while queue is not empty p = dequeue()
if p is unvisited, mark it visited
enqueue all adjacent unvisited vertices of p 
update parent of adjacent vertices to curVertex

````
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

````

2. Dijkstra's Algorithm


-Bellman Ford
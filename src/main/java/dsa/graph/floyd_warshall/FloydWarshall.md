
A->B->C->D
1. First Iteration: it goes over each node, and look for the infinity cost,
and then it updates via adding the adjacent neighbors costs

Why do we need Floyd Warshall algorithm?
- Two vertex is not reachable
- Teo vertices are directly connected 
this is the best solution
it can be improved via other vertex
- Two vertices are connected via other vertex

Why negative cycle will not work in FW algo?
-8+1+4=-1; 
same vertex is looped once, and this algo cannot catch the negative cycle
Kruskal 

It is a greedy algorithm
It finds a minimum spanning tree for weighted undirected graph in two steps
- Add increasing cost edges at each step
- avoid any cycle at each step

Kruskal(G)
for each vertex
   makeSet(v)
sort each edge in non decreasing order by weight
for each edge(u, v)
    if findSet(u) is not equal findSet(v)
     union(u, v)
cost = cost +edge(u,v)

Time Complexity: O(V+EdgeE+EV)-O(Elog(E))
Space complexity: O(V+E)


What is the difference between Kruskal and Prims?
Kruskal: 
- Concentrates on Edges
- Finalize edge in each iteration

Prims:
- Concentrates on Vertices
- Finalize vertex in each iteration

Kruskal Applications:
- TV Network
- Tour Operations
- LAN Networks
- A network of pipes for drinking water or natural gas
- An electric grid
- Single-link Cluster

Prims Applications:
- Network for roads and Rail tracks connecting all the cities
- Irrigation channels and placing microwave towers
- Designing a fiber - optic grid or ICs
- Travelling Salesman Problem
- Cluster analysis
- PathFinding algorithms used in AI

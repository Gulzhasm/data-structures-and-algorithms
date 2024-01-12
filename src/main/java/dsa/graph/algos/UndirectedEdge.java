package dsa.graph.algos;



public class UndirectedEdge {
    public WeightedNode first;
    public WeightedNode second;
    public int weight;

    @Override
    public String toString() {
        return "UndirectedEdge{" +
                "first=" + first +
                ", second=" + second +
                ", weight=" + weight +
                '}';
    }

    public UndirectedEdge(WeightedNode first, WeightedNode second, int weight) {
        this.first = first;
        this.second = second;
        this.weight = weight;


    }
}

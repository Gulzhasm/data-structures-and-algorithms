package coursera.priorit_queue;

public class UnOrderedMaxPQ<T extends Comparable<T>> {
    private T[] pq;
    private int N;

    public UnOrderedMaxPQ(int capacity) {
        pq = (T[]) new Comparable[capacity];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void insert(T item) {
        pq[N++] = item;
    }

    //find the MAX and replace with the last element, return the last element while decreasing the size
    public T deleteMax() {
        int max = 0;
        for (int i = 1; i < N; i++) {
            if (less(max, i)) max = i;
        }
        // swap
        swap(pq, max, N - 1);
        return pq[--N];
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void swap(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

package coursera.union_find;

import java.util.Scanner;

public class MainQF {
    public static void main(String[] args) {
        int n = StdIn.readInt();
        QuickFindUF uf = new QuickFindUF(n);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.find(p) == uf.find(q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
            uf.print();
        }
        StdOut.println(uf.count() + " components");
    }

    // 0 1 2 3

}

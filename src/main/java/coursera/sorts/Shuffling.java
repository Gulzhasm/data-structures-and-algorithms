package coursera.sorts;

import java.util.Random;

public class Shuffling {

    public static void shuffle(Object[] a){
        Random random = new Random();
        int N = a.length;
        for(int i = 0; i < N; i++){
            int r = random.nextInt(i+1);
            swap(a, i, r);
        }
    }

    private static void swap(Object[] a, int i, int r){
        Object temp = a[i];
        a[i] = a[r];
        a[r] = temp;
    }
}

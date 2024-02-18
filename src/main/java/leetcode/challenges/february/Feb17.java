package leetcode.challenges.february;

import java.util.PriorityQueue;

public class Feb17 {
    //heights=[1, 4, 9, 10, 11], bricks = 5, ladder = 1 output  = 4
    public static void main(String[] args) {
        int[] h = {4,12,2,7,3,18,20,3,19};
        System.out.println(furthestBuilding(h, 10,2));
    }
    public static int furthestBuilding(int[] h, int b, int l) {
        PriorityQueue<Integer> p = new PriorityQueue<>((a, c) -> c - a);

        int i = 0, diff = 0;
        for (i = 0; i < h.length - 1; i++) {
            diff = h[i + 1] - h[i];

            if (diff <= 0) {
                continue;
            }

            b -= diff;
            p.offer(diff);

            if (b < 0) {
                b += p.poll();
                l--;
            }

            if (l < 0) {
                break;
            }
        }

        return i;
    }
}

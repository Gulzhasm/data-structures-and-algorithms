package leetcode.challenges.february;

public class Feb17 {
    //heights=[1, 4, 9, 10, 11], bricks = 5, ladder = 1 output  = 4
    public static void main(String[] args) {
        int[] h = {4,12,2,7,3,18,20,3,19};
        System.out.println(furthestBuilding(h, 10,2));
    }
    public static int furthestBuilding(int[] h, int bricks, int ladders) {
        int i = 0, ans =0;
        for (int j = 1; j < h.length; j++) {
          if (h[i] < h[j]) {
                int gap = h[j] - h[i];
                if (gap <= bricks) {
                    bricks = bricks - gap;
                } else {
                    ladders--;
                }
            }
            i++;
            if((i+1 != h.length -1 && h[i] < h[i+1]) && bricks <=0 && ladders <=0){
                break;
            }
        }
        return i;
    }
}

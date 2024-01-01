package algorithms.greedy;

import java.util.Arrays;

public class Greedy {
    //Input: g = [1,2,3], s = [1,1]
    //Output: 1
    //Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3.
    //And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
    //You need to output 1.

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        for (int j = 0; i < g.length && j < s.length; j++) {
            if (g[i] <= s[j]){
                i++;
            }
        }
        return i;
    }
}

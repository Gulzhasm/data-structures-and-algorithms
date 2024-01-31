package leetcode.challenges.january;


import java.util.Stack;

public class Jan31 {

    public int[] dailyTemperatures(int[] temperatures) {
        int N = temperatures.length;
        int[] ans = new int[N];
        Stack<Integer> stack = new Stack<>();

        stack.add(temperatures[0]);
        ans[0] = 1;
        int j = 0;
        for (int i = 1; i < N; i++) {
            int curr = stack.pop();
            if (curr < temperatures[i]){
                ans[j] = 1;
            } else {
                int count =0;
                int k = temperatures[i];
                while(curr > k ){
                    k++;
                    count++;
                }
                ans[j] = count;
            }
            j++;
            stack.add(temperatures[i]);
        }


        return ans;

    }
}

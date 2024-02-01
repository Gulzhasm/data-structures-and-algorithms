package leetcode.challenges.january;


import java.util.*;
import java.util.stream.Collectors;

public class Jan31 {

    public int[] KWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];
        Map<Integer, Integer> rows = new HashMap<>();

        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            rows.put(i, count);
        }
        List<Integer> list = rows.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());


        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    //Input: temperatures = [73,74,75,71,69,72,76,73]
    //Output: [1,1,4,2,1,1,0,0]
    public static int[] dailyTemperatures(int[] temperatures) {
        int N = temperatures.length;
        int[] ans = new int[N];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
                ans[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] temperatures = {1, 3, 5, 4, 7};
        System.out.println(findLengthOfLCIS(temperatures));
        //[3,1,1,2,1,1,0,1,1,0]
    }

    //Input: nums = [1,3,5,4,7]
    //Output: 3
    public static int findLengthOfLCIS(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                count++;
                max = Math.max(count, max);
            } else {
                count = 0;
            }
        }

        return max + 1;
    }

    public static int[] dailyTemperaturesNaive(int[] temperatures) { //works - but the last test case - Time Limit Exceeded -
        int N = temperatures.length;
        int[] ans = new int[N];
        int j = 0;

        for (int i = 1; i < N; i++) {
            int prev = temperatures[j];
            int curr = temperatures[i];
            if (prev < curr) {
                ans[j] = 1;
            } else if (prev > curr && i == N - 1) {
                ans[j] = 0;
            } else {
                int count = 0;
                int k = i;
                while (k < N) {
                    if (prev >= temperatures[k]) {
                        if (k == N - 1) {
                            count = 0;
                            break;
                        }
                        count++;
                        k++;

                    } else {
                        count++;
                        break;
                    }
                }
                ans[j] = count;
            }
            j++;
        }
        return ans;
    }
}

package leetcode.early.hard;

public class Hard {
    //Input: heights = [2,4]
//Output: 4
    public static void main(String[] args) {
        int[] heights = {2, 4};
        System.out.println(waterContainer(heights));

    }

    public static int waterContainer(int[] height) {
        int start = 0;
        int end = height.length - 1;

        int width = 0;
        int maxArea = 0;

        while (start < end) {
            int length = end - start;
            if (height[start] <= height[end]) {
                width = height[start];
                start++;
            } else if (height[start] >= height[end]) {
                width = height[end];
                end--;
            }
            maxArea = Math.max(maxArea, length * width);
        }
        return maxArea;
    }
}

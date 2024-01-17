package leetcode.hard;

import java.util.Stack;

public class LargestRectangle {
    public static void main(String[] args) {

    }

    public int largestRectangleArea(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        stack.push(0);

        for (int i = 1; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] < height[stack.peek()]) {
                maxArea = getMax(height, stack, maxArea, i);
            }
            stack.push(i);
        }
        int i = height.length;

        while (!stack.isEmpty()) {
            maxArea = getMax(height, stack, maxArea, i);
        }
        return maxArea;
    }

    private int getMax(int[] heights, Stack<Integer> stack, int max, int i) {
        int area;
        int popped = stack.pop();

        if (!stack.isEmpty()) {
            area = heights[popped] * i;
        } else {
            area = heights[popped]*(i-1-stack.peek());
        }

        return Math.max(max, area);
    }
}

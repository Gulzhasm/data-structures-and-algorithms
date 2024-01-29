package leetcode.challenges.january;

import java.util.Stack;

public class Jan29 {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public Jan29() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int peek() {
        if (second.isEmpty()) {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
        }
        return second.peek();
    }

    public int pop() {
        peek();
        return second.pop();
    }

    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }
}

class Solution {
    public static void main(String[] args) {
        int[] f = {1,0,0,0,1};
        System.out.println(canPlaceFlowers(f, 1));
    }
    public static boolean canPlaceFlowers(int[] f, int n) {
        int count = 0;
        int i = 0;
        while (i < f.length) {
            if (f[i] == 0 && (i == 0 || f[i-1] == 0) &&
                    (i == f.length-1 || f[i+1] == 0)) {
                f[i] = 1;
                count++;
            }
            if (count >= n) {
                return true;
            }
            i++;
        }
        return false;
    }
}

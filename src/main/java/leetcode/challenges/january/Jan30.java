package leetcode.challenges.january;

import org.checkerframework.checker.units.qual.C;

import java.util.Stack;

public class Jan30 {

    //Input: tokens = ["4","13","5","/","+"]
//Output: 6
//Explanation: (4 + (13 / 5)) = 6
    public static void main(String[] args) {
        String[] tokens = {"4", "13", "5", "/", "+"};
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens) {
        int a, b;
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+" -> {
                    stack.add(stack.pop() + stack.pop());
                }
                case "-" -> {
                    a = stack.pop();
                    b = stack.pop();
                    stack.add(b - a);
                }
                case "*" -> {
                    stack.add(stack.pop() * stack.pop());
                }
                case "/" -> {
                    a = stack.pop();
                    b = stack.pop();
                    stack.add(b/a);
                }
                default -> stack.add(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    public static int evalRPNBF(String[] tokens) {
        int ans = 0;
        Stack<Integer> nums = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (String token : tokens) {
            if (Character.isDigit(token.charAt(0))) {
                nums.add(Integer.parseInt(token));
            } else {
                ops.add(token.charAt(0));
            }
        }

        int keep = 0;
        while (!nums.isEmpty() && !ops.isEmpty()) {
            char currentOp = ops.pop();
            if (currentOp == '*') {
                keep = nums.pop();
            } else if (currentOp == '+') {
                ans = nums.pop() + nums.pop();
            } else if (currentOp == '-') {
                ans = nums.pop() - nums.pop();
            } else if (currentOp == '/') {
                int div = nums.pop();
                ans = nums.pop() / div;
            }
        }
        return ans * keep;
    }
}

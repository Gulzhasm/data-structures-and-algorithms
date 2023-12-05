package practices.stack;

import java.util.Stack;

public class InBuiltExamples {
    public static void main(String[] args) {
        //stack will be stored in the stack memory
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(7);
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}

package coursera.stacks;

public class Main {
    public static void main(String[] args) {
        LLStackOfStrings stack = new LLStackOfStrings();
        stack.push("to");
        stack.push("be");
        stack.print();
        System.out.println(stack.size());
    }
}

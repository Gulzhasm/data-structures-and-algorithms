package practices.stack;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomStack customStack = new DynamicStack(5);
        customStack.push(3);
        customStack.push(2);
        customStack.push(4);
        customStack.push(1);
        customStack.push(6);
        customStack.push(6);
        System.out.println(customStack);

        System.out.println(customStack.pop());
        customStack.pop();
        customStack.pop();
        customStack.pop();
        customStack.pop();
        customStack.pop();

    }
}

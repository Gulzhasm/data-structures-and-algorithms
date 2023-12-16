package practices.customs;


public class Main {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(7);
        stack.display();
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}

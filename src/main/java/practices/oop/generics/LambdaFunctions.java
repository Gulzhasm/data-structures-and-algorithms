package practices.oop.generics;

public class LambdaFunctions {
    public static void main(String[] args) {
        Operation sum = ((a, b) -> a + b);
        Operation multiply = ((a, b) -> a * b);

        LambdaFunctions myCalc = new LambdaFunctions();
        System.out.println(myCalc.operate(5, 6, sum));
        System.out.println(myCalc.operate(5, 6, multiply));
    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}

interface Operation {
    int operation(int a, int b);
}
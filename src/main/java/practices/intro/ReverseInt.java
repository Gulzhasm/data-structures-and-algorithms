package practices.intro;

public class ReverseInt {
    public static void main(String[] args) {
        //n=12345 output=54321
        int n = 12345;
        int output = 0;

        while (n > 0) {
            int rem = n % 10;
            output = (output * 10) + rem;
            n = n / 10;
        }
        System.out.println(output);
    }
}

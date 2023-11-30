package practices.intro;

public class Occurs {
    public static void main(String[] args) {
        // n = 12343 how many times occurs 3
        int n = 1234333333;
        int count = 0;

        while(n > 0){
            int rem = n % 10;
            if(rem == 3){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}

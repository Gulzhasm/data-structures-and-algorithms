package practices.intro;

public class ArmstrongNumber {

    static boolean isArmstrong(int num) {
        // For 153, total sum is equal to itself 1^3+ 5^3+ 3^3 = 1+125+27=153
        // 153/10 = 3
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        }
        return num == sum;
    }

}

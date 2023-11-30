package practices.arrays;

import java.util.Scanner;

public class AvgTemp {
    public static void main(String[] args) {
        aboveAvgTemp();
    }

    static void avgTemp() {
        Scanner in = new Scanner(System.in);
        System.out.println("How many day's temperature: ");
        int days = in.nextInt();
        int n = 1;
        int avgTemp = 0;

        while (n <= days) {
            System.out.println("Enter " + n + " day's temperature: ");
            int temp = in.nextInt();
            n++;
            avgTemp += temp;
        }
        System.out.println("Average Temperature was: " + avgTemp / days + " for " + days + " days!");
    }

    static void aboveAvgTemp() {
        Scanner in = new Scanner(System.in);
        System.out.println("How many day's temperature: ");
        int days = in.nextInt();
        int[] temps = new int[days];
        int avgTemp = 0;
        int aboveAvg = 0;
        int n = 0;

        while (n < days) {
            System.out.println("Enter temperature for the day of " + (n + 1));
            temps[n] = in.nextInt();
            avgTemp += temps[n];
            n++;
        }
        avgTemp = avgTemp / days;

        for (int tempo : temps) {
            if (tempo > avgTemp) {
                aboveAvg = tempo;
            }
        }
        System.out.println("Above Avg Temp is: " + aboveAvg);
    }
}

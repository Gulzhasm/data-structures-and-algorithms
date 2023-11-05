package arrays;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        calculateAboveAvgTemperature();
    }

    public static void calculateAboveAvgTemperature(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days' temperatures? ");
        int numberOfDays = scanner.nextInt();
        int[] temps = new int[numberOfDays];
        int sum = 0;
        for (int i = 0; i < numberOfDays; i++) {
            System.out.println("Day " + (i + 1) + "'s high temperature: ");
            temps[i] = scanner.nextInt();
            sum += temps[i];
        }
        double avgTemp = sum / numberOfDays;
        //count days above average temp
        int above = 0;
        for (int j = 0; j < temps.length; j++) {
            if (temps[j] > avgTemp) {
                above++;
            }
        }

        System.out.println();
        System.out.println("Average Temp = " + avgTemp);
        System.out.println(above + " days above temperature" );
    }

    public static void calculateAvgTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days' temperatures? ");
        int numberOfDays = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= numberOfDays; i++) {
            System.out.println("Day " + i + "'s high temperature: ");
            int next = scanner.nextInt();
            sum += next;
        }
        double avgTemp = sum / numberOfDays;
        System.out.println();
        System.out.println("Average Temp = " + avgTemp);
    }
}

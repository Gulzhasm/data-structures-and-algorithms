package bootcamp.intro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter temperature in C: ");
        float tempC = scanner.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit is: " + tempF);
        }
}

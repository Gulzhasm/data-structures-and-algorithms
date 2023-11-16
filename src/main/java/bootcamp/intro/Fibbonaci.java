package bootcamp.intro;

import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        //0,1,1,2,3,5,8,13
        //find the nth fibonachi number

        Scanner in = new Scanner(System.in);
        int position = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= position){
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}

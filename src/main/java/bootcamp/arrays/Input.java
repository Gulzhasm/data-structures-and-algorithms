package bootcamp.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = new String[4];
        for(int i =0; i < str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }



    static void example() {
        int[] rows = new int[5];
        rows[0] = 1;
        System.out.println(rows[0]);

        String[] strings = new String[4];
        strings[0] = "DSA";
        System.out.println(strings[0]);

    }

    void primitivesArray(){
        int[] arr = new int[5];
        arr[0] = 11;
        arr[1] = 21;
        arr[2] = 31;

        //input using for loops
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}

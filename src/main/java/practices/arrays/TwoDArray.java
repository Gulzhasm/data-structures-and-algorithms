package practices.arrays;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int[][] arr1 = {
                {1, 2, 3},
                {2, 2},
                {1, 2, 3, 5},
        };
       // System.out.println(Arrays.deepToString(arr1));

        Scanner in = new Scanner(System.in);

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

        //output
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // System.out.println(Arrays.deepToString(arr1));
    }


}

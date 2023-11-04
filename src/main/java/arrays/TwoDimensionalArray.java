package arrays;

import java.util.Arrays;

public class TwoDimensionalArray {
    int[][] arr = null;

    //Constructor
    public TwoDimensionalArray(int numOfRows, int numOfColumns) {
        this.arr = new int[numOfRows][numOfColumns];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }


    //Insert Value in the array
    public void insertValueInTheArray(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("The value added successfully!");
            } else {
                System.out.println("The cell is already occupied!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }
// Time Complexity -------------------> O(1)
// Space Complexity -------------------> O(1)
    }

    //Accessing the cell from a given array
    public void accessCell(int row, int col) {
        System.out.println("\nAccessing Row# " + row + ", Col# " + col); //-------------------> O(1)
        try {
            System.out.println("Cell value is: " + arr[row][col]); //-------------------> O(1)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D");  //-------------------> O(1)
        }
// Time Complexity -------------------> O(1)
// Space Complexity -------------------> O(1)
    }

    //Traverse 2D array
    public void traverse2DArray() {
        for (int row = 0; row < arr.length; row++) {  //-------------------> O(m)
            for (int col = 0; col < arr[0].length; col++) { //-------------------> O(n)
                System.out.print(arr[row][col] + " "); //-------------------> O(1)
            }
            System.out.println(); //-------------------> O(1)
        }
// Time Complexity -------------------> O(MN)
// Space Complexity -------------------> O(1)
    }

    //Search
    public void searchingValue(int value) {
        for (int row = 0; row < arr.length; row++) {  //-------------------> O(m)
            for (int col = 0; col < arr[0].length; col++) { //-------------------> O(n)
                if (arr[row][col] == value) { //-------------------> O(1)
                    System.out.println("Value is found at the this row: " + row + " and at this col: " + col);//-------------------> O(1)
                    return; //TODO
                }
            }
        }
        System.out.println("Value is not found");//-------------------> O(1)
// Time Complexity -------------------> O(MN)
// Space Complexity -------------------> O(1)
    }


    //Delete
    public void deleteValueFromArray(int row, int col) {
        try {
            System.out.println("Successfully deleted  " + arr[row][col]);//-------------------> O(1)
            arr[row][col] = Integer.MIN_VALUE;//-------------------> O(1)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This index is not valid for array");//-------------------> O(1)
        }
// Time Complexity -------------------> O(1)
// Space Complexity -------------------> O(1)
    }


    public static void main(String[] args) {
        // Step 1 - Declare
        int[][] int2DArray;  //-------------------> O(1)

        //Step 2 - Instantiate
        int2DArray = new int[2][2];   //-------------------> O(1)

        //Step 3 - Initialize
        int2DArray[0][0] = 1;  //-------------------> O(1)
        int2DArray[0][1] = 2;  //-------------------> O(1)
        int2DArray[1][0] = 3;  //-------------------> O(1)
        int2DArray[1][1] = 4;  //-------------------> O(1)     O(mn)

        System.out.println(Arrays.deepToString(int2DArray));
        //All Together

        String[][] s2DArray = {{"a", "b"}, {"c", "d"}}; //-------------------> O(1)
        System.out.println(Arrays.deepToString(s2DArray));
    }
}

package udemy.arrays;

import java.util.Arrays;

public class Main2D {
    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray(3, 3);
        twoDimensionalArray.insertValueInTheArray(0, 0, 10);
        twoDimensionalArray.insertValueInTheArray(0, 1, 20);
        twoDimensionalArray.insertValueInTheArray(0, 2, 30);
        twoDimensionalArray.insertValueInTheArray(1, 0, 40);
        twoDimensionalArray.insertValueInTheArray(1, 1, 50);

        System.out.println(Arrays.deepToString(twoDimensionalArray.arr));
        twoDimensionalArray.deleteValueFromArray(0, 0);
        System.out.println(Arrays
                .deepToString(twoDimensionalArray.arr));

        //twoDimensionalArray.searchingValue(40);
        // twoDimensionalArray.traverse2DArray();
        // twoDimensionalArray.accessCell(0,2);
        // System.out.println(Arrays.deepToString(twoDimensionalArray.arr));
    }
}

package dsa.arrays;

public class Main {

    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0,0);
        sda.insert(1,2);
        sda.insert(2,30);
        sda.insert(12,30);

  /*      int firstElement = sda.arr[0];
        System.out.println(firstElement);
        int thirdElement = sda.arr[3];
        System.out.println(thirdElement);


        System.out.println("************* Array Traversal *************");
        sda.traverseArray();


        //Search for an element in the given array

        System.out.println("************* Array Search *************");
        sda.searchInArray(2);
        sda.searchInArray(20000);*/

        sda.deleteValue(0);
        System.out.println(sda.arr[0]);
    }
}

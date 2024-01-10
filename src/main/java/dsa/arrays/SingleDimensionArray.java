package dsa.arrays;

public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    //Insertion
    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Inserted!");
            } else {
                System.out.println("this cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds!");
        }
// Time Complexity -------------------> O(1)
// Space Complexity -------------------> O(1)
    }

    //Array Traversal
    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) { //-------------------> O(N)
                System.out.print(arr[i] + " "); //-------------------> O(1)
            }
        } catch (Exception e) {
            System.out.println("Array no longer exist");//-------------------> O(1)
        }
// Time Complexity -------------------> O(N)
// Space Complexity -------------------> O(1)
    }


    //Search for an element in the given array - Linear Search
    public void searchInArray(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) { //-------------------> O(N)
            if (arr[i] == valueToSearch) { //-------------------> O(1)
                System.out.println("value is found at the index of " + i); //-------------------> O(1)
                return; //-------------------> O(1)
            }
        }
        System.out.println(valueToSearch + " is not found"); //-------------------> O(1)
// Time Complexity -------------------> O(N)
// Space Complexity -------------------> O(1)
    }

    //Delete value from Array
    public void deleteValue(int valueToBeDeleteIndex) {
        try {
            arr[valueToBeDeleteIndex] = Integer.MIN_VALUE;//-------------------> O(1)
            System.out.println("The value has been deleted successfully");//-------------------> O(1)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in the range of array");//-------------------> O(1)
        }
// Time Complexity -------------------> O(1)
// Space Complexity -------------------> O(1)
    }
}

Insertion Sort

Steps to insertion sort

1. Divide the given array into two part
2. Take first element from an unsorted array and find it is correct position in sorted array
3. Repeat util unsorted array is empty

When to use Insertion Sort?

- when we have insufficient memory
- easy to implement
- when we have continuous inflow of numbers, and we want to keep them sorted

When to avoid Insertion Sort?
-When time is a concern. The running time of insertion sort is quadratic for such an array.

Implementation in java:

      public void insertionSort(int[] arr) { 
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i], j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

Time and Space Complexity Analysis:
Time complexity: O(N^2) - quadratic time complexity
Space Complexity - O(1) - no extra space required

In summary, insertion sort is an excellent method for partially sorted arrays and is also
a fine method for tiny arrays. T
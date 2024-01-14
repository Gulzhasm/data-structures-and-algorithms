Quick Sort

What is Quick Sort?
Quick Sort is a sorting algorithm based on the Divide and Conquer algorithm that picks an element as a pivot and partitions the given array around the picked pivot by placing the pivot in its correct position in the sorted array. (description's taken from geeksforgeeks)

Given an array: [5, 4, 3, 2, 1]
There is a concept known as "PIVOT".

Choose any element as pivot, after the first pass:
all the elements less than pivot - [n < p] - will be places on the left-hand side of pivot.
all the elements greater than pivot - [n > p] - will be places on the right-hand side of pivot.

Let's take a random pivot number - 4 from an array: [5, 4, 3, 2, 1]
Result: [1, 3, 2, 4, 5]
After the pass:
All the elements less than the pivot - [arr[i] < p] - will be placed on the left-hand side of the pivot.
All the elements greater than the pivot - [arr[i] > p] - will be placed on the right-hand side of the pivot.

Next, let's take 3 as a pivot [1, 3, 2] from the first pass of recursion on the left-hand side:
Result: [1, 2, 3]
The right-hand side sub-array [4, 5] was already sorted.

Hence, after the quick sort, the result will be [1,2,3,4,5];

How to put the pivot at the correct position?
We will have two vars as 
int start=0;
int end = arr.length-1; 
int pivot=4;
initial given array:  [5, 4, 3, 2, 1]
if pivot=4 is greater than start=5? false, so we will swap; 

How to pick the pivot:
Example from https://www.geeksforgeeks.org/quick-sort/

In geeksforgeeks example, they are taking the last element as pivot,
but the pivot can be any random element;
We can pick the middle element as pivot, or the last element.
![img.png](img.png)

Some important notes:
1. Not stable
2. In place sorting
3. Merge sort is better in Linked List, because in Linked List the memory allocations are not continuous;

Java Implementation:

````

    public void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }

            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        // recursion calls for two pivot's halves to be sorted, as the pivot at the correct index
        sort(arr, low, end);
        sort(arr, start, high);
    }
 
````

Time and Space Complexity Analysis:
Time Complexity: Average Case: O(Nlog(N)), Worst Case: O(N^2)
Space Complexity: O(1) - auxiliary space, but in the worst case quick sort could make O(N);

This post is written from my taken notes while studying DSA in java, and I hope someone who is also studying DSA java will take some advantages and additional info from this post.

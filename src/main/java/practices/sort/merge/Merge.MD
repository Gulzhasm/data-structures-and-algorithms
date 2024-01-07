Merge Sort

1. Divide the array into two parts
2. Sort two parts separately via recursion
3. merge the sorted parts

DRY RUN:
Given an array: [8, 3, 4, 12, 5, 6]
1. we divide the given array into two parts:
   [8, 3, 4] [12, 5, 6]
2. and sort them separately 
 sorted arrays: [3, 4, 8] and [5, 6, 12]
3. we are going to merge the two arrays into one
   [3, 4, 8] and [5, 6, 12]
merging process:
1.1 we compare the elements by indexes, if the element from the first part is smaller than the second part's element, 
put the first element from the first part in the merged array and move the pointer ahead to the next element.
For example: if the first element [3] from the first array greater than the first element [5] of the second array -> false:
so merged array's first element becomes [3]
1.2 then the second element comparison goes, if [4] > [5] -> false:
so merged array becomes: [3, 4]
1.3  then the second element comparison goes, if [8] > [5] -> true:
so merged array becomes: [3, 4, 5]
1.4 all elements will be compared and merged:
   [3, 4, 5, 6, 8, 12]

Complexity of Merge sort:
Time Complexity:O(NlogN)
Explanation: N numbers of comparisons made
and at every level, N elements are being merged: 
**N/2^k** for the k-th level
k log 2 = logN
k = log2N -> O(NlogN)

Space Complexity: O(1) -  for the in place merge sort

JAVA IMPLEMENTATION:
````
    static int[] mergeSort(int[] arr) {
        //base condition for recursion
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        //swapping elements while comparing two arrays elements
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                merged[k] = first[i];
                i++;
            } else {
                merged[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete, copy the remaining elements
        //in both of the loops, either one of them will be true, hence only one loop will be run
        while (i < first.length) {
            merged[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            merged[k] = second[j];
            j++;
            k++;
        }
        return merged;
    }
````
Bubble sort algorithm

In every step we are comparing with adjacent element.
1st pass through
 given: 3 1 5 4 2
 1. if 3 is greater than 1? -> yes, then swap 
1 3 5 4 2
 2. if 3 is greater than 5? -> no, then move to the next element
1 3 5 4 2
 3. if 5 is greater than 4? -> yes, then swap
1 3 4 5 2
 4. if 5 is greater than 2? ->yes, then swap
result: 1 3 4 2 5
With the first pass through the array, the largest element came to the end.

2nd pass through:
1 3 4 2 5
1. if 1 is greater than 3? -> no, then move to the next element
2. if 3 is greater than 4? -> no, then move to the next element
3. if 4 is greater than 2? -> yes, then swap elements
result: 1 3 2 4 5
With pass #2, 2nd largest element came to the 2nd from the last index.

3rd pass through:
1 3 2 4 5
1. if 1 is greater than 3? -> no, then move to the next element
2. if 3 is greater than 2? -> yes, then swap elements
1 2 3 4 5

This sort also is known as Sinking Sort or Exchange sort.
Space Complexity: O(1)
Time Complexity: Best Case O(N) if array is already sorted.
Worst Case O(N^2) if array is sorted in descending order
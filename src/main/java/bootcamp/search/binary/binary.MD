Binary Search

sorted array -> int[] arr = new int[]{1,2,3,4,5}, int target; target = 5;

linear search can be like this:
````
for(int i = 0; i < arr.length; i++){
if(arr[i] == target){
return i;
}
}
````

now how can look with binary search:
1. find the middle element
2. in the sorted array, all the elements on the left side will be smaller than the middle element:
  1,2,3 -smaller than mid <- MIDX ->  greater than mid 23,45,355
3. If the middle element is equal target -> ```midx == target``` element than found the ans!


Dry Run:
````
arr = [2,4,6,9,11,12,14,20,36,48] target = 36

start = arr[0] = 2
end = arr[arr.length-1] =48
middle=(start+end)/2 = 11
target >= middle? 36 >= 11? false

start=middle +1  = 12
middle = (start+end)/2 =20
target >= middle?  36>=20 -> false

start = middle; middle +1  = 36
middle = (start+end)/2;
middle = 36 
target >= middle?  36>=36 true -> ans = 36

````

Why do we do BINARY SEARCH:
1. the best case scenario is when there are minimal steps
2. the worst case scenario is when n numbers of search, max numbers of search: for example 100000 times of traversal
        
SEARCH IN A SORTED ARRAY OF 1 MILLION
1. Linear search would take 1M comparisons
2. Binary search can make 20 comparisons ONLY!!!!!

````
int binarySearch(int[] arr, int target) {
        if (arr.length == 0) return -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle
            int midX = start + (end - start) / 2;
            if (target < arr[midX]) {
                end = midX - 1;
            } else if (target > arr[midX]) {
                start = midX + 1;
            } else {
                return midX;
            }
        }
        return -1;
    }
````

Order Agnostic Binary Search

int[] arr = [5,4,3,2,1] int target = 4;
if(target > middle)
end = midX-1;































































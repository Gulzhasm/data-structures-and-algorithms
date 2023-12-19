
Arrays 

int[] rows;  -> declaration of array -> compile time

rows = new int[4]; -> actual memory creation and allocation - heap memory - initialisation -> runtime - assigning the memory during the runtime or execution time
heap - primitives only are stored in the heap memory
stack - besides the primitives, all other objects are stored in the stack memory

int[] arr - stored in the stack memory
reference variable = arr[0] = anywhere in the  heap memory

1. array objects are in heap
2. heap objects are not continuous
3. indexes start from 0
4. new keyword is used to create an object -> new int[5] -> this will create a new array with the size of 5




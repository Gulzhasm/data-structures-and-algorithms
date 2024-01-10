package dsa.array_list;

public class Exercise {
    public static void main(String[] args) {
        printPairs(new int[]{1,3,2,4});
    }
//
    public static void printPairs(int[] array){
     for(int i=0; i<array.length; i++){
         for(int j=0; j<array.length; j++){
             System.out.print(array[i] + "" + array[j] + " ");
         }
         System.out.println();
     }
     //Time Complexity ------> O(N^2)
    }

    void reverseArray(int[] array){

    }
}

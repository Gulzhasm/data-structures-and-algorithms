package practices.recursion.simple;


public class Lists {
    public static void main(String[] args) {
        int[] list = new int[]{-5, -3, 1};
        System.out.println(productOfEvenNumbers(list));
    }

    static int productOfEvenNumbers(int[] arr) {
        return productOfEvenNumbers(0, arr);
    }

    private static int productOfEvenNumbers(int n, int[] arr) {
        if(arr.length == 0){
            return 0;
        }
        //base case
        if (n == arr.length) {
            return 1;
        }

        int value = 1;
        int count = 0;
        if (arr[n] % 2 == 0) {
            value = arr[n];
            count++;
        }
        if(count == 0){
            return 0;
        }
        //recursive case
        return productOfEvenNumbers(n + 1, arr) * value;
    }

    private static int sumOdds(int n, int[] list) {
        //base case
        if (n == list.length) {
            return 0;
        }
        int value = 0;
        //recursive case
        if (list[n] % 2 != 0) {
            value = list[n];
        }
        return sumOdds(n + 1, list) + value;
    }


}

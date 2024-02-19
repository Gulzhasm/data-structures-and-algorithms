package leetcode.topicWise.recursion;

public class Partitions {

    public static void main(String[] args) {
        System.out.println(countPartitions(5,5));
    }

    static int countPartitions(int n, int m){
        if(n == 0) return 1;
        else if (m == 0 || n < 0) return 0;
        else return countPartitions(n-m, m) + countPartitions(n, m-1);
    }
}

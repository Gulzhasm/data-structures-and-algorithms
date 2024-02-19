package leetcode.topicWise.recursion;

public class GridPath {

    public static void main(String[] args) {
        System.out.println(gridPath(3,3));
    }


    static int gridPath(int n, int m){
        if(n == 1 || m == 1) return 1;
        return gridPath(n, m-1) + gridPath(n-1, m);
    }
}

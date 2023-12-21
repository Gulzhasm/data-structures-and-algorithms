package leetcode.assignments.recursion;



public class PrintAllStringN {
    public static void main(String[] args) {
        printAllPossibleString(3, "");
    }

    static void printAllPossibleString(int n, String currentString){
        if(currentString.length() == n){
            System.out.println(currentString);
            return;
        }

        printAllPossibleString(n, currentString + "0");
        printAllPossibleString(n, currentString + "1");
    }


}

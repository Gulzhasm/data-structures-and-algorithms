package leetcode.assignments.strings;

public class Palindrome {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String word){
        for(int i = 0; i < word.length()/2; i++){
            if(word.charAt(i) != word.charAt(word.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}

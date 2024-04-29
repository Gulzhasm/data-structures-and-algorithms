package leetcode.topicWise.strings;

public class Review {
    public static void main(String[] args) {
        int num = 0;
        System.out.println(ithLetter(num));
        System.out.println(isinOrder("bca"));
    }

    public int minOperations(int[] A, int k) {
        for (int a : A)
            k ^= a;
        return Integer.bitCount(k);
    }

   static boolean isinOrder(String s) {
            for (int i = 1; i < s.length(); i++) {
                int prev = ithLetter(s.charAt(i - 1));
                int curr = ithLetter(s.charAt(i));
                if (prev > curr) {
                    return false;
                }
            }
            return true;
        }

       static char ithLetter (int i){
            return (char) (((int) 'a') + i);
        }
    }


package leetcode.topicWise.strings;

import java.util.Arrays;

public class Review {
    public static void main(String[] args) {
        int num = 0;
        System.out.println(ithLetter(num));
        System.out.println(isinOrder("bca"));
    }

    //Example 1:
    //
    //Input: word = "aba"
    //Output: 4
    //Explanation: The four wonderful substrings are underlined below:
    //- "aba" -> "a"
    //- "aba" -> "b"
    //- "aba" -> "a"
    //- "aba" -> "aba"

    public long wonderfulSubstrings(String word) {
        long[] count = new long[1024]; // 2^10 to store XOR values
        long result = 0;
        int prefixXor = 0;
        count[prefixXor] = 1;

        for (char ch : word.toCharArray()) {
            int charIndex = ch - 'a';
            prefixXor ^= 1 << charIndex;
            result += count[prefixXor];
            for (int i = 0; i < 10; i++) {
                result += count[prefixXor ^ (1 << i)];
            }
            count[prefixXor]++;
        }

        return result;
    }

    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == ch) {
                idx = i;
                break;
            }
        }

        if(idx == 0) return word;

        for(int i = idx; i >= 0; i--) sb.append(word.charAt(i));

        sb.append(word.substring(idx+1));

        return sb.toString();
    }

    public int findMaxK(int[] nums) {
        //sort
        // -7, -1, 1, 6, 7, 10
        Arrays.sort(nums);

        int s = 0, e = nums.length - 1, max = 0;

        while(s < e){
            if(Math.abs(nums[s]) == nums[e]) return max;
            else {
                s++;
                e--;
            }
        }
        return -1;
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


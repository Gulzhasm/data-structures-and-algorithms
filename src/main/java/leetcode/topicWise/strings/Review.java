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
    public int compareVersion(String version1, String version2) {
        int temp1 = 0,temp2 = 0;
        int len1 = version1.length(),len2 = version2.length();
        int i = 0,j = 0;
        while(i<len1 || j<len2) {
            temp1 = 0;
            temp2 = 0;
            while(i<len1 && version1.charAt(i) != '.') {
                temp1 = temp1*10 + version1.charAt(i++)-'0';

            }
            while(j<len2 && version2.charAt(j) != '.') {
                temp2 = temp2*10 + version2.charAt(j++)-'0';

            }
            if(temp1>temp2) return 1;
            else if(temp1<temp2) return -1;
            else {
                i++;
                j++;

            }

        }
        return 0;

    }

    public int findMaxK(int[] nums) {
        Arrays.sort(nums);

        int s = 0, e = nums.length - 1, max = Integer.MIN_VALUE;

        while(s < e){
            int sum = nums[s] + nums[e];

            if(sum == 0){
                max = Math.max(max, nums[e]);
                s++;
                e--;
            } else if(sum < 0) s++;
            else e--;
        }

        return max != Integer.MIN_VALUE ? max : -1;
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

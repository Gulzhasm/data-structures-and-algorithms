package leetcode.challenges.february;

public class Feb11 {

    //Input: s = "the sky is blue"
    //Output: "blue is sky the"
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));

    }
    public static String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        String[] ans = new String[arr.length];
        int j =0;
        for (int i = arr.length - 1; i >= 0; i--) {
            ans[j] = arr[i];
            j++;
        }
        return String.join("\s", ans);
    }


    public String reverseVowels(String str) {
        char[] chars = str.toCharArray();
        String v = "aeiouAEIOU";
        int s = 0, e = str.length() - 1;
        while (s < e) { // hello
            // we need to find the start index vowel
            while (s < e && v.indexOf(chars[s]) == -1) {
                s++;
            }
            // we need to find the end index vowel
            while (s < e && v.indexOf(chars[e]) == -1) {
                e--;
            }

            //after finding the index with vowels, we need to swap
            char temp = chars[s];
            chars[s] = chars[e];
            chars[e] = temp;

            s++;
            e--;
        }
        return new String(chars);
    }

}

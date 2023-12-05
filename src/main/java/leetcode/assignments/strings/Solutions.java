package leetcode.assignments.strings;

import java.util.List;

public class Solutions {

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        String[] words = s.split("\s");
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversed.append(reversedWord).append(" ");
        }
        return reversed.toString().trim();

    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }

    //TODO optimize
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if (ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) count++;
            else if (ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) count++;
            else if (ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) count++;
        }
        return count;
    }

    public static String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }

    public static String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indices.length; i++) {
            sb.append(s.charAt(indices[i]));
        }
        return sb.toString();
    }
}

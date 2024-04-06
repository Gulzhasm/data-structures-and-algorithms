package leetcode.assignments.arrays;

import org.checkerframework.checker.units.qual.C;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Frequesncy {


    private static int[] frequency(String s){
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        return freq;
    }


    public static int countCharacters(String[] words, String chars) {
        int count = 0;
        if(words.length == 0 || chars.length() == 0){
            return 0;
        }

        int[] charsFreq = frequency(chars);

        for(int i = 0; i < words.length; i++){
            int[] temp = frequency(words[i]);
            for(int j = 0; j < charsFreq.length; j++){
                if(charsFreq[j] >= temp[j]){

                }
            }
        }


        return count;
    }

    //s = "leEeetcode"
    public static  String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        for(char c : s.toCharArray()){
            if (!stack.isEmpty() && Math.abs(c - stack.peek()) == 32) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        for (Character character : stack) {
            stringBuilder.append(character);
        }


        return stringBuilder.toString();
    }



    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode"));

    }
}

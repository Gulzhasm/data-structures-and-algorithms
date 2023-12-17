package leetcode.assignments.arrays;

import java.util.Arrays;

public class Frequesncy {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(frequency("hello")));

    }

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

}

package leetcode.topicWise.greedy;

import java.util.Arrays;

public class Token {
    //Input: tokens = [100,200,300,400], power = 200 1. 100,
    //Output: 2
    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);
        int i = 0, j = tokens.length-1;
        int score = 0;
        while( i <= j ){
            if( tokens[i] <= P) {
                score++;
                P -= tokens[i++];
            }
            else if ( score >= 1 && i < j){
                score--;
                P += tokens[j--];
            }
            else break;
        }
        return score;
    }

    public int minimumLength(String st) {
        int s = 0, e = st.length()-1;


        while(s < e && st.charAt(s) == st.charAt(e)){
            char ch = st.charAt(s);
            while (s <= e && st.charAt(s) == ch) s++;
            while (s <= e && st.charAt(e) == ch) e--;
        }
        return  e - s +1;
    }


}

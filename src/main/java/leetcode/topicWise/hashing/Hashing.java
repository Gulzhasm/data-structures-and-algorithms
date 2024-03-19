package leetcode.topicWise.hashing;

import java.util.Arrays;

public class Hashing {

    public int leastInterval(char[] tasks, int n) {

            int[] freq = new int[26];

            for(char task: tasks){
                freq[task - 'A']++;
            }

            Arrays.sort(freq);

            int max = freq[25] - 1;
            int idle = max*n;

            for(int i = 24; i>=0; i--) idle -= Math.min(max, freq[i]);

            return idle < 0 ? tasks.length : tasks.length + idle;

    }
}

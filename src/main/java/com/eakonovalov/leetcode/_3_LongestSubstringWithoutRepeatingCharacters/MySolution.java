package com.eakonovalov.leetcode._3_LongestSubstringWithoutRepeatingCharacters;

import java.util.LinkedList;
import java.util.Queue;

public class MySolution implements Solution {

    @Override
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> q = new LinkedList<>();
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (q.contains(c)) {
                while (!q.isEmpty() && q.peek() != c) {
                    q.poll();
                }
                ;
                q.poll();
            }
            q.offer(c);
            result = Math.max(q.size(), result);
        }

        return result;
    }
}

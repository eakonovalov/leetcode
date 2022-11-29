package com.eakonovalov.leetcode._205_IsomorphicStrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MySolution implements Solution {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> charMapping = new HashMap<>();
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            Character c1 = charMapping.get(s.charAt(i));
            if (c1 != null) {
                if (c1 != t.charAt(i)) {
                    return false;
                }
            } else {
                char c2 = t.charAt(i);
                if (charSet.contains(c2)) {
                    return false;
                }
                charMapping.put(s.charAt(i), c2);
                charSet.add(c2);
            }
        }

        return true;
    }
}

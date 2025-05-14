package java.ValidAnagram;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> charMap1 = new HashMap<>();
        Map<Character, Integer> charMap2 = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            Character ch1 = s.charAt(i);

            if (charMap1.containsKey(ch1)) {
                charMap1.put(ch1, charMap1.get(ch1) + 1);
                continue;
            }

            charMap1.put(ch1, 1);

        }
        for (int i = 0; i < t.length(); i++) {
            Character ch1 = t.charAt(i);

            if (charMap2.containsKey(ch1)) {
                charMap2.put(ch1, charMap2.get(ch1) + 1);
                continue;
            }

            charMap2.put(ch1, 1);

        }
        return charMap1.equals(charMap2);
    }

}

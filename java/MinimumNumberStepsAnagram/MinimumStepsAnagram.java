package java.MinimumNumberStepsAnagram;

import java.util.HashMap;
import java.util.Map;

public class MinimumStepsAnagram {
    public int minSteps(String s, String t) {
        if (s.length() != t.length()) {
            return 0;
        }

        Map<Character, Integer> CharMap = new HashMap<>();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);

            if (CharMap.containsKey(ch)) {
                CharMap.put(ch, CharMap.get(ch) + 1);
            } else {
                CharMap.put(ch, 1);
            }

        }

        for (int i = 0; i < t.length(); i++) {
            Character ch = t.charAt(i);

            if (CharMap.containsKey(ch)) {
                CharMap.put(ch, CharMap.get(ch) - 1);
                if (CharMap.get(ch) == 0) {
                    CharMap.remove(ch);
                }
            }
        }

        for (Integer diff : CharMap.values()) {
            count += diff;
        }

        return count;
    }
}

package java.LongestSubstring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> hash_map = new HashMap<>();

        int result = 0;
        int l = 0;
        int r = 0;

        while (r < s.length()) {
            Character ch = s.charAt(r);
            if (hash_map.containsKey(ch)) {
                l = Math.max(hash_map.get(ch), l);
            }
            result = Math.max(result, r - l + 1);
            hash_map.put(ch, r + 1);
            r++;
        }

        return result;
    }

    public static void main(String[] args) {
        LongestSubstring n1 = new LongestSubstring();

        int i = n1.lengthOfLongestSubstring("kkmfnnqer");

        System.out.println(i);
    }

}

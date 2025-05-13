package java.TwoSum;

import java.util.HashMap;

public class TwoSum {

    public int[] Solution(int[] nums, int target) {
        int[] sol = {};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int nums2 = target - nums[i];

            if (map.containsKey(nums2)) {

                sol[0] = i;
                sol[1] = map.get(nums2);
                return new int[] { i, map.get(nums2) };
            } else {
                map.put(nums[i], i);
            }

        }
        return sol;
    }
}
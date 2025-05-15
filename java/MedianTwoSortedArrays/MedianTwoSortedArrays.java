package java.MedianTwoSortedArrays;

import java.util.ArrayList;
import java.util.List;

public class MedianTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        List<Integer> sol = new ArrayList<>();
        int sum = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                sol.add(nums1[i]);
                sum += nums1[i];
                i++;
            } else {
                sol.add(nums2[j]);
                sum += nums2[j];
                j++;
            }
        }

        while (i < nums1.length) {
            sol.add(nums1[i]);
            sum += nums1[i];
            i++;
        }

        while (j < nums2.length) {
            sol.add(nums2[i]);
            sum += nums2[j];
            j++;
        }
        int mid = sol.size() / 2;
        if (sol.size() % 2 == 0) {
            return sol.get(mid).doubleValue() + sol.get(mid - 1).doubleValue() / sol.size();
        }
        return sol.get(mid).doubleValue();
    }
}

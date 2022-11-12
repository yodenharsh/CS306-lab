package misc;

import java.util.Map;
import java.util.TreeMap;

public class temp {
    public static Map<Integer, Boolean> mergeArrays(int[] nums1, int[] nums2) {
        int num1Size = nums1.length;
        int num2Size = nums2.length;

        Map<Integer, Boolean> mp = new TreeMap<>();
        for (int i = 0; i < num1Size; i++) {
            mp.put(nums1[i], true);
        }
        for (int i = 0; i < num2Size; i++) {
            mp.put(nums2[i], true);
        }
        return mp;
    }

    public static void main(String[] args) {
        int nums1[] = new int[] { 2, 8, 3, 5 };
        int nums2[] = new int[] { 3, 9, 14 };
        mergeArrays(nums1, nums2);
    }
}

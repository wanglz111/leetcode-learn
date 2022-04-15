import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length ==0 || nums2.length ==0){
            return new int[0];
        }

        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        for (Integer i : nums1) {
            set1.add(i);
        }

        for (Integer i : nums2) {
            if (set1.contains(i)){
                set2.add(i);
            }
        }

        int[] result = new int[set2.size()];
        int j = 0;
        for(int i: set2){
            result[j++] = i;
        }
        return result;
    }
}
// @lc code=end


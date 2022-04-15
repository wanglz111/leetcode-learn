/*
 * @lc app=leetcode.cn id=454 lang=java
 *
 * [454] 四数相加 II
 */

// @lc code=start
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i:nums1) {
            for (int j:nums2) {
                if (counts.containsKey(i+j)) {
                    counts.put(i+j, counts.get(i+j)+1);
                }  else {
                    counts.put(i+j,1);
                }
            }
        }
        int res = 0;
        for (int k:nums3) {
            for (int l:nums4) {
                int tmp = k + l;
                if (counts.containsKey(0-tmp)) {
                    res += counts.get(0-tmp);
                }
            }
        }
        return res;
    }
}
// @lc code=end


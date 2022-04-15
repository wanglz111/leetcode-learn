import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            int tmp = target - nums[i];
            if (map1.containsKey(tmp)){
                result[0] = i;
                result[1] = map1.get(tmp);
            }
            map1.put(nums[i], i);
        }
        return result;
    }
}
// @lc code=end


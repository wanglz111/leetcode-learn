import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while(true) {
            n = getNumber(n);
            if (n == 1){
                return true;
            }
            if (set.contains(n)){
                return false;
            }
            set.add(n);
        }
    }

    public static int getNumber(int n){
        int sum = 0;
        while(n>0){
            sum = sum + (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
}
// @lc code=end


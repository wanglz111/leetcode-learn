/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] number = new int[26];
        for (char c : s.toCharArray()){
            number[c-'a'] +=1;
        }
        for (char c : t.toCharArray()){
            number[c-'a'] -=1;
        }

        for (int a :number){
            if(a!=0){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end


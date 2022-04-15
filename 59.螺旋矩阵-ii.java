/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int loop = n/2;
        int startX = 0;
        int startY = 0;
        int[][] result = new int[n][n];
        int offset = 1;
        int count = 1;

        while (loop!=0) {
            int i = startX;
            int j = startY;
            for (;j < n + startY - offset; j++) {
                result[i][j] = count ++;
            }
            for (; i < n + startX - offset; i++) {
                result[i][j] = count ++;
            }
            for (; j > startY; j--) {
                result[i][j] = count ++;
            }
            for (; i > startX; i--) {
                result[i][j] = count ++;
            }
            startX++;
            startY++;
            offset += 2;
            loop --;
        }
        if (n%2 == 1){
            result[n/2][n/2] = count;
        }
        return result;
    }

}
// @lc code=end


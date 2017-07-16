public class Solution {
    public int climbStairs(int n) {
        return this._climbStairs(0, n);
    }

    /**
     * @param s 已走的步数
     * @param n 剩余的步数
     * @return
     */
    private int _climbStairs(int s, int n) {
        if (s > n) {
            return 0;
        } else if (s == n) {
            return 1;
        } else {
            return this._climbStairs(s+1, n) + this._climbStairs(s+2, n);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.climbStairs(50));
    }
}
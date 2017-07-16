public class Solution {
    public int climbStairs(int n) {
        int[] cache = new int[n+1];
        return this._climbStairs(0, n, cache);
    }

    /**
     * @param s 已走的步数
     * @param n 剩余的步数
     * @return
     */
    private int _climbStairs(int s, int n, int[] cache) {
        if (s > n) {
            return 0;
        } else if (s == n) {
            return 1;
        } else if (cache[s] > 0) {
            return cache[s];
        } else {
            cache[s] = this._climbStairs(s+1, n, cache) + this._climbStairs(s+2, n, cache);
            return cache[s];
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.climbStairs(30));
    }
}
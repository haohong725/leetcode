//搜索插入位置

package io.github.ihaohong.solutions.s035;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;

        for (i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                break;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = new int[]{1, 3, 5, 6};
        int target = 0;

        System.out.println(s.searchInsert(nums, target));
    }
}
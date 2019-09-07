// 删除有序数组中的重复项

package io.github.ihaohong.solutions.s026;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i-1])
                nums[i++] = n;

        return i;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] testArr = new int[]{1, 1, 2, 5, 3, 2};
        System.out.println(s.removeDuplicates(testArr));
    }
}

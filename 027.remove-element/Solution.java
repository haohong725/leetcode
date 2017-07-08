public class Solution {
    public int removeElement(int[] nums, int val) {
        int length = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) continue;
            nums[length] = nums[i];
            length ++;
        }

        return length;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] testArr = new int[]{3, 2, 2, 3};

        int length = s.removeElement(testArr, 3);

        System.out.println(length);
    }
}
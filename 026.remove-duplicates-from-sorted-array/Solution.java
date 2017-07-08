import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

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

/**
 * question:
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

/**
 * @author haohong
 */
public class Solution {
    public boolean Find(int target, int [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (target == array[i][j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] mockA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Solution solution = new Solution();

        System.out.println(solution.Find(0, mockA));
        System.out.println(solution.Find(5, mockA));
    }
}

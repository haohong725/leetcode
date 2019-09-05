// 杨辉三角形

package io.github.ihaohong.solutions.s118;

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> matrix = new ArrayList<>();
        for (int i=1; i<=numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j=0; j<i; j++) {
                if (j == 0 || j == i-1) {
                    row.add(1);
                } else {
                    int left = matrix.get(i-2).get(j-1);
                    int right = matrix.get(i-2).get(j);
                    row.add(left + right);
                }
            }
            matrix.add(row);
        }
        return matrix;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generate(1));
        System.out.println(solution.generate(2));
        System.out.println(solution.generate(3));
        System.out.println(solution.generate(4));
        System.out.println(solution.generate(5));
        System.out.println(solution.generate(6));
        System.out.println(solution.generate(7));
        System.out.println(solution.generate(8));
    }
}
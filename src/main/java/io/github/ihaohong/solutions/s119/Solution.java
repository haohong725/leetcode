// 杨辉三角形

package io.github.ihaohong.solutions.s119;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) { return new ArrayList<>(); }
        List<List<Integer>> matrix = new ArrayList<>();
        for (int i=1; i<=rowIndex; i++) {
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
        return matrix.get(rowIndex-1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.getRow(0));
//        System.out.println(solution.getRow(1));
//        System.out.println(solution.getRow(2));
        System.out.println(solution.getRow(3));
//        System.out.println(solution.getRow(4));
//        System.out.println(solution.getRow(5));
//        System.out.println(solution.getRow(6));
//        System.out.println(solution.getRow(7));
//        System.out.println(solution.getRow(8));
    }
}
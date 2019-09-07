//二叉树的层次遍历 II

package io.github.ihaohong.solutions.s107;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.Set;

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Map<Integer, List<Integer>> mapResult = new HashMap<Integer, List<Integer>>();

        this.traverse(root, 0, mapResult);

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        Set<Integer> keys = mapResult.keySet();
        if (keys.isEmpty()) {
            return result;
        }

        int index = Collections.max(keys);
        while (index >= 0) {
            if (mapResult.get(index) == null) {
                break;
            }

            result.add(mapResult.get(index));

            index--;
        }

        return result;
    }

    public void traverse(TreeNode node, int depth, Map<Integer, List<Integer>> result) {
        if (node == null) {
            return;
        }

        List<Integer> list = result.get(depth);
        if (list == null) {
            list = new ArrayList<Integer>();
            result.put(depth, list);
        }

        list.add(node.val);

        this.traverse(node.left, depth + 1, result);
        this.traverse(node.right, depth + 1, result);

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode treeRoot = null;

        List<List<Integer>> result = s.levelOrderBottom(treeRoot);

        System.out.println(result);
    }

    private TreeNode mock1() {
        // 第一层
        TreeNode treeRoot = new TreeNode(1);

        // 第二层
        treeRoot.left = new TreeNode(2);
        treeRoot.right = new TreeNode(3);

        // 第三层
        treeRoot.left.left = new TreeNode(4);
        treeRoot.left.right = new TreeNode(5);
        treeRoot.right.left = new TreeNode(6);
        treeRoot.right.right = new TreeNode(7);

        return treeRoot;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
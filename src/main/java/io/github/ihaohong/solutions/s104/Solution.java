//
//二叉树的最大深度

package io.github.ihaohong.solutions.s104;

import java.lang.Math;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        } else if (root.left == null && root.right != null) {
            return 1 + this.maxDepth(root.right);
        } else if (root.left != null && root.right == null) {
            return 1 + this.maxDepth(root.left);
        } else {
            return 1 + Math.max(this.maxDepth(root.left), this.maxDepth(root.right));
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        TreeNode root = s.mock1();
        System.out.println(s.maxDepth(root));

    }

    private TreeNode mock1() {
        // 第一层
        TreeNode treeRoot = new TreeNode(1);

        // 第二层
//        treeRoot.left = new TreeNode(2);
//        treeRoot.right = new TreeNode(3);

        // 第三层
//        treeRoot.left.left = new TreeNode(4);
//        treeRoot.left.right = new TreeNode(5);
//        treeRoot.right.left = new TreeNode(6);
//        treeRoot.right.right = new TreeNode(7);

        return treeRoot;
    }

    public void printTree(TreeNode treeNode) {
        System.out.print(treeNode.val + " ");

        if (treeNode.left != null) {
            printTree(treeNode.left);
        }

        if (treeNode.right != null) {
            printTree(treeNode.right);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
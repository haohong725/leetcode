//
//相同的树

package io.github.ihaohong.solutions.s100;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if ((p == null && q != null)
                || (p != null && q == null)
                || p.val != q.val) {
            return false;
        }

        if ((p.left != null && q.left == null)
                || (p.left == null && q.left != null)
                || !this.isSameTree(p.left, q.left)) {
            return  false;
        }

        if ((p.right != null && q.right == null)
                || (p.right == null && q.right != null)
                || !this.isSameTree(p.right, q.right)) {
            return false;
        }

        return true;
    }

    public TreeNode mockTree()
    {
        TreeNode nodeRoot = new TreeNode(1);

        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);

        nodeRoot.left = node2;
        nodeRoot.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        return nodeRoot;
    }

    public void printTree(TreeNode treeNode)
    {
        System.out.print(treeNode.val + " ");

        if (treeNode.left != null) {
            printTree(treeNode.left);
        }

        if (treeNode.right != null) {
            printTree(treeNode.right);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        TreeNode tree1 = null;
        TreeNode tree2 = s.mockTree();

        System.out.println(s.isSameTree(tree1, tree2));

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}


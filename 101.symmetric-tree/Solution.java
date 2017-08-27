import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

class Solution {
    Queue<TreeNode> queue = new LinkedList<TreeNode>();

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        TreeNode leftRoot = root.left;
        TreeNode rightRoot = root.right;

        this.rotateTree(rightRoot);

        return this.isSameTree(leftRoot, rightRoot);
    }

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

    public void rotateTree(TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            this.rotateTree(root.left);
        }

        if (root.right != null) {
            this.rotateTree(root.right);
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public void printTree(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }

        queue.add(treeNode);

        TreeNode x = null;
        while (true) {
            try {
                x = queue.remove();
            } catch (NoSuchElementException e) {
                break;
            }
            
            System.out.println(x.val);

            if (x.left != null) {
                queue.add(x.left);
            }

            if (x.right != null) {
                queue.add(x.right);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode treeRoot = null;

        System.out.println(s.isSymmetric(treeRoot));
    }

    public TreeNode mock2() {
        // 第一层
        TreeNode treeRoot = new TreeNode(1);

        // 第二层
        treeRoot.left = new TreeNode(2);
        treeRoot.right = new TreeNode(2);

        return treeRoot;
    }

    public TreeNode mock1() {
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

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
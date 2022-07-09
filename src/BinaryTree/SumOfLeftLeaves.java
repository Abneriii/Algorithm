package BinaryTree;

/**
 * Author:
 * Created at:2022/7/6
 * Updated at:
 *
 *
 * //LC.404.左叶子之和
 *
 *
 **/
public class SumOfLeftLeaves {

    /**
     * //2022.3.4----做出。
     */
    class Solution {
        public int sumOfLeftLeaves(TreeNode root) {
            if (root == null) return 0;
            if (root.left != null && root.left.left == null && root.left.right == null) {
                return root.left.val + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
            }
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);


        }


    }
}

package BinaryTree;

/**
 * Author:
 * Created at:2022/7/6
 * Updated at:
 **/
public class SortedArrayToBST {

    /**
     * 2022.4.14:Hou："已经排好序了，那么中间的就是二叉搜索树的根节点，通过先序遍历构建二叉搜索树。"做出来了，代码通过了。
     *
     */
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {


            return sortedArrayToBST(nums, 0, nums.length - 1);
        }

        public TreeNode sortedArrayToBST(int[] nums, int left, int right) {
            if (left > right) {
                return null;
            }
            int mid = (left + right) / 2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = sortedArrayToBST(nums, left, mid - 1);
            root.right = sortedArrayToBST(nums, mid + 1, right);
            return root;
        }
    }





}

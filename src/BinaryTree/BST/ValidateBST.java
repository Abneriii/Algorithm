package BinaryTree.BST;



/**
 * Author:
 * Created at:2022/7/6
 * Updated at:
 *
 *
 * lc.98.验证二叉搜索树
 **/
public class ValidateBST {


    /**
     *2022.3.1----代码通过。自己的思路和题解一样，但是自己代码实现很麻烦
     */

    class Solution {
        public boolean isValidBST(TreeNode root) {
            long max=Long.MAX_VALUE;
            long min=Long.MIN_VALUE;
            return isValidBST(root,max,min);


        }

        public boolean isValidBST(TreeNode root, long max, long min){
            if(root==null) return true;
            else if(root.left==null&&root.right==null) return true;
            else if(root.left!=null&&root.right==null&&root.val>root.left.val&&root.left.val>min) return isValidBST(root.left,root.val,min);
            else if(root.right!=null&&root.left==null&&root.val<root.right.val&&root.right.val<max) return isValidBST(root.right,max,root.val);
            else{
                if(root.left!=null&&root.right!=null&&root.val>root.left.val&&root.val<root.right.val&&root.left.val>min&&root.right.val<max){
                    return isValidBST(root.left,root.val,min)&&isValidBST(root.right,max,root.val);
                }

            }
            return false;


        }

    }



    //2022.3.1----HouSF:非空前提，比较一个节点的左节点是不是小于这个节点，右节点是不是大于，若是，则递归调用,终止条件为:当遍历到叶子节点的时候-------有误代码,因为没有考虑到当前节点的父节点。
    class Solution2 {
        public boolean isValidBST(TreeNode root) {

            if(root==null) return true;
            if(root.left==null&&root.right==null) return true;
            if(root.left!=null&&root.val>root.left.val) return isValidBST(root.left);
            if(root.right!=null&&root.val<root.right.val) return isValidBST(root.right);
            return false;
        }
    }




}

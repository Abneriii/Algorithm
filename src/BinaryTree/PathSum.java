package BinaryTree;

/**
 * Author:
 * Created at:2022/6/22
 * Updated at:
 * Leetcode112
 *
 * 2022.6.22---5min---No idea.
 **/
public class PathSum {


    /**
     * Hou:如果当前为叶子节点，则判断路径总和是否等于目标值，否则就求左边节点为根节点的路径总和、右边节点为根节点的路径总和
     *
     * 2022.6.22---解法有误。------todo分析错因
     */
//
//    class Solution {
//        public boolean hasPathSum(TreeNode root, int targetSum) {
//            if(root==null){
//                return false;
//            }
//            return hasPathSum(root,root.val,targetSum);
//        }
//        public boolean hasPathSum(TreeNode root,int rightNowSum,int targetSum){
//            if(root==null){
//                return false;
//            }
//            if(root.left==null&&root.right==null){
//                if(rightNowSum+root.val==targetSum){
//                    return true;
//                }else{
//                    return false;
//                }
//            }
//            hasPathSum(root.left,rightNowSum+root.val,targetSum);
//            hasPathSum(root.right,rightNowSum+root.val,targetSum);
//            return false;
//        }
//
//    }

}

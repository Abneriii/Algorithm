package BinaryTree;

/**
 * Author:
 * Created at:2022/6/22
 * Updated at:
 *
 *
 *   *101. 对称二叉树https://leetcode.cn/problems/symmetric-tree/
 *  * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 **/
public class SymmetricTree {



}
/**
 *  *
 *  * JZ.28.对称的二叉树.
 *  * 2022.4.18:做出。
 */
//
//class Solution {
//    public boolean isSymmetric(TreeNode root) {
//        if(root==null) return    true;
//        return isSymmetric(root.left,root.right);
//    }
//    public boolean isSymmetric(TreeNode left,TreeNode right){
//        if(left==null&&right==null){
//            return true;
//
//        }
//        if(left==null||right==null){
//            return false;
//        }
//        boolean leftIsSymmetric=isSymmetric(left.left,right.right);
//        if(left.val!=right.val){
//            return false;
//        }
//        boolean rightIsSymmetric=isSymmetric(left.right,right.left);
//        return leftIsSymmetric&&rightIsSymmetric;
//
//
//    }
//
//
//
//}




/*
JZ28 对称的二叉树
2021.12.8  有误,dai改

*/

//class Solution {
//    boolean isSymmetrical(TreeNode pRoot) {
//        if(pRoot==null) return true;
//        return help(pRoot.left,pRoot.right);
//    }
//
//    boolean help(TreeNode t1,TreeNode t2){
//        if(t1==null&&t2==null) return true;
//        boolean b1=help(t1.right,t2.left);
//        boolean b2=help(t1.left,t2.right);
//        if(t1.val==t2.val) return true;
//        return false;
//    }
//}
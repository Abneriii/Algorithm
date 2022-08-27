package BinaryTree;

/**
 * Author:
 * Created at:2022/7/28
 * Updated at:
 *
 * 236. 二叉树的最近公共祖先
 *
 *
 *
 **/
public class NearestAncestorOfBT {

    /**
     *
     * ----------------2022.8.25------HouAlgo---------------------实现了，通过了。但是好像有待优化
     * TreeNode result=null;
     * NearestAncestorOfBT(){
     *     traverseIfHasTarget(root,false);
     *     return result
     * }
     * traverseIfHasTarget(TreeNode root,boolean found)
     *   leftHasTarget=traverseIfHasTarget(root.left,found)
     *   rightHasTarget=traverseIfHasTarget(root.right,found)
     *   if((root==p&&leftHasTarget)||(root==p&&rightHasTarget)||(root==q&&leftHasTarget)||(root==q&&rightHasTarget)||(左子树含有目标节点&&右子树含有目标节点)||)
     *     if(!found){
     *        result=root;
     *        found=true;
     *    }
     *       return true;
     *    if(rightNow==p||rightNow==q||leftHasTarget||rightHasTarget)
     *       return true;
     *    else
     *       return false;
     *----------------2022.8.25------HouAlgo---------------------
     *
     */


    static class Solution {
        static TreeNode result=null;
        static TreeNode pNode=null;
        static TreeNode qNode=null;
        public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            pNode=p;
            qNode=q;
            traverseIfHasTarget(root,false);
            return result;
        }
        public static boolean traverseIfHasTarget(TreeNode root,boolean found){
            if(root==null) return false;
            boolean leftHasTarget=traverseIfHasTarget(root.left,found);
            boolean rightHasTarget=traverseIfHasTarget(root.right,found);
            if((root==pNode&&leftHasTarget)||(root==qNode&&rightHasTarget)||(leftHasTarget&&rightHasTarget)||(root==qNode&&leftHasTarget)||(root==pNode&&rightHasTarget)){
                if(!found){
                    result=root;
                    found=true;
                }
                return true;
            }
            if(root==pNode||root==qNode||leftHasTarget==true||rightHasTarget==true){
                return true;
            }
            else return false;

        }
    }








}

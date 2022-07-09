package BinaryTree;

/**
 * Author:
 * Created at:2022/7/9
 * Updated at:
 **/
public class MergeTwoBT {
}

//
//class Solution {
//    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
//        if(root1==null&&root2==null) return null;
//        else if(root1==null&&root2!=null) return root2;
//        else if(root2==null&&root1!=null) return root1;
//        else {
//
//            TreeNode trleft=mergeTrees(root1.left,root2.left);
//            TreeNode trright=mergeTrees(root1.right,root2.right);
//            TreeNode tr=new TreeNode(root1.val+root2.val,trleft,trright);
//            return  tr;
//
//        }
//
//
//
//
//
//    }
//}
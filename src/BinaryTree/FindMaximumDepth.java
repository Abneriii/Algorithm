package BinaryTree;

/**
 * Author:
 * Created at:2022/6/20
 * Updated at:
 *
 * problem:https://leetcode.cn/problems/maximum-depth-of-binary-tree/
 *
 **/
public class FindMaximumDepth {



    public static void main(String[] args) {

    }


    /**
     *  2022.6.20:通过。
     */

//    public int maxDepth(TreeNode root) {
//        if(root==null){
//            return 0;
//        }
//        int leftMaxDepth=maxDepth(root.left);
//        int rightMaxDepth=maxDepth(root.right);
//
//        return leftMaxDepth>rightMaxDepth?leftMaxDepth+1:rightMaxDepth+1;
//    }


    /**
     *
     * 2022.6.20---此解法超时，有错。
     *
     */

//    public static int maxDepth(TreeNode root){
//        if(root==null){
//            return 0;
//        }
//        return maxDepth(root.left)>maxDepth(root.right)?maxDepth(root.left)+1:maxDepth(root.right)+1;
//    }

}

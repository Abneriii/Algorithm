package BinaryTree;

/**
 * Author:
 * Created at:2022/6/20
 * Updated at:
 *
 * problem:https://leetcode.cn/problems/maximum-depth-of-binary-tree/
 *
 **/
public class MaximumDepthOfBT {



    public static void main(String[] args) {

    }


    /**
     *  2022.6.20:通过。
     *  此解法是Bottom-up解法
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

/**
 *
 * 2022.6.20--没有想到这个解法。这是Top--Down法。
 *
 */

//
//class Solution {
//    private int answer;
//    public int maxDepth(TreeNode root) {
//        maxDepth(root,1);
//        return answer;
//    }
//    private void maxDepth(TreeNode root,int depth){
//        if(root==null){
//            return ;
//        }
//        if(root.left==null&&root.right==null){
//            answer=answer>depth?answer:depth;
//        }
//        maxDepth(root.left,depth+1);
//        maxDepth(root.right,depth+1);
//
//    }
//}



//NK.BM28 二叉树的最大深度
//mineSF"每个节点比较左右两个子节点的深度，将深度更大的数量返回."---2022.2.25

// class Solution {
//    /**
//     *
//     * @param root TreeNode类
//     * @return int整型
//     */
//    public int maxDepth (TreeNode root) {
//        // write code here
//        if(root==null) return 0;
//        int left=maxDepth(root.left);
//        int right=maxDepth(root.right);
//        return  left>right? left+1:right+1;
//
//    }
//}


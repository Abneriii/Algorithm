package BinaryTree;

/**
 * Author:
 * Created at:2022/7/9
 * Updated at:
 *
 *
 *111. 二叉树的最小深度
 * https://leetcode.cn/problems/minimum-depth-of-binary-tree/
 **/
public class MinimumDepthOfBT {

}

/**
 * //2022.2.28---解法有误----HouSF：”如果根节点左右子树都不为空，那就计算左右子树的最短路径，
 * 然后选其中最小的返回。如果根节点有一个子树为空，那就对非空的计算最短路径，再直接返回“-----算法有误：不是哪一个子树深度小就返回哪一个，而是要得到叶子节点。
 */

class Solution111 {
    public int minDepth(TreeNode root) {

        /**
         *
         * @param root TreeNode类
         * @return int整型
         */

        // write code here

        //
        int mindepth=0;
        if(root==null) return mindepth;
        if(root.right==null&&root.left==null) return 1;
        if(root.right==null&&root.left!=null){
            mindepth=minDepthHelp(root.left);
            return mindepth+1;

        }
        if(root.left==null&&root.right!=null){
            mindepth=minDepthHelp(root.right);
            return mindepth+1;
        }
        if(root.left!=null&&root.right!=null){
            int leftmin=minDepthHelp(root.left);
            int rightmin=minDepthHelp(root.right);
            return leftmin<rightmin?leftmin+1:rightmin+1;
        }
        return 0;

    }

    public int minDepthHelp(TreeNode node){
        if(node==null) return 0;
        int leftmin=minDepthHelp(node.left);
        int rightmin=minDepthHelp(node.right);
        return leftmin<rightmin?leftmin+1:rightmin+1;


    }
}



//LC.111. 二叉树的最小深度
//mineSF:"每个节点比较左右两个子节点的深度，将深度更小的数量返回"--2022.2.25--解法有错--最节点和最小节点不同
//class Solution {
//    public int minDepth(TreeNode root) {
////LC.111. 二叉树的最小深度
////mineSF:"每个节点比较左右两个子节点的深度，将深度更小的数量返回"--2022.2.25--解法有错--最节点和最小节点不同
//        /**
//         *
//         * @param root TreeNode类
//         * @return int整型
//         */
//
//        // write code here
//        if(root==null) return 0;
//        int left=minDepth(root.left);
//        int right=minDepth(root.right);
//        return  left<right? left+1:right+1;
//
//    }
//}
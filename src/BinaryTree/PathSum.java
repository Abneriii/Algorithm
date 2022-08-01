package BinaryTree;

/**
 * Author:
 * Created at:2022/6/22
 * Updated at:
 *
 *
 * Leetcode112路径总和:https://leetcode.cn/problems/path-sum/:给你二叉树的根节点root
 *                 和一个表示目标和的整数targetSum 。
 *                判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和targetSum 。
 *                 如果存在，返回 true ；否则，返回 false 。
 *  JZ82 二叉树中和为某一值的路径(一)
 *
 * 2022.6.22---5min---No idea.
 **/
public class PathSum {


    /**
     * Hou:如果当前为叶子节点，则判断路径总和是否等于目标值，否则就求左边节点为根节点的路径总和、右边节点为根节点的路径总和
     *
     * 2022.6.22---解法有误。------todo分析错因
     */

    static class Solution1 {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if(root==null){
                return false;
            }
            return hasPathSum(root,root.val,targetSum);
        }
        public boolean hasPathSum(TreeNode root,int rightNowSum,int targetSum){
            if(root==null){
                return false;
            }
            if(root.left==null&&root.right==null){
                if(rightNowSum+root.val==targetSum){
                    return true;
                }else{
                    return false;
                }
            }
            hasPathSum(root.left,rightNowSum+root.val,targetSum);
            hasPathSum(root.right,rightNowSum+root.val,targetSum);
            return false;
        }

    }

    /**
     *Hou---算法有误
     */
    static class Solution2{

            /**
             *
             * @param root TreeNode类
             * @param sum int整型
             * @return bool布尔型
             */
            public boolean hasPathSum (TreeNode root, int sum) {
                // write code here
                int realsum=0;
                Integer flag=new Integer(0);
                hasPathSum(root,sum,realsum,flag);
                if(flag==1){
                    return true;
                }
                return false;

            }
            public int hasPathSum(TreeNode root,int sum,int realsum,Integer flag){
                if(root==null){
                    return 0;
                }
                realsum+=root.val;
                hasPathSum(root.left,sum,realsum,flag);
                hasPathSum(root.right,sum,realsum,flag);
                if(root.left==null&&root.right==null){
                    if(realsum==sum){
                        flag=1;
                        return 1;

                    }
                }
                return 0;

            }


        }




}

package BinaryTree;

/**
 * Author:
 * Created at:2022/7/9
 * Updated at:
 *
 *
 * 剑指 Offer 27. 二叉树的镜像
 * https://leetcode.cn/problems/er-cha-shu-de-jing-xiang-lcof/
 *
 *
 * 226. 翻转二叉树
 *https://leetcode.cn/problems/invert-binary-tree/
 *
 *
 **/
public class MirrorImageOfBT {
}


/**
 * 做出这道题的日期：2022.1.16
 * //        mine思路：后序遍历法遍历原树，并且交换两个子节点
 * //        运行时间：123ms超过13.71% 用Java提交的代码  占用内存：16356KB超过5.86%用Java提交的代码
 *
 *
 */
 class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param pRoot TreeNode类
     * @return TreeNode类
     */
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if(pRoot==null){
            return pRoot;//return啥无所谓？
        }
        Mirror(pRoot.left);
        Mirror(pRoot.right);
        TreeNode helpnode=new TreeNode(0);
        helpnode=pRoot.left;
        pRoot.left=pRoot.right;
        pRoot.right=helpnode;
        return pRoot;
    }


}

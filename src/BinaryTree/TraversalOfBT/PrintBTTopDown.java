package BinaryTree.TraversalOfBT;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Author:
 * Created at:2022/7/29
 * Updated at:
 *
 *
 * JZ32 从上往下打印二叉树
 *
 *
 **/
public class PrintBTTopDown {


    /**
     * 2021.12.8--Hou---做出 运行时间：51ms超过0.36% 用Java提交的代码占用内存：10936KB超过1.72%用Java提交的代码
     * 有待优化
     */
    static class Solution1{
        public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
            Queue<TreeNode> queue=new LinkedList<>();
            ArrayList<Integer> array=new ArrayList<>();
            if(root==null) return array;
            queue.add(root);

            while(!queue.isEmpty()){
                TreeNode help=queue.poll();
                array.add(help.val);
                if(help.left!=null){
                    queue.add(help.left);
                }
                if(help.right!=null){
                    queue.add(help.right);
                }

            }
            return array;
        }
    }
}

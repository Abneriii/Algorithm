package BinaryTree.TraversalOfBT;

import java.util.*;

/**
 * Author:
 * Created at:2022/7/27
 * Updated at:
 *
 *
 * JZ77 按之字形顺序打印二叉树
 *
 *
 *
 * JZ77----按之字形顺序打印二叉树---《剑指offer》书题解：申请了两个辅助栈，偶数层或是奇数层，
 * 分别以不同的遍历孩子的顺序，将孩子放入相应的栈中，
 *
 *
 *
 *
 **/
public class ZhiTraversalOfBT {

    /**
     * 2022.7.27---Hou----第一下想到的就是：复用层序遍历，再将奇数层倒序。这样一定能求出来，但是感觉直接有点麻烦。
     */

    static class Solution1 {
//        public static ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
//
//        }

    }

    /**
     *2021.12.16，mine想法：本题是在层次遍历的基础上的。层次遍历思路：将树的头结点放入一个栈，出栈的同时放入其子节点，此此循环。本题核心在于要能将一层元素的放入一个数组中，所以每次本层的出栈完毕后，计算一下此时栈中的总共元素，以此作为下一层开的出栈次数限制，保证一层的都能到一个数组中。则只要利用一个记录层数的变量，在当层数为偶数时，反转一下再放入最终数组即可。
     * 运行时间：72ms超过5.79% 用Java提交的代码 占用内存：11352KB 超过10.53%用Java提交的代码
     */

    static class Solution2 {
        public static ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
            ArrayList<ArrayList<Integer>> res=new ArrayList<>();
            if(pRoot==null) return res;
            Deque<TreeNode> help=new LinkedList<TreeNode>();
            help.add(pRoot);
            int layer=0;
            while(!help.isEmpty()){
                int layer_count=help.size();
                layer++;
                ArrayList<Integer> layernode=new ArrayList<Integer>();
                for(int i=0;i<layer_count;i++){
                    TreeNode node=help.pop();
                    if(node.left!=null)
                        help.add(node.left);
                    if(node.right!=null)
                        help.add(node.right);

                    layernode.add(node.val);

                }
                if(layer%2==0) Collections.reverse(layernode);
                res.add(layernode);

            }
            return res;

        }
    }
}
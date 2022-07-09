package BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:
 * Created at:2022/7/6
 * Updated at:
 *
 *
 * 501. 二叉搜索树中的众数
 *
 *
 **/
public class FindModeInBST {

    /**
     * 2022.4.14:Hou:思路:中序遍历BST，遍历过程中将出现次数最大的节点值放入数组中。用代码实现了，通过了。
     */

    class Solution {
        int maxAccount=0;
        int currentValue=-100000;
        int currentValueAcount=0;
        List<Integer> res=new ArrayList<>();
        public int[] findMode(TreeNode root) {
            //中序遍历BST，遍历过程中将出现次数最大的节点值放入数组中
            dfs(root);
            int[] result=new int[res.size()];
            for(int i=0;i<result.length;i++){
                result[i]=res.get(i);
            }
            return result;

        }

        public void dfs(TreeNode root){
            if(root==null){
                return;
            }
            dfs(root.left);
            if(root.val==currentValue){
                currentValueAcount++;
            }
            if(root.val!=currentValue){
                currentValue=root.val;
                currentValueAcount=1;
            }
            if(currentValueAcount>maxAccount){
                res.clear();
                res.add(currentValue);
                maxAccount=currentValueAcount;
            }
            else{
                if(currentValueAcount==maxAccount){
                    res.add(currentValue);
                }
            }
            dfs(root.right);
            return;

        }





    }


}

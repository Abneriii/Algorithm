package BinaryTree;

/**
 * Author:
 * Created at:2022/7/6
 * Updated at:
 *
 *
 * //LC.701.二叉搜索树中的插入操作
 **/
public class InsertValueToBST {


    /**
     * //2022.3.7--做出来了。
     */
    class Solution {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            //将节点插入合适的位置，
            //
            TreeNode newnode=new TreeNode(val);
            TreeNode node=root;
            while(root!=null){
                if(val>node.val&&node.right==null){
                    node.right=newnode;
                    return root;
                }
                if(val>node.val&&node.right!=null){
                    node=node.right;
                }
                if(val<node.val&&node.left==null){
                    node.left=newnode;
                    return root;
                }
                if(val<node.val&&node.left!=null){
                    node=node.left;

                }

            }
            return newnode;

        }
    }
}

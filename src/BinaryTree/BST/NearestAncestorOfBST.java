package BinaryTree.BST;



/**
 * Author:
 * Created at:2022/7/6
 * Updated at:
 *
 *
 * //LC.235.二叉搜索树的最近公共祖先
 *
 *
 **/
public class NearestAncestorOfBST {
    /**
     *2022.3.7:自己没思路，看了题解思路，自己实现的代码.
     *
     *
     *
     *
     */

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            //
            if(p.val>q.val){
                TreeNode m=p;
                p=q;
                q=m;
            }
            TreeNode node=root;
            while(node!=null){
                if(node.val>=p.val&&node.val<=q.val){
                    return node;
                }
                if(node.val>p.val&&node.val>q.val){
                    node=node.left;
                }
                if(node.val<p.val&&node.val<q.val){
                    node=node.right;
                }
            }
            return null;



        }
    }
}

package BinaryTree.TraversalOfBT;

/**
 * Author:
 * Created at:2022/7/9
 * Updated at:
 *
 *
 * https://leetcode.cn/problems/binary-tree-inorder-traversal/
 *
 *94. 二叉树的中序遍历
 *
 **/
public class InorderTraversalOfBT {
}



//非递归中序遍历二叉树。2022.2.24做出。
//class Solution {
//    public List<Integer> inorderTraversal(TreeNode root) {
//        Deque<TreeNode> stack=new LinkedList<>();
//        List<Integer> res=new ArrayList<>();
//        if(root==null) return res;
//        TreeNode node=root;
//        while(!stack.isEmpty()||node!=null){
//            if(node!=null){
//                stack.push(node);
//                node=node.left;
//            }
//            else{
//                node=stack.pop();
//                res.add(node.val);
//                node=node.right;
//            }
//        }
//        return res;
//
//
//    }
//}
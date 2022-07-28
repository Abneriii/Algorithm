package BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:
 * Created at:2022/7/28
 * Updated at:
 *
 *
 * JZ54 二叉搜索树的第k个节点
 *
 *
 *
 *
 **/
public class KthNodeOfBST {


    /**
     * 2022.7.28---通过--Hou--调用中序遍历，然后返回第k个节点。
     */
    static class Solution1 {
        static List<Integer> nodes = new ArrayList<>();

        public static int KthNode(TreeNode proot, int k) {
            if(proot==null||k==0){
                return -1;
            }
            inorderTraversal(proot);
            if(nodes.size()<k){
                return -1;
            }
            return nodes.get(k-1);
        }

        private static void inorderTraversal(TreeNode root) {
            if (root == null) {
                return ;
            }
            inorderTraversal(root.left);
            nodes.add(root.val);
            inorderTraversal(root.right);
            return;
        }

        public static void main(String[] args) {
            TreeNode root=SerializeAndDeserializeBinaryTree.deserialize("5,3,2,None,None,4,None,None,7,6,None,None,8,None,None");
            System.out.println(KthNode(root,3));
        }
    }
}

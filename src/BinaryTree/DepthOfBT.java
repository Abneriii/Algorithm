package BinaryTree;

/**
 * Author:
 * Created at:2022/7/27
 * Updated at:
 **/
public class DepthOfBT {

    /**
     * 2022.7.27---Hou--当前节点的左右两节点的深度的最大值+1
     */
    static class Solution1{
        public static  int TreeDepth(TreeNode root) {
            if(root==null){
                return 0;
            }
            int leftDepth=TreeDepth(root.left);
            int rightDepth=TreeDepth(root.right);

            return Math.max(leftDepth,rightDepth)+1;
        }

        public static void main(String[] args) {
            TreeNode treeNode=SerializeAndDeserializeBinaryTree.deserialize("1,2,4,None,None,5,7,None,None,None,3,None,6,None,None");
            System.out.println(TreeDepth(treeNode));
        }
    }


}


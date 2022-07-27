package BinaryTree.TraversalOfBT;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Author:
 * Created at:2022/7/9
 * Updated at:
 *
 * 102. 二叉树的层序遍历：https://leetcode.cn/problems/binary-tree-level-order-traversal/
 *
 *
 *
 *
 **/
public class LevelOrderTraversalOfBT {
    /**
     * //2022.2.25---自己实现。要点：层序遍历，应该借助队列，而不是栈。
     */


    class Solution1 {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res=new ArrayList<>();
            if(root==null) return res;
            int thisLayer=1;
            Queue<TreeNode> queue=new LinkedList<>();
            queue.offer(root);
            while(!queue.isEmpty()){
                int nextLayer=0;
                List<Integer> layer=new ArrayList<>();
                for(int i=0;i<thisLayer;i++){
                    TreeNode node=queue.poll();
                    layer.add(node.val);
                    if(node.left!=null){
                        queue.offer(node.left);
                        nextLayer++;
                    }
                    if(node.right!=null){
                        queue.offer(node.right);
                        nextLayer++;
                    }

                }
                thisLayer=nextLayer;
                res.add(layer);

            }
            return res;
        }
    }


    /**
     *2022.7.27--通过-----Hou---队列出对队得节点，节点加入其所在层的集合中，再将其左右非空的节点加入队列，
     *
     *
     */
    static class Solution2 {
        static int newLevelNodeCounts;
        static int oldLevelNodeCounts;
        static List<List<Integer>> list;
        public static  List<List<Integer>> levelOrder(TreeNode root) {
            if(root==null){
                return new ArrayList<>();
            }
            Queue<TreeNode> queue=new LinkedList();
            queue.add(root);
            oldLevelNodeCounts=1;
             list=new ArrayList();
            levelOrderHelper(queue,root,list);
            return list;
        }
        private  static void levelOrderHelper(Queue<TreeNode > queue,TreeNode root,List<List<Integer>> list){

            while(!queue.isEmpty()){
                List<Integer> levelNodes=new ArrayList<>();
                for(int i=0;i<oldLevelNodeCounts;i++){
                    TreeNode treeNode=queue.poll();
                    levelNodes.add(treeNode.val);
                    if(treeNode.left!=null){
                        newLevelNodeCounts++;
                        queue.add(treeNode.left);
                    }
                    if(treeNode.right!=null){
                        newLevelNodeCounts++;
                        queue.add(treeNode.right);
                    }
                }
                list.add(levelNodes);
                oldLevelNodeCounts=newLevelNodeCounts;
                newLevelNodeCounts=0;
            }

        }

        public static void main(String[] args) {
            TreeNode treeNode= SerializeAndDeserializeBinaryTree.deserialize("3,9,None,None,20,15,None,None,7,None,None");
            levelOrder(treeNode);
            System.out.println(list.toString());
            
        }


    }



}



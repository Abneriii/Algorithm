package BinaryTree;

/**
 * Author:
 * Created at:2022/7/9
 * Updated at:
 **/
public class LevelOrderTraversalOfBT {
}

/**
 * //2022.2.25---自己实现。要点：层序遍历，应该借助队列，而不是栈。
 */
//class Solution {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> res=new ArrayList<>();
//        if(root==null) return res;
//        int thisLayer=1;
//        Queue<TreeNode> queue=new LinkedList<>();
//        queue.offer(root);
//        while(!queue.isEmpty()){
//            int nextLayer=0;
//            List<Integer> layer=new ArrayList<>();
//            for(int i=0;i<thisLayer;i++){
//                TreeNode node=queue.poll();
//                layer.add(node.val);
//                if(node.left!=null){
//                    queue.offer(node.left);
//                    nextLayer++;
//                }
//                if(node.right!=null){
//                    queue.offer(node.right);
//                    nextLayer++;
//                }
//
//            }
//            thisLayer=nextLayer;
//            res.add(layer);
//
//        }
//        return res;
//
//
//
//
//
//
//    }
//}

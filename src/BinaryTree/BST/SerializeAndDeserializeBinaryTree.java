package BinaryTree.BST;

import BinaryTree.BST.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Author:力扣官方题解
 * Created at:2022/7/6
 * Updated at:
 *
 *
 *
 * 297. 二叉树的序列化与反序列化:https://leetcode.cn/problems/serialize-and-deserialize-binary-tree/
 *
 *这个解法是深度遍历法
 *
 **/
public class SerializeAndDeserializeBinaryTree {


        public static String serialize(TreeNode root) {
            return rserialize(root, "");
        }

        public static TreeNode deserialize(String data) {
            String[] dataArray = data.split(",");
            List<String> dataList = new LinkedList<String>(Arrays.asList(dataArray));
            return rdeserialize(dataList);
        }

        public static String rserialize(TreeNode root, String str) {
            if (root == null) {
                str += "None,";
            } else {
                str += str.valueOf(root.val) + ",";
                str = rserialize(root.left, str);
                str = rserialize(root.right, str);
            }
            return str;
        }

        public static TreeNode rdeserialize(List<String> dataList) {
            if (dataList.get(0).equals("None")) {
                dataList.remove(0);
                return null;
            }

            TreeNode root = new TreeNode(Integer.valueOf(dataList.get(0)));
            dataList.remove(0);
            root.left = rdeserialize(dataList);
            root.right = rdeserialize(dataList);

            return root;
        }

    public static void main(String[] args) {
        TreeNode treeNode=SerializeAndDeserializeBinaryTree.deserialize("1,2,3");

    }

}

package LinkedList;

/**
 * Author:
 * Created at:2022/8/8
 * Updated at:
 *
 *
 *
 * 206. 反转链表
 **/
public class ReverseLinkedList {

    /**
     *
     *
     * 2022.8.16---HouAlgorithm-----------通过了
     * while(current!=null){
     *    nextNode=current.next
     *    currentNode.next=previousNode;
     *    currentNode=nextNode;
     *    previous=current;
     * }
     * return previousNode;
     *2022.8.16---HouAlgorithm-----------
     *
     */
    static class Solution3{
        public static void main(String[] args) {
            int[] arr=new int[]{1,2,3,4,5};

        }
        public static ListNode reverseList(ListNode head) {
            ListNode previousNode=null;
            ListNode currentNode=head;
            while(currentNode!=null){
                ListNode nextNode=currentNode.next;
                currentNode.next=previousNode;
                previousNode=currentNode;
                currentNode=nextNode;
            }
            return previousNode;
        }




    }


    /*
    NC78.反转链表
    2022.3.17：Hou:"想到用递归的方法，但没想出算法思路"-------看题解，懂了，自己代码实现了，写代码过程并不顺利，dai复习。

    */
    static class Solution1 {
        ListNode newHead;
        public ListNode reverseList(ListNode head) {
            newHead =head;
            reverseList2(head);
            return newHead;

        }


        public ListNode reverseList2(ListNode node){
            if(node==null){
                return null;
            }
            if(node.next==null){
                newHead=node;
                return node;
            }
            node.next=reverseList2(node.next);
            node.next.next=node;
            node.next=null;
            return node;
        }

    }

/**
 *
 *
 * dai---以下为官方题解，不太理解，有个疑问：我咋感觉这个解法返回的newHead还是原链表的第一个结点。
 *
 */

    static class Solution2 {
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode newHead = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }
    }

}

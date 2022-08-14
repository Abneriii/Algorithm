package LinkedList;

/**
 * Author:
 * Created at:2022/8/13
 * Updated at:
 *
 * 24. 两两交换链表中的节点
 *
 *
 **/
public class SwapLinkedListNodesInPairs {


    /**
     * 力扣官方题解
     *
     * 2022.8.3--看懂了
    */
    static class Solution {
        public ListNode swapPairs(ListNode head) {
            ListNode dummyHead = new ListNode(0);
            dummyHead.next = head;
            ListNode temp = dummyHead;
            while (temp.next != null && temp.next.next != null) {
                ListNode node1 = temp.next;
                ListNode node2 = temp.next.next;
                temp.next = node2;
                node1.next = node2.next;
                node2.next = node1;
                temp = node1;
            }
            return dummyHead.next;
        }
    }

}

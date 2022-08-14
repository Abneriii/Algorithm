package LinkedList;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Author:
 * Created at:2022/8/13
 * Updated at:
 *
 *  19. 删除链表的倒数第 N 个结点
 **/
public class RemoveNthNodeFromEndOfList {


    /**
     * 力扣额题解：借助栈求解
     *
     * 2022.8.13--看懂了
     */
    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(0, head);
            Deque<ListNode> stack = new LinkedList<ListNode>();
            ListNode cur = dummy;
            while (cur != null) {
                stack.push(cur);
                cur = cur.next;
            }
            for (int i = 0; i < n; ++i) {
                stack.pop();
            }
            ListNode prev = stack.peek();
            prev.next = prev.next.next;
            ListNode ans = dummy.next;
            return ans;
        }
    }





}

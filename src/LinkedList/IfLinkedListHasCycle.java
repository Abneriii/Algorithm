package LinkedList;

/**
 * Author:
 * Created at:2022/8/22
 * Updated at:
 *
 * 141. 环形链表
 *
 *
 *
 *
 **/
public class IfLinkedListHasCycle {

    /**
     *
     *
     *
     * ------2022.8.22------HouAlgo---算法思路正确，下方的算法伪代码已经接近于实际代码了，这个实现的过程有点不够直观，dai优化---------------
     * input：ListNode head
     * 快慢指针法:慢指针一次走一个，快指针一次走两个，如果两个碰到了，就说明有环，如果没碰到就说明没环。
     * if head==null return false;
     * ListNode slow;ListNode fast;
     * slow=head;fast=head.next;
     * while(fast!=null&&fast!=slow){
     *     slow=slow.next;
     *     if(fast.next==null) return false;
     *     else fast=fast.next;
     *     if(fast==slow) return true;
     *     if(fast!=null) fast=fast.next;
     * }
     * if(fast==null) return false;
     * else return true;
     *--------2022.8.22-----------------------------------
     *
     *
     *
     *
     */

    static class Solution1 {
        public static boolean hasCycle(ListNode head) {
            if(head==null) return false;
            ListNode slow=head;
            ListNode fast=head.next;
            while(fast!=null&&fast!=slow){
                slow=slow.next;
                if(fast.next==null) return false;
                else fast=fast.next;
                if(fast==slow) return true;
                if(fast!=null) fast=fast.next;
            }
            if(fast==null) return false;
            else return true;
        }
    }



}

package LinkedList;

/**
 * Author:
 * Created at:2022/8/19
 * Updated at:
 *
 * 21. 合并两个有序链表
 *
 *
 *
 * 2022.8.22----不会---------这题值得再反复体会。
 *
 **/
public class MergeTwoSortedLinkedLists {

    public static void main(String[] args) {

    }
    /**
     *
     *力扣官方题解。
     *
     * 2022.8.22---看懂了。
     *
     */
    static class Solution1{
            public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
                if (l1 == null) {
                    return l2;
                } else if (l2 == null) {
                    return l1;
                } else if (l1.val < l2.val) {
                    l1.next = mergeTwoLists(l1.next, l2);
                    return l1;
                } else {
                    l2.next = mergeTwoLists(l1, l2.next);
                    return l2;
                }
        }

    }







    /**
     *
     *
     * 2022.8.19----HouAlgo------写出了算法，实现不下去了，算法有问题，没有写成伪代码，以至于不知道是否能实现.------算法有问题。---------------------------------------------
     * input:list1;list2
     *
     * currentNode1;nextNode1;currentNode2;nextNode2
     *
     * while(currentNode1!=null&&currentNode2!=null)
     *    currentNode1和nextNode1搭配移动到currentNode1大于crrentNode2为止,并链接
     *    currentNode2和nextNode2搭配移动到currentNode2大于currentNode1为之，并链接
     *
     * ---------------------------------------------------
     *
     */

}

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
 **/
public class MergeTwoSortedLinkedLists {

    /**
     *
     *
     * 2022.8.19----HouAlgo------写出了算法，实现不下去了，算法有问题，没有写成伪代码，以至于不知道是否能实现---------------------------------------------
     * input:list1;list2
     *
     * currentNode1;nextNode1;currentNode2;nextNode2
     *
     * while(currentNode1!=null&&currentNode2!=null)
     *    currentNode1和nextNode1搭配移动到currentNode1小于crrentNode2为止,并链接
     *    currentNode2和nextNode2搭配移动到currentNode2小于currentNode1为之，并链接
     *
     * ---------------------------------------------------
     *
     */

//
//    class Solution1 {
//        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//            ListNode currentNode1=list1;
//            ListNode nextNode1=list1.next;
//            ListNode currentNode2=list2;
//            ListNode nextNode2=list2.next;
//            while(currentNode1!=null&&currentNode2!=null){
//                    while(currentNode1.val<=currentNode2.val){
//                        currentNode1=nextNode1;
//                        if(nextNode1==null){
//                            break;
//                        }
//                        nextNode1=nextNode1.next;
//                    }
//
//                    while(currentNode2.val<=currentNode1.val){
//                        currentNode2=nextNode2;
//                        if(nextNode2==null){
//                            break;
//                        }
//                        nextNode2=nextNode2.next;
//                    }
//            }
//
//        }
//
//
//
//    }
//
//

}

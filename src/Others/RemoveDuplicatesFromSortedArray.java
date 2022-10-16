package Others;

/**
 * Author:
 * Created at:2022/10/16
 * Updated at:
 *
 * 26. 删除有序数组中的重复项
 *
 **/
public class RemoveDuplicatesFromSortedArray {

    /**
     *
     *2022.10.16---HouAlgo---------通过了
     * p、q指向第一个元素,q移动到不等于p的值的位置停下来，
     * 然后将q位置的值，赋给p+1处的值，同时p++
     *
     * p和q的值为0
     * while(q<nums.length){
     *     if(nums[q]!=nums[p]){
     *         nums[p+1]=nums[q];
     *         p++;
     *     }
     *     q++;
     * }
     *-------------------------------
     */
    static class Solution {
        public int removeDuplicates(int[] nums) {
             int p=0;
             int q=0;
             while(q< nums.length){
                 if(nums[q]!=nums[p]){
                     nums[p+1]=nums[q];
                     p++;
                 }
                 q++;
             }
             return p+1;
        }
    }



}


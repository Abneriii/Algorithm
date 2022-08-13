package Others4;

import java.util.Arrays;

/**
 * Author:
 * Created at:2022/8/8
 * Updated at:
 *
 * 300. 最长递增子序列
 *给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
 * 子序列是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。
 * 例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。
 *
 *
 **/
public class LongestIncreasingSubsequence {

    /**
     * 2022.8.12----HouAlgorithm---通过了。
     *
     * HouAlgorithm如下。受128.最长连续序列算法启发。
     *
     *
     * input：nums[k]
     * 以nums[i]为结尾的最长递增子序列的长度为numsHelper[i]
     * int []numsHelper
     * longestNum=1;
     * for nums[i]=nums[0] to nums[k-1]
     *     for nums[j]=nums[i] to nums[0]
     *         if(nums[j]<nums[i])
     *             longestNum=max(numsHelper[j],longestNum);
     *     numsHelper[i]=longestNum+1;
     * return max(numsHelper);
     *
     *
     *
     */
    static class Solution2{

        public static void main(String[] args) {
//            int[] nums=new int[]{100,4,200,1,3,2};
//            int[] nums=new int[]{0,1,0,3,2,3};
//            int[] nums=new int[]{10,9,2,5,3,7,101,18};
            int[] nums=new int[]{4,10,4,3,8,9};
            System.out.println(lengthOfLIS(nums));
        }
        public static int lengthOfLIS(int[] nums) {
         int[] numsHelper=new int[nums.length];
         int longestSeq=0;
         for(int i=0;i<nums.length;i++){
             for(int j=i;j>=0;j--){
                 if(nums[j]<nums[i]){
                     longestSeq=Math.max(numsHelper[j],longestSeq);
                 }
             }
             numsHelper[i]=longestSeq+1;
             longestSeq=0;
         }
         Arrays.sort(numsHelper);
         return numsHelper[numsHelper.length-1];
        }
    }



    /**
 *     LC.300.最长递增子序列
 * 2022.3.19:Hou：想出了暴力方法，但是实现完后发现算法有问题。------看了题解的方法，看懂了，自己代码实现了。
 *
 *
 */


    static class Solution1 {

        public int lengthOfLIS(int[] nums) {
            int[] dp=new int[nums.length];
            dp[0]=1;
            for(int i=1;i<nums.length;i++){
                dp[i]=1;
                for(int j=0;j<i;j++){
                    if(nums[j]<nums[i]){
                        dp[i]=Math.max(dp[j]+1,dp[i]);
                    }
                }
            }
            Arrays.sort(dp);
            return dp[dp.length-1];

        }

    }
}

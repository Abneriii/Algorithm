package Others;

/**
 * Author:
 * Created at:2022/7/29
 * Updated at:
 *
 *
 * 53. 最大子数组和:https://leetcode.cn/problems/maximum-subarray/
 *
 *
 **/
public class MaxSubArraySum {


/*

LC.53.最大子数组和
2022.3.21:做出。

*/

    static class Solution {
        public int maxSubArray(int[] nums) {
            //dp[i]代表以nums[i]为结尾的连续子数组和的最大值
            int lastIndex=nums.length-1;
            int[] dp=new int[nums.length];
            dp[0]=nums[0];
            int max=nums[0];
            for(int i=1;i<nums.length;i++){
                dp[i]=Math.max(nums[i],dp[i-1]+nums[i]);
                if(dp[i]>max){
                    max=dp[i];
                }
            }
            return max;
        }
    }




}

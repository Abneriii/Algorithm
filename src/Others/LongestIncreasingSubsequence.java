package Others;

import java.util.Arrays;

/**
 * Author:
 * Created at:2022/8/8
 * Updated at:
 *
 * 300. 最长递增子序列
 *
 *
 *
 **/
public class LongestIncreasingSubsequence {
/**
 *
 *
 *
 *     LC.300.最长递增子序列
 * 2022.3.19:Hou：想出了暴力方法，但是实现完后发现算法有问题。------看了题解的方法，看懂了，自己代码实现了。
 *
 *
 */


    static class Solution {

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

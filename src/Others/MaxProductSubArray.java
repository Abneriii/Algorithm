package Others;

import java.util.Arrays;

/**
 * Author:
 * Created at:2022/8/12
 * Updated at:
 *
 * 152. 乘积最大子数组
 *
 *
 *
 **/
public class MaxProductSubArray {


    /**
     *
     *
     * 力扣官方题解
     *
     * 2022.8.12---看懂了。
     *
     *
     */
    static class Solution1 {
        public int maxProduct(int[] nums) {
            int length = nums.length;
            int[] maxF = new int[length];
            int[] minF = new int[length];
            System.arraycopy(nums, 0, maxF, 0, length);
            System.arraycopy(nums, 0, minF, 0, length);
            for (int i = 1; i < length; ++i) {
                maxF[i] = Math.max(maxF[i - 1] * nums[i], Math.max(nums[i], minF[i - 1] * nums[i]));
                minF[i] = Math.min(minF[i - 1] * nums[i], Math.min(nums[i], maxF[i - 1] * nums[i]));
            }
            int ans = maxF[0];
            for (int i = 1; i < length; ++i) {
                ans = Math.max(ans, maxF[i]);
            }
            return ans;
        }
    }

    /**
     *
     * dp[i]表示以nums[i]为末尾的子数组的最大的乘积
     * dp[i]=max{dp[i-1]*nums[i],nums[i]}
     * nums1={2,3,4,5}
     *      若以这种方法：dp={2,6,24,120} √
     * nums2={-2,-3,4,5}
     *    若以这种方法： dp={-2,6,24,120} √
     * nums3={-2,3,-4,5}
     *     若以这种方法：dp={-2,3,-4,5} ×
     *     正确答案：dp={-2,3,24,120}----因为-4为一个负值，要想求以-4为末尾的最大值，应该是与前一个数为末尾的最小值相乘
     * 所以dp[i]=max{dp[i-1]*nums[i],nums[i]}这种方法不对
     *     if nums[i]<=0
     *        dpMax[i]=max(dpMin[i-1]*nums[i],nums[i])
     *        dpMin[i]=min(dpMax[i-1]*nums[i],nums[i])
     *     if  nums[i]>0
     *        dpMax[i]=max(dpMax[i-1]*nums[i],nums[i])
     *        dpMin[i]=min(dpMin[i-1]*nums[i],nums[i])
     *  return max(dpMax)
     *
     */
    static class Solution2{
            public int maxProduct(int[] nums) {
                int[] dp=new int[nums.length];
                int[] dpMin=new int[nums.length];
                int[] dpMax=new int[nums.length];
                dpMin[0]=nums[0];
                dpMax[0]=nums[0];
                for(int i=1;i<nums.length;i++){
                    if(nums[i]<=0){
                        dpMax[i]=Math.max(dpMin[i-1]*nums[i],nums[i]);
                        dpMin[i]=Math.min(dpMax[i-1]*nums[i],nums[i]);
                    }
                    else{
                        dpMax[i]=Math.max(dpMax[i-1]*nums[i],nums[i]);
                        dpMin[i]=Math.min(dpMin[i-1]*nums[i],nums[i]);
                    }
                }
                Arrays.sort(dpMax);
                return dpMax[nums.length-1];
            }

    }

}

package Others;

/**
 * Author:
 * Created at:2022/8/8
 * Updated at:
 *
 * JZ42 连续子数组的最大和
 *
 *
 *
 **/
public class MaxNumSumOfSubArray {


    public class Solution1 {
        public int FindGreatestSumOfSubArray(int[] array) {

//NC.19.连续子数组的最大和
//2022.3.11---Hou：暴力法，算法应该没问题，但是不通过，因为暴力法超时。
            int max=array[0];
            for(int i=0;i<array.length;i++){
                int maxpart=array[i];
                int sum=0;
                for(int j=i;j<array.length;j++){
                    sum+=array[j];
                    maxpart=Math.max(sum,maxpart);
                }
                max=Math.max(maxpart,max);
            }
            return max;

        }





    }

    static class Solution2{
        /*NC.19.连续子数组的最大和
        2022.3.11----不会做，看题解，别人的方法：动态规划法,感觉不错。懂了。
        2022.3.12----运用动态规划法，自己代码实现了。
        */
        public int FindGreatestSumOfSubArray(int[] array) {
            int[] dp = new int[array.length];
            int max = array[0];
            dp[0] = array[0];
            for(int i=1;i<array.length;i++){
                // 动态规划，状态转移方程，确定dp[i]的最大值
                dp[i] = Math.max(dp[i-1] + array[i], array[i]);
                // 每次比较，保存出现的最大值
                max = Math.max(max,dp[i]);
            }
            return max;
        }

    }




}

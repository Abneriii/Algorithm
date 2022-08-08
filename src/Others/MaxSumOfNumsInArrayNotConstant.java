package Others;

/**
 * Author:
 * Created at:2022/8/8
 * Updated at:
 *
 * 198. 打家劫舍
 *
 *你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 *
 **/
public class MaxSumOfNumsInArrayNotConstant {

    /*
LC.198.打家劫舍
2022.3.20:Hou:自己想出了动态规划的方法，自己用代码实现了。

*/
    static class Solution {
        public int rob(int[] nums) {
            //dp[i][j]表示第i间屋子，[j]=0表示截至目前+没偷这间屋子钱时的最大偷取金额;[j]=1表示截至目前+偷了这间屋子钱时的最大偷取金额
            int[][ ] dp=new int[nums.length][2];
            dp[0][0]=0;
            dp[0][1]=nums[0];
            for(int i=1;i<nums.length;i++){
                dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]);
                if(i==1){
                    dp[i][1]= Math.max(nums[1],nums[0]);
                }
                else{
                    dp[i][1]=Math.max(dp[i-1][0]+nums[i],dp[i-2][1]+nums[i]);
                }

            }
            return Math.max(dp[dp.length-1][0],dp[dp.length-1][1]);
        }
    }




}

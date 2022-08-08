package MaximizeStockProfit;

/**
 * Author:
 * Created at:2022/8/8
 * Updated at:
 *
 * 122. 买卖股票的最佳时机 II
 **/
public class MaximizeStockProfitWithinLimitationOfOneStockInHand {



/*


LC.309.最佳买卖股票时机含冷冻期
2022.3.20:Hou:自己想出了动态规划的方法，自己用代码实现了。
*/

    static class Solution {
        public int maxProfit(int[] prices) {
            int[][] dp=new int[prices.length][2];
            dp[0][0]=0;
            dp[0][1]=prices[0]*(-1);

            //记录下当时在那一天的选择:[0]=0表示现在的空是由于没动；[0]=1表示现在的空是由于卖出；[1]=0表示现在的持有是由于没动，[1]=1表示现在的持有是由于买入
            int[][] memo=new int[prices.length][2];
            memo[0][1]=1;
            memo[0][0]=0;
            for(int i=1;i<prices.length;i++){
                if(dp[i-1][0]>dp[i-1][1]+prices[i]){
                    memo[i][0]=0;
                    dp[i][0]=dp[i-1][0];
                }
                if(dp[i-1][0]<=dp[i-1][1]+prices[i]){
                    memo[i][0]=1;
                    dp[i][0]=dp[i-1][1]+prices[i];

                }
                //前一天的没有持有是因为没动，所以有两种可选择情况
                if(memo[i-1][0]==0){
                    dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);

                }
                //前一天的没有持有是因为卖出，所以有两种可选择情况
                if(memo[i-1][0]==1){
                    dp[i][1]=Math.max(dp[i-1][1],dp[i-2][0]-prices[i]);
                }


            }
            return Math.max(dp[dp.length-1][0],dp[dp.length-1][1]);
        }

    }







}

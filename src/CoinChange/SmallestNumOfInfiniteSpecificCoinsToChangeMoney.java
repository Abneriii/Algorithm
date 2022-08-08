package CoinChange;

/**
 * Author:
 * Created at:2022/8/8
 * Updated at:
 *
 *
 *
 * 322. 零钱兑换:https://leetcode.cn/problems/coin-change/
 * 给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。
 * 计算并返回可以凑成总金额所需的 最少的硬币个数 。如果没有任何一种硬币组合能组成总金额，返回 -1 。
 * 你可以认为每种硬币的数量是无限的。
 *
 *
 *
 **/
public class SmallestNumOfInfiniteSpecificCoinsToChangeMoney {



/*
LC.322.零钱兑换
2022.4.2:Hou:看了题解，懂了，自己代码实现了。

*/

    static class Solution {


        public static void main(String[] args) {

        }
        public int coinChange(int[] coins, int amount) {
            //dp[i]表示剩余i金额时，需要的最少的硬币个数
            int[] dp=new int[amount+1];
            for(int i=0;i<=amount;i++){
                dp[i]= amount+1;
            }
            if(amount==0) return 0;
            dp[0]=0;
            for(int i=1;i<=amount;i++){
                for(int j=0;j<coins.length;j++){
                    if(i<coins[j]) continue;
                    dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
                }

            }
            if(dp[amount]> amount){
                return -1;
            }
            else{
                return dp[amount];
            }

        }


    }


}

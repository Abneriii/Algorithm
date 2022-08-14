package CoinChange;

/**
 * Author:
 * Created at:2022/8/8
 * Updated at:
 * <p>
 * <p>
 * <p>
 * 322. 零钱兑换:https://leetcode.cn/problems/coin-change/
 * 给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。
 * 计算并返回可以凑成总金额所需的 最少的硬币个数 。如果没有任何一种硬币组合能组成总金额，返回 -1 。
 * 你可以认为每种硬币的数量是无限的。
 **/
public class SmallestNumOfInfiniteSpecificCoinsToChangeMoney {

    /**
     *
     *
     *
     *
     */





/*
LC.322.零钱兑换
2022.4.2:Hou:看了题解，懂了，自己代码实现了。

*/

    static class Solution1 {


        public static void main(String[] args) {

        }

        public int coinChange(int[] coins, int amount) {
            //dp[i]表示剩余i金额时，需要的最少的硬币个数
            int[] dp = new int[amount + 1];
            for (int i = 0; i <= amount; i++) {
                dp[i] = amount + 1;
            }
            if (amount == 0) return 0;
            dp[0] = 0;
            for (int i = 1; i <= amount; i++) {
                for (int j = 0; j < coins.length; j++) {
                    if (i < coins[j]) continue;
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }

            }
            if (dp[amount] > amount) {
                return -1;
            } else {
                return dp[amount];
            }

        }


    }

    /**
     * 《动态规划面试宝典》第1讲
     *
     *
     *
     * 2022.8.14----没懂。
     */

    static class Solution2 {

        int getMinCoinCountOfValue(int total, int[] values, int valueIndex) {
            int valueCount = values.length;
            if (valueIndex == valueCount) {
                return Integer.MAX_VALUE;
            }
            int minResult = Integer.MAX_VALUE;
            int currentValue = values[valueIndex];
            int maxCount = total / currentValue;
            for (int count = maxCount; count >= 0; count--) {
                int rest = total - count * currentValue; // 如果rest为0，表示余额已除尽，组合完成
                if (rest == 0) {
                    minResult = Math.min(minResult, count);
                    break;
                }// 否则尝试用剩余面值求当前余额的硬币总数
                int restCount = getMinCoinCountOfValue(rest, values, valueIndex + 1); // 如果后续没有可用组合
                if (restCount == Integer.MAX_VALUE) { // 如果当前面值已经为0，返回-1表示尝试失败
                    if (count == 0) {
                        break;
                    } // 否则尝试把当前面值-1
                    continue;
                }
                minResult = Math.min(minResult, count + restCount);
            }
            return minResult;
        }


        int getMinCoinCountLoop(int total, int[] values, int k) {
            int minCount = Integer.MAX_VALUE;
            int valueCount = values.length;
            if (k == valueCount) {
                return Math.min(minCount, getMinCoinCountOfValue(total, values, 0));
            }
            for (int i = k; i <= valueCount - 1; i++) { // k位置已经排列好
                int t = values[k];
                values[k] = values[i];
                values[i] = t;
                minCount = Math.min(minCount, getMinCoinCountLoop(total, values, k + 1)); // 回溯
                        t = values[k]; values[k] = values[i];
                values[i] = t;
            }
            return minCount;
        }

        int getMinCoinCountOfValue() {
            int[] values = {5, 3}; // 硬币面值
            int total = 11; // 总价
            int minCoin = getMinCoinCountLoop(total, values, 0);
            return (minCoin == Integer.MAX_VALUE) ? -1 : minCoin; // 输出答案
        }
    }


}

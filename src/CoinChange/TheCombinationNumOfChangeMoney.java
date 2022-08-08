package CoinChange;

/**
 * Author:
 * Created at:2022/8/8
 * Updated at:
 *
 *518. 零钱兑换 II
 *  链接：https://leetcode.cn/problems/coin-change-2
 * 给你一个整数数组 coins 表示不同面额的硬币，另给一个整数 amount 表示总金额。
 *
 * 请你计算并返回可以凑成总金额的硬币组合数。如果任何硬币组合都无法凑出总金额，返回 0 。
 *
 * 假设每一种面额的硬币有无限个。 
 *
 * 题目数据保证结果符合 32 位带符号整数。
 *
 *
 **/
public class TheCombinationNumOfChangeMoney {


    /*

    LC.518.零钱兑换 II
    2022.3.22:Hou:此题用了最初级的回溯法，提交显示的是超出内存限制，自己又测试了几个用例，结果是正确的，说明暴力方法没错，但暴力的内存太费，需要优化。；
    */
    static class Solution {
        //回溯法
        int count=0;
        public int change(int amount, int[] coins) {
            change(amount,0,coins);
            return count;

        }


        public void change(int amount,int index,int[] coins){
            if(amount==0){
                count++;
                return;
            }
            for(;index<coins.length;index++){
                if(coins[index]<=amount){
                    change(amount-coins[index],index,coins);
                }
            }


        }
    }



}

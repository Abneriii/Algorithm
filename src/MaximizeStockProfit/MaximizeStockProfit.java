package MaximizeStockProfit;

/**
 * Author:
 * Created at:2022/8/8
 * Updated at:
 *
 * 121. 买卖股票的最佳时机
 *
 *
 **/
public class MaximizeStockProfit {

    /*

    LC.121.买卖股票的最佳时机
    2022.3.20:Hou:只想出暴力算法，时间复杂度平方级别。------------看题解方法，懂了，自己代码实现了。

    */
    static class Solution {
        public int maxProfit(int[] prices) {
            //lowestPrice[i]表示第i天前的最低价格
            int[] lowestPrice=new int[prices.length];
            //完成对lowestPrice数组的赋值
            lowestPrice[0]=prices[0];
            int min=prices[0];
            for(int i=1;i<prices.length;i++){
                if(min>prices[i]){
                    min=prices[i];
                }
                lowestPrice[i]=min;
            }
            //遍历一遍数组，同时在遍历过程中不断更新最大值
            int highestProfit=0;
            for(int i=1;i<prices.length;i++){
                if(prices[i]-lowestPrice[i]>highestProfit){
                    highestProfit=prices[i]-lowestPrice[i];
                }

            }
            return highestProfit;
        }
    }


}

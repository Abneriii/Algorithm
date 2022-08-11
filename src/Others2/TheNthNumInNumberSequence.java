package Others2;

/**
 * Author:
 * Created at:2022/8/10
 * Updated at:
 *
 * JZ44 数字序列中某一位的数字
 *
 * 2022.8.10---Hou--不会，
 *
 **/
public class TheNthNumInNumberSequence {


    /**
     * 牛客题解。dai分析算法
     */
    static class Solution {
        public int findNthDigit (int n) {
            //记录n是几位数
            int digit = 1;
            //记录当前位数区间的起始数字：1,10,100...
            long start = 1;
            //记录当前区间之前总共有多少位数字
            long sum = 9;
            //将n定位在某个位数的区间中
            while(n > sum){
                n -= sum;
                start *= 10;
                digit++;
                //该区间的总共位数
                sum = 9 * start * digit;
            }
            //定位n在哪个数字上
            String num = "" + (start + (n - 1) / digit);
            //定位n在数字的哪一位上
            int index = (n - 1) % digit;
            return (int)(num.charAt(index)) - (int)('0');
        }
    }


}

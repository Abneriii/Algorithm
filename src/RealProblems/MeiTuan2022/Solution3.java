package RealProblems.MeiTuan2022;

import java.util.Scanner;

/**
 * Author:
 * Created at:2022/8/20
 * Updated at:
 *
 *
 * 美团2022.8.20秋招笔试题
 *
 *
 *
 * 小美即将进行期末考试！小美现在盘算了一下，一共有n道试题，
 * 对于第 i 道试题，小美有着pi的概率做对，获得ai的分值，另外(1-pi)的概率做错，
 * 获得0分。小美的总分即是每道题获得的分数之和。小美不甘于此！她决定突击复习，
 * 因为时间有限，她最多复习m道试题，使得复习后的试题正确率提升到100%。
 * 小美想知道，如果她以最佳方式进行复习，能获得的期望总分最大是多少。
 *
 *
 * 第一行两个正整数n和m，表示总试题数和最多复习试题数。
 *
 * 接下来一行n个整数，分别为p1 p2...pn，表示小美有pi%的概率，即pi=pi/100的概率做对第i个题。（注意，这里为了简单起见，将概率pi扩张100倍成为整数pi方便输入）
 *
 * 接下来一行n个整数，分别表示a1 a2...an，分别表示第 i 个题做对的分值。
 *
 * 数字间两两有空格隔开，对于所有数据，1≤m≤n≤50000,0≤pi≤100,1≤ai≤1000
 *
 *
 * 输出一行一个恰好两位的小数，表示能获得的最大期望总分。（如果答案为10应输出10.00，2.5应输出2.50）
 *
 *
 * 2 1
 * 89 38
 * 445 754
 *
 * 1150.05
 *
 * 如果都不复习，小美总分的期望为89%*445+38%*754=682.57
 *
 * 如果复习第一道题，小美总分的期望为100%*445+38%*754=731.52
 *
 * 如果复习第二道题，小美总分的期望为89%*445+100%*754=1150.05
 *
 * 所以选择复习第二道题，这样能获得最大期望总分1150.05
 *
 * 根据每题复习后的收益进行排序即可
 *
 *
 **/
public class Solution3 {

    /**
     *
     * 把每一个概率转为百分数，
     *
     *
     *
     *
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[][] array=new int[n][2];
        for (int i = 0; i <n; i++) {
            array[i][0]=in.nextInt();
        }
        for (int i = 0; i <n; i++) {
            array[i][1]=in.nextInt();
        }
        double result=0;
        for (int i = 0; i <n-m; i++) {
            double a=(float)array[i][0]*array[i][1]*0.01;
            double thisResult=0;
            thisResult+=a;
            for (int j = i+1; j <n-m-1 ; j++) {
                int k=n-1;
                while(k!=0) {
                    double aq = (double) array[j][0] * array[j][1];
                    thisResult += aq;
                    k--;
                }
            }
            result=Math.max(result,thisResult);
        }
        System.out.print(String.format("%.2f",result));

    }
}

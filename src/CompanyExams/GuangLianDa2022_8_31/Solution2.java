package CompanyExams.GuangLianDa2022_8_31;

import java.util.Scanner;

/**
 * Author:
 * Created at:2022/8/31
 * Updated at:
 *
 *
 *
 * 水平的列车上有n个座位，从左到右座位号为1,2,...,n。
 * 现在有m条规定，每条规定的形式如下：从座位l到座位r，
 * 不多于x个人乘坐。在满足所有规定的前提下，该列车最多能乘坐多少人？
 *
 *
 * 首先输入两个整数n,m（1≤,n,m≤10^5），
 * 表示有n个座位，有m个规定。 然后输入m行，
 * 每行三个整数l,r,x（1≤l≤r≤n,1≤x≤r-l+1），
 * 表示从座位l到座位r，不多于x个人乘坐。
 *
 *样例输入
 * 10 3
 * 1 4 2
 * 3 6 2
 * 10 10 1
 *
 * 样例输出
 * 8
 *
 *
 *
 *
 *
 *
 *
 **/
public class Solution2 {

    /**
     *
     *2022.8.31-----------HouAlgo-----------------算法可能不太好，实现不下去了
     * rules[m][3]=
     * dp[n]
     * dp[]初始化为-1
     * 遍历rules,rules[i][0]到rules[j][1]的dp下标值，在不等于1的位置处，从前到后赋值rules[i][2]次1,
     * 剩下的直到rules[j][1]下标的都赋值为0
     *2022.8.31-----------------------------
     *
     *
     */
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        int m=scanner.nextInt();
//        int[][] rules=new int[m][3];
//        int[] dp=new int[n];
//        for (int i = 0; i <n ; i++) {
//                dp[i]=-1;
//        }
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j <3 ; j++) {
//                rules[i][j]=scanner.nextInt();
//            }
//        }
//        for (int i = 0; i < m; i++) {
//            int start=rules[i][0];
//            int end=rules[i][1];
//            int max=rules[i][2];
//            for (int j = start; j <=end ; j++) {
//                int help;
//                if(dp[j]==-1&&max!=0){
//                  dp[j]=1;
//                  max--;
//                }
//                if(max==0){
//                    help=j;
//                    while(){
//
//                    }
//                }
//            }
//
//
//        }
//
//    }
}

package RealProblems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author:
 * Created at:2022/8/19
 * Updated at:
 *
 * 美团2021校招笔试-编程题--淘汰分数
 *
 * 某比赛已经进入了淘汰赛阶段,已知共有n名选手参与了此阶段比赛，他们的得分分别是a_1,a_2….a_n,小美作为比赛的裁判希望设定一个分数线m，使得所有分数大于m的选手晋级，其他人淘汰。
 * 但是为了保护粉丝脆弱的心脏，小美希望晋级和淘汰的人数均在[x,y]之间。
 * 显然这个m有可能是不存在的，也有可能存在多个m，如果不存在，请你输出-1，如果存在多个，请你输出符合条件的最低的分数线。
 *
 *
 *-2022.8.20---Hou算法--通过。这题简单，不必再看
 *
 **/
public class FindEliminationScore {

    /**
     *
     *
     * -------2022.8.20---Hou算法--通过。------------
     * input:n,x,y。nums[n]
     * sort(nums[n])
     * for i=x to y
     *    if(n-i<=y)
     *       return nums[i]
     *
     *
     * ----------------------
     *
     *
     *
     */
    static class Solution1{
        public static void main(String[] args){
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            int x=in.nextInt();
            int y=in.nextInt();
            int[] nums=new int[n];
            for(int i=0;i<n;i++){
                nums[i]=in.nextInt();
            }
            Arrays.sort(nums);
            for(int i=x;i<=y;i++){
                if(n-i<=y){
                    System.out.println(nums[i-1]);
                    break;
                }
            }

        }
    }
}

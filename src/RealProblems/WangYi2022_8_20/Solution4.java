package RealProblems.WangYi2022_8_20;

import java.util.Scanner;

/**
 * Author:
 * Created at:2022/8/20
 * Updated at:
 *
 *
 *
 *
 **/
public class Solution4 {

    /**
     *
     *
     * -----------------通过率66.67%--------------
     * 第一个数从左往右遍历
     *    第三个数从右往左遍历，直到第一个数相等时停下来
     *         第二个数从第三个数的左一个位置开始往左遍历，直到小于第一数
     *             总数加1
     *-----------------通过率66.67%--------------
     *
     *
     */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] nums=new int[n];
        for (int i = 0; i <n ; i++) {
            nums[i]=scanner.nextInt();
        }
        int result=0;
        for(int i=0;i<n-2;i++){
            for(int j=n-1;j>i;j--){
                if(nums[i]==nums[j]){
                    for(int k=j-1;k>i;k--){
                        if(nums[k]<nums[i]){
                            result++;
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }

}

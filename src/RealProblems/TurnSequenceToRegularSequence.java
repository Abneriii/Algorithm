package RealProblems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author:
 * Created at:2022/8/19
 * Updated at:
 *
 * 美团2021校招笔试-编程题--正则序列
 *
 * 我们称一个长度为n的序列为正则序列，当且仅当该序列是一个由1~n组成的排列，即该序列由n个正整数组成，取值在[1,n]范围，且不存在重复的数，同时正则序列不要求排序
 * 有一天小团得到了一个长度为n的任意序列s，他需要在有限次操作内，将这个序列变成一个正则序列，每次操作他可以任选序列中的一个数字，并将该数字加一或者减一。
 * 请问他最少用多少次操作可以把这个序列变成正则序列？
 *
 *
 * 2022.8.20----通过。这题简单，不必再看。
 *
 *
 **/
public class TurnSequenceToRegularSequence {

    /**
     *
     *
     *
     * -------------2022.8.20---通过----------
     * input：n个元素的nums[]
     *
     * sort(nums)
     * int total=0;
     * int i=1;
     * for nums=nums[0] to nums[n-1]
     *     total=abs(nums-i)
     *     i++;
     * return total
     *--------------------------
     *
     */
    static class Solution1{
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            int[] nums=new int[n];
            for(int i=0;i<n;i++){
                nums[i]=in.nextInt();
            }
            int total=0;
            int j=1;
            Arrays.sort(nums);
            for(int i=0;i<nums.length;i++){
                total+=Math.abs(nums[i]-j);
                j++;
            }
            System.out.println(total);

        }

    }


}

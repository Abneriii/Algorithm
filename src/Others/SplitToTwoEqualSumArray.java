package Others;

/**
 * Author:
 * Created at:2022/7/29
 * Updated at:
 *
 * 416. 分割等和子集
 * 给你一个 只包含正整数 的 非空 数组 nums 。请你判断是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
 *
 *
 *
 *
 *
 **/
public class SplitToTwoEqualSumArray {


    /**
     * 2022.4.9:Hou：实现了，自己又测试了几个用例，结果是正确的，但是leecode平台提交显示超时了，说明自己回溯法的实现时间复杂度高。
     */
    static class Solution1 {
        static int halfSum=0;
        static boolean res=false;
        public static boolean canPartition(int[] nums) {

            //
            int sum=0;
            for(int n:nums){
                sum+=n;
            }
            if(sum%2!=0) return false;
            halfSum=sum/2;
            canPartition(nums,0,0);
            return res;


        }

        public static void canPartition(int[]nums,int startIndex,int currrentSum){
            if(currrentSum==halfSum){
                res=true;

            }
            for(;startIndex<nums.length;startIndex++){
                if(currrentSum+nums[startIndex]<=halfSum){
                    canPartition(nums,startIndex+1,currrentSum+nums[startIndex]);
                }
            }


        }

    }
}

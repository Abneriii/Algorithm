package Others;

/**
 * Author:
 * Created at:2022/7/29
 * Updated at:
 *
 *
 *
 **/
public class EquationNumToBeTargetSum {

    /**
     * 2022.3.28:Hou:想到了用回溯法，用代码实现了，自己测试了几个例子，是正常的，但是leecode平台提交显示超时了，说明自己回溯法的实现时间复杂度高。
     * 力扣官方题解的回溯法的思路和我的一样，时间复杂度也是指数级别，但是实现上有点不同，但是它的可以通过，不知道为什么。
     */
    static class Solution1 {
        public static void main(String[] args) {
            int[] nums={1,1,1,1,1};
            System.out.println(findTargetSumWays(nums,3));
        }
        static int res=0;
        public static  int findTargetSumWays(int[] nums, int targetGap) {
            //回溯法
            findTargetSumWays(nums,0,targetGap,0);
            return res;

        }

        public static void findTargetSumWays(int[] nums,int startIndex,int targetGap,int prefix){
            if(startIndex==nums.length){
                if(targetGap==0){
                    res++;
                }
                return;

            }

            for(;startIndex<nums.length;startIndex++){
                prefix=-1;
                while(prefix<1){
                    prefix++;
                    findTargetSumWays(nums,startIndex+1,(int)(targetGap-nums[startIndex]*Math.pow(-1,prefix)),prefix);
                }
                return;


            }
        }

    }
}

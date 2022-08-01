package Others;

/**
 * Author:
 * Created at:2022/7/29
 * Updated at:
 *
 * 55. 跳跃游戏:https://leetcode.cn/problems/jump-game/
 *
 * 给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
 *
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 *
 * 判断你是否能够到达最后一个下标。
 **/
public class IfCanJumpToEnd {

    /**
     * 2022.4.7:Hou:想到了用回溯法，用代码实现了，自己测试了几个例子，是正常的，但是leecode平台提交显示超时了，说明自己回溯法的实现时间复杂度高。
     * 别人的题解中好像都没有用回溯法的。
     */
    static class Solution1 {
        static int[] nums2;
        static boolean res=false;
        public static boolean canJump(int[] nums) {
            nums2=nums;
            int targetIndex=nums.length-1;
            canJump(0,targetIndex);
            return res;
        }

        public static void canJump(int startIndex,int targetIndex ){
            if(startIndex+nums2[startIndex]>=targetIndex){
                res=true;
                return;
            }
            for(int i=nums2[startIndex];i>0;i--){
                canJump(startIndex+i,targetIndex);
            }
        }




    }




}

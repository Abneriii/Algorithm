package CombinationSumToBeTarget;

/**
 * Author:
 * Created at:2022/7/29
 * Updated at:
 *
 * 377. 组合总和 Ⅳ
 *
 *
 **/
public class CombinationSumToBeTarget4 {

    /**
     *
     *
     * 2022.3.16:Hou:"自己想出了算法：回溯法，自己用代码实现，但是leecode平台提交显示超时了，
     *        自己在本地测试结果是对的，应该是平台测试的数据样本大，所以就超时了，我的这个方法应该是非常初级
     * 	   的回溯法，没有什么减枝优化，dai改进。"
     */
    static class Solution {
        static int account=0;
        static int[] numsAll;
        public static int combinationSum4(int[] nums, int target) {
            numsAll=nums;
            combinationSum(target,0);
            return account;

        }

        public static void combinationSum(int needTarget,int nIndex){
            if(needTarget==0){
                account++;
                return;
            }

            for(;nIndex<numsAll.length;nIndex++){
                if(numsAll[nIndex]<=needTarget){
                    int lastNum=numsAll[nIndex];
                    combinationSum(needTarget-numsAll[nIndex],0);
                }
            }


        }


    }
}

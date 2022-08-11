package CombinationSumToBeTarget;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:
 * Created at:2022/7/29
 * Updated at:
 *
 * //LC.39.组合总和 。
 *
 *
 **/



public class CombinationSumToBeTarget1 {


    /**
     * 2022.8.11---Hou---做出来了。
     */
    static class Solution2{

        public static void main(String[] args) {
            int[] candidates=new int[]{2,3,6,7};
            List<List<Integer>> list=new ArrayList<>(new ArrayList<>());
            list=combinationSum(candidates,7);
            System.out.println(list);
            int a=1;
        }
        public static List<List<Integer>> combinationSum(int[] candidates, int target) {
            combinationSunHelper(candidates,0,0,target);
            return result;
        }
        static List<List<Integer>> result=new ArrayList<>();
        static List<Integer> resultPart=new ArrayList<>();
        public static void combinationSunHelper(int[] candidates,int nowIndex,int nowSum,int targetSum){
            if (nowSum>=targetSum){
                if(nowSum==targetSum) result.add(new ArrayList<>(resultPart));
                return;
            }
            for(int i=nowIndex;i<candidates.length;i++){
                resultPart.add(candidates[i]);
                nowSum+=candidates[i];
                combinationSunHelper(candidates,i,nowSum,targetSum);
                nowSum-=candidates[i];
                resultPart.remove(resultPart.size()-1);
            }

        }
    }


    /**
     * * 2022.3.15:Hou："这道题的解法思路和LC.77很相似，但区别在于这道题同一个数字可以被无限制重复选取，
     *  * 所以要在调用递归式传递参数时有区别。"。自己想出了算法，自己用代码实现算法，通过了。
     */
    static class Solution1 {

        static int[] candidatesArray;
        static List<List<Integer>> res=new ArrayList<>();
        public static List<List<Integer>> combinationSum(int[] candidates, int target) {
            //目标是target，list存储当前的内容，start

            candidatesArray=candidates;
            List<Integer> list=new ArrayList<>();
            combinationSum(0,target,list);
            return res;
        }
        public static void combinationSum(int startIndex,int needTarget,List<Integer> list){
            if(needTarget==0){
                res.add(new ArrayList<>(list));
                list.remove(list.size()-1);
                return ;
            }

            for(;startIndex<candidatesArray.length;startIndex++){
                if(candidatesArray[startIndex]<=needTarget){
                    list.add(candidatesArray[startIndex]);
                    combinationSum(startIndex,needTarget-candidatesArray[startIndex],list);
                }
            }
            if(list.size()!=0){
                list.remove(list.size()-1);
            }

        }

    }





}

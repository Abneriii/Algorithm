package CombinationSumToBeTarget;

import java.util.*;

/**
 * Author:
 * Created at:2022/7/29
 * Updated at:
 * 40. 组合总和 II
 **/
public class CombinationSumToBeTarget2 {





    /**
     *
     *
     *   2022.8.12---Hou--算法有误。
     *       测试用例：[10,1,2,7,6,1,5]  8
     *       我的程序的输出：[[1,2,5],[1,7],[1,6,1],[2,6],[2,1,5],[7,1]]
     *       预期正确结果输出：[[1,1,6],[1,2,5],[1,7],[2,6]]
     *
     */


    static class Solution2{

        public static void main(String[] args) {
            int[] candidates=new int[]{10,1,2,7,6,1,5};
            List<List<Integer>> list=new ArrayList<>(new ArrayList<>());
            list=combinationSum(candidates,8);
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
                combinationSunHelper(candidates,i+1,nowSum,targetSum);
                nowSum-=candidates[i];
                resultPart.remove(resultPart.size()-1);
            }

        }
    }




    /**
     * 测试用例：[10,1,2,7,6,1,5]  8
     * *     我的程序的输出：[[1,2,5],[1,7],[1,6,1],[2,6],[2,1,5],[7,1]]
     * *     预期正确结果输出：[[1,1,6],[1,2,5],[1,7],[2,6]]
     * *
     */

    static class Solution1 {
        static int[] candidatesArray;
        static List<List<Integer>> res = new ArrayList<>();

        public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
            //目标是target，list存储当前的内容，start

            candidatesArray = candidates;
            List<Integer> list = new ArrayList<>();
            combinationSum(0, target, list);

       /*
        Hou：题目中要求"candidates 中的每个数字在每个组合中只能使用 一次 。"，
        我理解为输出的结果不能有元素相同的数组，所以我的思路是将得到的res再进行处理去重，
        暂时的去重思路是用Set，但是提交执行结果说超出内存限制，可能这个去重方法不好，dai改进。
        */

            Set<List<Integer>> resSet = new HashSet<>();
            for (List<Integer> listHelp : res) {
                Collections.sort(listHelp);
                if (!resSet.contains(listHelp)) {
                    resSet.add(listHelp);
                }
            }
            res.clear();
            for (List<Integer> listHelp : resSet) {
                res.add(listHelp);
            }

            return res;
        }

        public static void combinationSum(int startIndex, int needTarget, List<Integer> list) {
            if (needTarget == 0) {
                res.add(new ArrayList<>(list));
                list.remove(list.size() - 1);
                return;
            }

            for (; startIndex < candidatesArray.length; startIndex++) {
                if (candidatesArray[startIndex] <= needTarget) {
                    list.add(candidatesArray[startIndex]);
                    combinationSum(startIndex + 1, needTarget - candidatesArray[startIndex], list);
                }
            }
            if (list.size() != 0) {
                list.remove(list.size() - 1);
            }
        }


    }
}

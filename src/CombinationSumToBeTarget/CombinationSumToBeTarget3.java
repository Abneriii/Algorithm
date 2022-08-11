package CombinationSumToBeTarget;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:
 * Created at:2022/7/29
 * Updated at:
 *
 * 216. 组合总和 III
 *
 *
 *
 **/
public class CombinationSumToBeTarget3 {

    /**
     *
     *
     * 2022.3.13:有点思路，但思路有点问题。
     * 2022.3.15:自己相出了算法，自己用代码实现了，通过了。
     */
    static class Solution1 {
        static List<List<Integer>> res=new ArrayList<>();

        public static List<List<Integer>> combinationSum3(int k, int n) {

            List<Integer> list=new ArrayList<>();
            combinationSum(k,n,1,list);
            return res;

        }
        public static void combinationSum(int needAmount,int needSum,int nIndex,List<Integer> list){
            if(needAmount==0&&needSum==0){
                res.add(new ArrayList<>(list));
                list.remove(list.size()-1);
                return;
            }

            for(;nIndex<=9&&nIndex<=needSum&&needAmount!=0;nIndex++){
                if(nIndex<=needSum){
                    list.add(nIndex);
                    combinationSum(needAmount-1,needSum-nIndex,nIndex+1,list);
                }
            }
            if(list.size()!=0){
                list.remove(list.size()-1);
            }

        }
    }


}

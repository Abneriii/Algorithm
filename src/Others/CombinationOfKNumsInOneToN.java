package Others;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Author:
 * Created at:2022/7/29
 * Updated at:
 *
 * 77. 组合
 * 2022.8.1---Hou--
 *
 **/
public class CombinationOfKNumsInOneToN {

    /**
     * 《代码随想录》
     * 看懂了
     */
    static class Solution3{
            static List<List<Integer>> result = new ArrayList<>();
            static LinkedList<Integer> path = new LinkedList<>();
            public static List<List<Integer>> combine(int n, int k) {
                combineHelper(n, k, 1);
                return result;
            }

            /**
             * 每次从集合中选取元素，可选择的范围随着选择的进行而收缩，调整可选择的范围，就是要靠startIndex
             * @param startIndex 用来记录本层递归的中，集合从哪里开始遍历（集合就是[1,...,n] ）。
             */
            private static void combineHelper(int n, int k, int startIndex){
                //终止条件
                if (path.size() == k){
                    result.add(new ArrayList<>(path));
                    return;
                }
                for (int i = startIndex; i <= n - (k - path.size()) + 1; i++){
                    path.add(i);
                    combineHelper(n, k, i + 1);
                    path.removeLast();
                }
            }

    }



    /**
     *力扣官方题解
     * 没看懂。
     *
     */

    static class Solution2{
        public static void main(String[] args) {
            System.out.println(combine(4,2));
        }
            static List<Integer> temp = new ArrayList<Integer>();
            static List<List<Integer>> ans = new ArrayList<List<Integer>>();

            public static List<List<Integer>> combine(int n, int k) {
                dfs(1, n, k);
                return ans;
            }

            public static void dfs(int cur, int n, int k) {
                // 剪枝：temp 长度加上区间 [cur, n] 的长度小于 k，不可能构造出长度为 k 的 temp

                if (temp.size() + (n - cur + 1) < k) {
                    return;
                }
                // 记录合法的答案
                if (temp.size() == k) {
                    ans.add(new ArrayList<Integer>(temp));
                    return;
                }
                // 考虑选择当前位置
                temp.add(cur);
                dfs(cur + 1, n, k);
                temp.remove(temp.size() - 1);
                // 考虑不选择当前位置
                dfs(cur + 1, n, k);
            }
        }




    /**
     * 2022.3.15：Hou:"需要一个循环+递归的结构",回溯法。1h--用代码实现了自己的思路，通过了。
     */

    static class Solution1 {

        static List<List<Integer>> res=new ArrayList<>();
        static int maxnum;
        public static List<List<Integer>> combine(int n, int k) {
            maxnum=n;
            List<Integer> list=new ArrayList<>();
            combine(1,k,list);
            return res;

        }
        //need:还需要的整数个数；
        public static void combine(int start,int need,List<Integer> list){
            if(need==0) {
                res.add(new ArrayList<>(list));
                list.remove(list.size()-1);
                return;
            }
            for(;start<=maxnum;start++){
                list.add(start);
                combine(start+1,need-1,list);

            }
            if(list.size()!=0){
                list.remove(list.size()-1);
            }
        }


    }
}

package Others;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:
 * Created at:2022/7/29
 * Updated at:
 **/
public class CombinationOfKNumInOneToN {
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

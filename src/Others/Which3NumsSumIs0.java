package Others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author:
 * Created at:2022/8/8
 * Updated at:
 * 15. 三数之和
 * 2022.10.25---我第一眼的想法是用回溯法，算法没写出来，然后看了题解也没有用回溯法的。这题能不能用回溯法？为啥不能用回溯法？什么时候适合用回溯法
 * 2022.8.18-----不会。
 *
 **/
public class Which3NumsSumIs0 {




    /**
     *
     *2022.10.5---想出来的算法也是这个。自己尝试用代码实现，结果发现实现不出来。看了题解答案，宏观思路是差不多的。自己的代码实现有问题。
     *2022.8.18----HouAlgo-----看了题解答案，然后自己写的算法，dai实现验证正确与否--------------------20
     * input:int[] nums
     * sort(nums)
     * result
     * for i=0 to nums.size()-2
     *     for(j=i+1,k=nums.size()-1;j<k;)
     *          if(nums[i]+nums[j]+[nums[k]==0)
     *              result.put(nums[i],nums[j],nums[k])
     *          将j移动到不等于现在值的位置，同时保证j<k
     *          将k移动到不等于现在值的位置，同时保证j<k
     *
     * ----------------------
     *
     *
     *
     *
     *以下代码实现为题解答案
     */
    static class Solution2{
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> lists = new ArrayList<>();
            //排序
            Arrays.sort(nums);
            //双指针
            int len = nums.length;
            for(int i = 0;i < len;++i) {
                if(nums[i] > 0) return lists;

                if(i > 0 && nums[i] == nums[i-1]) continue;

                int curr = nums[i];
                int L = i+1, R = len-1;
                while (L < R) {
                    int tmp = curr + nums[L] + nums[R];
                    if(tmp == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(curr);
                        list.add(nums[L]);
                        list.add(nums[R]);
                        lists.add(list);
                        while(L < R && nums[L+1] == nums[L]) ++L;
                        while (L < R && nums[R-1] == nums[R]) --R;
                        ++L;
                        --R;
                    } else if(tmp < 0) {
                        ++L;
                    } else {
                        --R;
                    }
                }
            }
            return lists;
        }
    }


    static class Solution1 {

//2022.3.13:没思路。--看题解，方法：双指针，懂了，自己实现，没通过，因为[0,0,0,0]这个特殊情况下不成立，dai修正自己的代码。

        public static List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 2; i++) {
                int j = i + 1;
                int m = nums.length - 1;
                while (j < m) {
                    if (nums[i] + nums[j] + nums[m] == 0) {
                        //加入结果集
                        List<Integer> respart = new ArrayList<>();
                        respart.add(nums[i]);
                        respart.add(nums[j]);
                        respart.add(nums[m]);
                        res.add(respart);
                    }

                    //将i和j移动到下一个不等于它现在的位置
                    int jlastValue = nums[j];
                    j++;
                    while (j < nums.length && jlastValue == nums[j]) j++;
                    int mlastValue = nums[m];
                    m--;
                    while (m > i && mlastValue == nums[m]) m--;


                }
            }
            return res;

        }
    }
}

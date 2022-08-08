package Others;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Author:
 * Created at:2022/8/8
 * Updated at:
 *
 * 128. 最长连续序列
 *
 *
 **/
public class LongestConsecutiveSequence {





/*

LC.128.最长连续序列
2022.3.19：不会。------看题解，懂了，自己代码实现了。

*/

    static class Solution {
        public int longestConsecutive(int[] nums) {
            if(nums.length==0) return 0;
            Arrays.sort(nums);
            Map<Integer,Integer> map=new HashMap<>();
            for(int a:nums){
                if(!map.containsKey(a)){
                    map.put(a,1);
                }

            }
            int maxLength=1;
            for(int a:nums){
                if(map.containsKey(a-1)){
                    map.put(a,map.get(a-1)+1);
                    maxLength=Math.max(map.get(a-1)+1,maxLength);
                }

            }
            return maxLength;

        }
    }


}

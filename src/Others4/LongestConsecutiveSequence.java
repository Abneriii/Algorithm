package Others4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Author:
 * Created at:2022/8/8
 * Updated at:
 *
 * 128. 最长连续序列
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * 请你设计并实现时间复杂度为O(n) 的算法解决此问题。
 *
 *
 *
 **/
public class LongestConsecutiveSequence {

/*

2022.8.12---HouAlgorithm--
 排序数组nums；创建HashMap：遍历数组每一个元素，然后保存键值对，键为元素。值为一。
 遍历nums的值作为HashMap的键，然后求这个比这个值小1的键是否存在，若存在则值加1
 -----HouAlgorithm
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

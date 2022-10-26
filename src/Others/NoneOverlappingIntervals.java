package Others;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Author:
 * Created at:2022/10/19
 * Updated at:
 * <p>
 * 435. 无重叠区间
 **/
public class NoneOverlappingIntervals {

    /**
     * 2022.10.19-------HouAlgo----通过
     * <p>
     * <p>
     * 根据每个区间的右端点，从小到大排序。---------疑问：如何实现？？
     * <p>
     * int right=-100000;
     * int result=0;
     * for i to nums末尾
     * if(nums[i][1]==right||(nums[i][1]!=right&&nums[i][0]<right))
     * result++;
     * continue;
     * right=nums[i][1];
     * <p>
     * return result;
     * <p>
     * 然后向后移动，
     * <p>
     * <p>
     * <p>
     * ---------------------------
     */
    static class Solution {
        public static int eraseOverlapIntervals(int[][] intervals) {
            if (intervals.length == 0) {
                return 0;
            }

            
            Arrays.sort(intervals, new Comparator<int[]>() {
                public int compare(int[] interval1, int[] interval2) {
                    return interval1[1] - interval2[1];
                }
            });
            int right = -100000;
            int result = 0;
            for (int i = 0; i < intervals.length; i++) {
                if (intervals[i][1] == right || (intervals[i][1] != right && intervals[i][0] < right)) {
                    result++;
                    continue;
                }
                right = intervals[i][1];
            }
            return result;

        }
    }
}

package Others;

/**
 * Author:
 * Created at:2022/10/5
 * Updated at:
 *
 *
 *
 * LC.4.寻找两个正序数组的中位数
 *
 *
 **/
public class TheMedianOfTwoSortedArray {



    /**
     * HouAlgo---------2022.10.24---通过了。
     * 先合并两个有序数组(采用LC.88的算法)，然后再找出这个有序数组的中位数(奇数or偶数，有其对应的计算中位数的算法)。---这个算法是最容易想到的暴力算法
     *
     *
     * --------------------
     */

    static class Solution {
        public static  double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int point1 = 0;
            int point2 = 0;
            int m=nums1.length;
            int n=nums2.length;
            int resultIndex;
            double result;
            int[] nums3 = new int[m + n];
            int i = 0;
            while (point1 < m && point2 < n) {
                if (nums1[point1] <= nums2[point2]) {
                    nums3[i++] = nums1[point1];
                    point1++;

                }
                else {
                    nums3[i++] = nums2[point2];
                    point2++;
                }

            }
            while (point1 < m) {
                nums3[i++] = nums1[point1];
                point1++;
            }

            while (point2 < n) {
                nums3[i++] = nums2[point2];
                point2++;
            }


            if(nums3.length%2==0){
                int x=nums3.length/2;
                int y=x-1;
                result=(nums3[x]+nums3[y])/2.0;
            }else{
                int x=(nums3.length-1)/2;
                result=nums3[x];
            }
            return result;
        }

        public static void main(String[] args) {
            int[] nums1={1,2};
            int[] nums2={3,4};
            System.out.println(findMedianSortedArrays(nums1,nums2));
        }
    }

}




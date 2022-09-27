package Others;

/**
 * Author:
 * Created at:2022/9/27
 * Updated at:
 * <p>
 * <p>
 * LC.88. 合并两个有序数组
 **/
public class MergeTwoSortedArrays {
    static class Solution1 {
        /**
         * 新申请大小为m+n的数组nums3
         * 利用指针法：nums1和nums2每个有一个指针，互相对比，按照顺序将数字放到nums3中，然后再把数字赋值回nums1
         * --------------2022.9.27----HouAlgo-------通过
         * int point1=0;
         * int point2=0;
         * int[] nums3=new int[m+n];
         * int i=0;
         * while(point1<m&&point2<n){
         * if(nums1[point1]<=nums2[point2]){
         * nums3[i++]=nums[point1];
         * point1++;
         *
         * }
         * if(nums[point2]<=nums2[point1]){
         * nums3[i++]=nums[point2];
         * point2++;
         * }
         *
         * }
         * while(point1<m){
         * nums3[i++]=nums[point1];
         * point1++;
         * }
         *
         * while(point2<n){
         * nums3[i++]=nums[point2];
         * point2++:
         * }
         * ------------------------------------------
         */
        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            int point1 = 0;
            int point2 = 0;
            int[] nums3 = new int[m + n];
            int i = 0;
            while (point1 < m && point2 < n) {
                if (nums1[point1] <= nums2[point2]) {
                    nums3[i++] = nums1[point1];
                    point1++;

                }
                if (nums2[point2] <= nums1[point1]) {
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

            for (int k = 0; k < nums3.length; k++) {
                nums1[k]=nums3[k];
            }

        }

        public static void main(String[] args) {
            int[] nums1={1,2,3,0,0,0} ;
            int[] nums2={2,5,6};
            merge(nums1,3,nums2,3);
            for (int a:nums1){
                System.out.println(a);
            }
        }

    }
}

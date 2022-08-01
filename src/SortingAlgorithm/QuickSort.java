package SortingAlgorithm;

/**
 * Author:
 * Created at:2022/7/31
 * Updated at:
 *
 *
 *
 **/

public class QuickSort {

    /**
     *
     *2022。7.31---Hou----有误待排查。
     *
     */

    static class QuickSort1{

        public static void main(String[] args) {
            int[] nums={9,8,7,6,5,4,3,2,1};
            quickSort(nums,0, nums.length-1);
            for(int num:nums){
                System.out.println(num);
            }
        }
        public  static  void quickSort(int[] nums,int start,int end){
            if(nums.length==0||start>=end){
                return;
            }
            System.out.println("nums[start]处的数字是"+nums[start]);
            int index=partition(nums,start,end);
            System.out.println("nums[index]"+nums[index]);
            quickSort(nums,start,index-1);
            quickSort(nums,index+1,end);

        }

        /**
         *
         * @param nums
         * @param start
         * @param end
         * @return
         *
         * 2022.8.1---Hou--这个方法啊有bug，当数组nums中有重复元素，这个方法就会死循环------dai比对标准答案的partition。
         */
        private  static  int partition(int[] nums,int start,int end){
            int flag=nums[start];
            int left=start;
            int right=end;
            while(left<right){
                while(nums[left]<flag&&left<right){
                    left++;
                }
                while(nums[right]>flag&&left<right){
                    right--;
                }
                if(left<right){
                    int help=nums[left];
                    nums[left]=nums[right];
                    nums[right]=help;
                }
            }
            return left;
        }
    }




}

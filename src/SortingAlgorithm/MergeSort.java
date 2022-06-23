package SortingAlgorithm;

/**
 * Author:
 * Created at:2022/6/22
 * Updated at:
 **/
/**
 *
 * 2022.6.23---Hou：分治算法：将数组分成左右两个，然后分别对分成的数组再调用分治算法，然后合并起来。
 *Hou:“不知道算法输入是什么，导致我没法写算法”、“”
 *
 *
 */

public class MergeSort {
    public static void main(String[] args) {
        int[] nums=new int[10]{};
        mergeSort(nums);
        System.out.println();
    }
    public static void mergeSort(int[] nums){
        mergeSortHelper(nums,0,nums.length-1);

    }
    public static void mergeSortHelper(int[] nums,int start,int end){
        int middle=(start+end)/2;
        mergeSortHelper(nums,0,middle);
        mergeSortHelper(nums,middle+1,end);
        merge(nums,0,middle,end);

    }

    /**
     * 数组nums的start到middle、middle到end分别是有序的，
     * 合并它们，使得数组nums的从start到end的元素为有序.
     * 2022.6.23---10min--没思路
     *
     *
     */

    public static void merge(int[] nums,int start,int middle,int end){


    }
}

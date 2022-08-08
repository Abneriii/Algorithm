package SortingAlgorithm;

/**
 * Author:
 * Created at:2022/8/8
 * Updated at:
 **/
public class SelectionSort {


    static class Solution {
        /**
         *
         * 将给定数组排序。2022.3.10--选择排序。
         * @param arr int整型一维数组 待排序的数组
         * @return int整型一维数组
         */
        public int[] MySort (int[] arr) {
            // write code here
            for(int i=0;i<arr.length;i++){
                int min=i;
                for(int j=i;j<arr.length;j++){
                    if(arr[j]<arr[min]){
                        min=j;
                    }
                }
                //交换arr[i]和arr[min]
                int help=arr[i];
                arr[i]=arr[min];
                arr[min]=help;

            }
            return arr;
        }
    }




}

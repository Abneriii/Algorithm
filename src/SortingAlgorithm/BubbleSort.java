package SortingAlgorithm;

/**
 * Author:
 * Created at:2022/8/8
 * Updated at:
 **/
public class BubbleSort {


    static class Solution {
        /**
         *
         * 将给定数组排序。2022.3.10--冒泡排序
         * @param arr int整型一维数组 待排序的数组
         * @return int整型一维数组
         */
        public int[] MySort (int[] arr) {
            // write code here
            for(int i=arr.length-1;i>=0;i--){
                int maxIndex=0;
                for(int j=0;j<=i;j++){
                    if(arr[j]>arr[maxIndex]){
                        maxIndex=j;
                    }
                }
                int help=arr[i];
                arr[i]=arr[maxIndex];
                arr[maxIndex]=help;
            }
            return arr;
        }


    }



}

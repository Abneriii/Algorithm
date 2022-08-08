package SortingAlgorithm;

/**
 * Author:
 * Created at:2022/8/8
 * Updated at:
 **/
public class InsertSort {


    static class Solution {
        /**
         *
         * 将给定数组排序。2022.3.10----插入排序---有错。
         * @param arr int整型一维数组 待排序的数组
         * @return int整型一维数组
         */
        public int[] MySort (int[] arr) {
            // write code here
            for(int i=1;i<=arr.length-1;i++){
                int flag=i;
                for(int j=i;j>=0;j--){
                    if(arr[j]<=arr[i]){
                        flag=j;
                        break;
                    }
                }
                //将flag后的元素都往后移一个位置
                int help=i-1;
                while(help>flag){
                    arr[help+1]=arr[help];
                    help--;
                }
                arr[help+1]=arr[i];

            }
            return arr;
        }
    }




}

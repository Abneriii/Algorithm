package SortingAlgorithm;

/**
 * Author:
 * Created at:2022/7/31
 * Updated at:
 *
 * 快速排序
 *
 * 2022.8.19----不会写partition的算法。
 *
 *
 *
 * input:nums
 * output:
 *
 *
 *
 * quicksort(nums,startIndex,endIndex){
 *     if(startIndex<endIndex){
 *     segmentIndex=partition(nums,startIndex,endIndex);
 *     quicksort(nums,startIndex,segmentIndex-1);
 *     quicksort(nums,segmentIndex+1,endIndex);
 *     }
 * }
 *
 *
 *
 *
 *
 *
 *
 *
 *
 **/

public class QuickSort {

    /**
     *
     *
     *
     *
     *
     *
     */

    /**
     * 2022.8.8----正确----目前位置最好的算法
     */
    static class QuickSort3{

        public static void main(String[] args) {
            int[] nums={3,-1,2,4,-1};
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
         *
         *
         *
         * @param nums
         * @param start
         * @param end
         * @return
         */
        private  static  int partition(int[] nums,int start,int end){
            int i=start-1;
            int pivot=nums[end];
            for(int j=start;j<end;j++){
                if(nums[j]<=pivot){
                    i++;
                    int help=nums[j];
                    nums[j]=nums[i];
                    nums[i]=help;
                }
            }
            int help=nums[i+1];
            nums[i+1]=pivot;
            nums[end]=help;
            return i+1;
        }




    }



    /**
     *
     *2022。7.31---Hou----有误待排查。
     *
     *
     *
     */
    static class QuickSort1{

        public static void main(String[] args) {
            int[] nums={3,-1,2,4};
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


    /**
     * //2022.3.11
     */
    static class QuickSort2 {


        public  static  void main(String[] argu){
            int[]a={1,3,2,4,3,2,6,7,56,100,222};
            quicksort(a,0,a.length-1);
            for(int num:a){
                System.out.println(num);
            }
        }


        public static  void quicksort(int[] a,int leftandFlag,int right){
            if(leftandFlag<right){
                int j=partition(a,leftandFlag,right);
                quicksort(a,0,j-1);
                quicksort(a,j+1,right);
            }


        }

        public static  int partition(int[]a,int leftandFlag,int right){
            int flag=leftandFlag;
            int left=leftandFlag;
            right++;
            while(true){
                while(left<a.length-1&&a[++left]<=a[flag]){
                    if(left>right) break;
                }
                while(right>0&&a[--right]>=a[flag]){
                    if(right<left) break;
                }
                if(left>=right) break;
                int help=a[left];
                a[left]=a[right];
                a[right]=help;

            }
            int help=a[flag];
            a[flag]=a[right];
            a[right]=help;
            return right;

        }




    }





}

package Others3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Author:
 * Created at:2022/8/8
 * Updated at:
 *
 * 剑指 Offer II 083. 没有重复元素集合的全排列
 *
 *  2022.8.10---不会。
 **/
public class FullPermutationOfNoDuplicateNums {


    /**
     *摘录自《代码随想录》
     * 2022.8.10---看懂了。
     *
     */
    static class Solution2{
        public static void main(String[] args) {
            int[] nums=new int[]{1,2,3};
            System.out.println(permute(nums));
        }

            static List<List<Integer>> result = new ArrayList<>();// 存放符合条件结果的集合
            static LinkedList<Integer> path = new LinkedList<>();// 用来存放符合条件结果
            static boolean[] used;
            public static List<List<Integer>> permute(int[] nums) {
                if (nums.length == 0){
                    return result;
                }
                used = new boolean[nums.length];
                permuteHelper(nums);
                return result;
            }

            private static void permuteHelper(int[] nums){
                if (path.size() == nums.length){
                    result.add(new ArrayList<>(path));
                    return;
                }
                for (int i = 0; i < nums.length; i++){
                    if (used[i]){
                        continue;
                    }
                    used[i] = true;
                    path.add(nums[i]);
                    permuteHelper(nums);
                    path.removeLast();
                    used[i] = false;
                }
            }
        }




/*

//Hou自己想到了应该用回溯法，并自己用回溯法实现了。
//NC.BM.55 没有重复项数字的全排列
2022.3.17:Hou:“遍历数组以选定第一个数字，然后对数组中剩下的数字进行全排列,这是一种递归思想。代码实现有问题，
不知道是自己这个思路有问题，还是自己代码的实现方式有问题，代码未完成”。
*/
    static class Solution1 {

        //Hou:“遍历数组以选定第一个数字，然后对数组中剩下的数字进行全排列”

        ArrayList<ArrayList<Integer>> res= new ArrayList<>();
        public ArrayList<ArrayList<Integer>> permute(int[] num) {

            //遍历数组元素，选取一个作为打头数字
            ArrayList<Integer> list=new ArrayList<>();
            Arrays.sort(num);
            boolean[] used=new boolean[num.length];

            fullPermute(0,num,list);
            return res;
        }


        public void fullPermute(int firstNumIndex,int[] num,ArrayList<Integer> list){
            if(list.size()==num.length){
                res.add(new ArrayList(list));
                list.remove(list.size()-1);
                return;
            }
            for(;firstNumIndex<num.length;firstNumIndex++){
                if(!list.contains(num[firstNumIndex])){
                    list.add(num[firstNumIndex]);
                    fullPermute(firstNumIndex,num,list);


                }

            }




        }






    }



}

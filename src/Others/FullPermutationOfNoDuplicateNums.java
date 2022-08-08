package Others;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author:
 * Created at:2022/8/8
 * Updated at:
 *
 * 剑指 Offer II 083. 没有重复元素集合的全排列
 *
 *
 **/
public class FullPermutationOfNoDuplicateNums {



/*

//Hou自己想到了应该用回溯法，并自己用回溯法实现了。
//NC.BM.55 没有重复项数字的全排列
2022.3.17:Hou:“遍历数组以选定第一个数字，然后对数组中剩下的数字进行全排列,这是一种递归思想。代码实现有问题，
不知道是自己这个思路有问题，还是自己代码的实现方式有问题，代码未完成”。
*/
    static class Solution {

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

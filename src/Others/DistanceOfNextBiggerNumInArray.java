package Others;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Author:
 * Created at:2022/8/8
 * Updated at:
 *
 * 739. 每日温度
 *
 *
 **/
public class DistanceOfNextBiggerNumInArray {

    /*

LC.739.每日温度
2022.3.26:Hou：懂了题解思路：单调栈，自己用代码实现了。

*/

    static class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            //单调栈思路，
            Deque<Integer> stack=new LinkedList<>();
            int[] res=new int[temperatures.length];
            for(int i=0;i<temperatures.length;i++){
                if(stack.isEmpty()){
                    stack.push(i);
                    continue;
                }
                while(!stack.isEmpty()&&temperatures[stack.peek()]<temperatures[i]){
                    int day=i-stack.peek();
                    res[stack.pop()]=day;

                }
                stack.push(i);
            }
            return res;
        }
    }



}

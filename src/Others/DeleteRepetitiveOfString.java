package Others;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Author:
 * Created at:2022/7/29
 * Updated at:
 * <p>
 * 1047. 删除字符串中的所有相邻重复项
 **/
public class DeleteRepetitiveOfString {


    /**
     * 2022.2.22做出
     */
    static class Solution {
        public static String removeDuplicates(String s) {
            Deque<Character> stack = new LinkedList<>();
            for (int i = 0; i < s.length(); i++) {
                if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                    while (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                        stack.pop();

                    }
                } else {
                    stack.push(s.charAt(i));
                }


            }
            String str = "";
            //剩余的元素即为不重复的元素
            while (!stack.isEmpty()) {
                str = stack.pop() + str;
            }
            return str;


        }
    }
}

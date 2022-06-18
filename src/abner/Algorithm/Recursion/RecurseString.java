package abner.Algorithm.Recursion;

import java.util.Arrays;

/**
 * Author:Abner
 * Created at:2022/6/14
 * Updated at:
 * Explanation:
 * Comment:
 **/

//
//public class RecurseString {
//
//    public static void reverseString(String[] strings){
//        reverseStringWithRightNowFlag(strings,0);
//
//    }
//
//    private static void reverseStringWithRightNowFlag(String[] strings,int rightNow){
//        if(strings.length==rightNow){
//            return;
//        }
//        reverseStringWithRightNowFlag(strings,rightNow+1);
//        System.out.print(strings[rightNow]);
//    }
//
//    public static void main(String[] args) {
//        String[] strings=new String[]{"h","e","l","l","o"};
//        reverseString(strings);
//    }
//
//}



//
//public class RecurseString {
//    public static void reverseString(char[] s) {
//        reverseStringWithRightNowFlag(s,0);
//
//
//    }
//
//    private static void reverseStringWithRightNowFlag(char[] s,int rightNow){
//        if(s.length==rightNow){
//            return;
//        }
//        reverseStringWithRightNowFlag(s,rightNow+1);
//        System.out.print(s[rightNow]);
//    }
//
//    public static void main(String[] args) {
//        char[] chars=new char[]{'h','e','l','l','o'};
//        reverseString(chars);
//    }
//
//
//}







/*
* Leetcode官方写的反转字符串
*
* */

//public class RecurseString {
//    private static void printReverse(char [] str) {
//        helper(0, str);
//    }
//
//    private static void helper(int index, char [] str) {
//        if (str == null || index >= str.length) {
//            return;
//        }
//        helper(index + 1, str);
//        System.out.print(str[index]);
//    }
//
//    public static void main(String[] args) {
//        char[] chars=new char[]{'h','e','l','l','o'};
//        printReverse(chars);
//    }
//
//
//}






/*
* 反转字符串
*
* 评价：方法写的不好，不应该要求输入一个rightNow参数
* */
//public class RecurseString {
//
//    public static void reverseString(String[] strings,int rightNow){
//        if(strings.length==rightNow){
//            return;
//        }
//        reverseString(strings,rightNow+1);
//        System.out.print(strings[rightNow]);
//
//    }
//
//    public static void main(String[] args) {
//        String[] strings=new String[]{"h","e","l","l","o"};
//        reverseString(strings,0);
//    }
//
//}

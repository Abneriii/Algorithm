package Others;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:
 * Created at:
 * Updated at:
 * Explanation:
 * Comment:
 *
 *
 *
 *
 *
 *
 * 22. 括号生成
 *
 *
 **/

/*
*
*
* */
  public   class GenerateGrammaticalParentheses {

    /**
     *
     *
     *
     * 2022.8.23-----------------------
     * 如何判断括号是有效的：在遍历一个括号组合的过程中，右括号数量一定是小于等于左括号的，当遍历到末尾时，刚好左括号数等于右括号数。
     * 用一个栈来实现上述过程-------不需要栈，可以通过计数法。。
     * 要生成n对括号生成的括号组合的全排列，才能进行判断括号是否有效。如何生成呢？---------递归生成，参考力扣题解。
     *-------------------------------------------------------------------------------------
     *
     *
     *
     *
      */

    /**
     *
     * 2022/6/14-------Leetcode题解
     */
    static   class Solution1{

        public static void main(String[] args) {
            System.out.println(generateParenthesis(5));
        }
        public static List<String> generateParenthesis(int n) {
            List<String> combinations = new ArrayList();
            generateAll(new char[2 * n], 0, combinations);
            return combinations;
        }

        public static void generateAll(char[] current, int pos, List<String> result) {
            if (pos == current.length) {
                if (valid(current))
                    result.add(new String(current));
            } else {
                current[pos] = '(';
                generateAll(current, pos+1, result);
                current[pos] = ')';
                generateAll(current, pos+1, result);
            }
        }

        public static boolean valid(char[] current) {
            int balance = 0;
            for (char c: current) {
                if (c == '(') balance++;
                else balance--;
                if (balance < 0) return false;
            }
            return (balance == 0);
        }
    }


    }


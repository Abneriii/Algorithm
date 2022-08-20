import java.util.Scanner;

/**
 * Author:
 * Created at:2022/8/20
 * Updated at:
 *
 *
 *
 * 美团2022.8.20秋招笔试题
 * 小团想要自己来烤串！不过在烤串之前，需要串好烤串。小团有n个荤菜和n个素菜，他想按顺序分别一个荤菜一个素菜串起来，想请你帮他串好！
 *
 * 给出两个长度分别为n的仅包含小写英文字母的串A和B，分别代表荤菜和素菜的种类（用字母来表示菜的种类）。请你以从左到右的顺序依次串好他们！例如对于荤菜串A1A2...An和素菜串B1B2...Bn，串好应该是A1B1A2B2...AnBn
 *
 *第一行一个正整数n，表示烤串长度
 *
 * 第二行为一个长度为n的字符串A，表示荤菜按次序都是哪些菜。
 *
 * 第三行为一个长度为n的字符串B，表示素菜按次序都是哪些菜。
 *
 * 对于80%的数据，n≤1000
 *
 * 对于20%的数据，n≤50000
 *
 * 对于所有数据，A和B为仅包含小写英文字母的字符串。
 *
 *输出一行，包含2n个字符串表示串好的烤串。
 *
 *
 *
 * 4
 * abcd
 * efgh
 *
 *
 * aebfcgdh
 *
 *
 **/
//public class Solution1 {
//    public static void main(String[] args) {
//        Scanner in =new Scanner(System.in);
//        int n=in.nextInt();
//        System.out.println(n);
//
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(hunArray[i]);
//            System.out.print(suArray[i]);
//        }
//
//
//
//    }
//
//
//
//}

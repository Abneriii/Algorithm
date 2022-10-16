package CompanyExams.XHS;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Author:
 * Created at:2022/10/12
 * Updated at:
 **/
public class Main1 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            HashSet<Integer> hashSet=new HashSet<>();
            int num=0;
            while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
               int a=in.nextInt();
                if(hashSet.contains(a)){
                    continue;
                }
                else{
                    hashSet.add(a);
                    num++;
                }
            }
            Object[] result=new Object[num];
            result=hashSet.toArray();
            Arrays.sort(result);
            for (int i=0;i<result.length;i++) {
                System.out.println(result[i]);
            }

        }

}

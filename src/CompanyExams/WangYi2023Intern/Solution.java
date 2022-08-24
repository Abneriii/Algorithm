package CompanyExams.WangYi2023Intern;

import java.util.Scanner;

/**
 * Author:
 * Created at:2022/8/24
 * Updated at:
 **/
public class Solution {


/*

2023网易互联网实习后端。字符串得分。
2022.3.27:Hou想出了算法，代码实现了，通过率为93%，应该有一些边角有问题。


*/


    static class solution1{
        public static void main(String[] argu){
            //dp[i]，截至到第i个字符串，最大的得分数
            int base=1;
            Scanner in=new Scanner(System.in);
            String string=in.nextLine();
            char[] s=string.toCharArray();
            //
            int[] dp=new int[s.length];
            dp[0]=0;
            if(Math.abs(s[0]-s[1])<=1){
                dp[1]=s[0]-'a'+base+s[1]-'a'+base;
            }
            else{
                dp[1]=0;
            }
            for(int i=2;i<s.length;i++){
                if(Math.abs(s[i]-s[i-1])<=1){
                    dp[i]=Math.max(dp[i-1],dp[i-2]+s[i]-'a'+base+s[i-1]-'a'+base);
                }
                else{
                    dp[i]=dp[i-1];
                }

            }
            System.out.println(dp[s.length-1]);




        }


    }
}

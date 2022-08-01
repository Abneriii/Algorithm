package Others;

/**
 * Author:
 * Created at:2022/7/29
 * Updated at:
 *
 * 344. 反转字符串
 *
 *
 *
 **/
public class ReverseString {

    static class Solution1 {
        public static void reverseString(char[] s) {
            reverseString2(s,0);
        }

        public static void reverseString2(char[] s,int n){
            if(s.length==0) return;
            if(n==s.length) return;
            reverseString2(s,++n);
            n--;
            if(n>=s.length/2){
                char swap;
                swap=s[s.length-n-1];
                s[s.length-n-1]=s[n];
                s[n]=swap;
            }
            return;


        }
    }
}

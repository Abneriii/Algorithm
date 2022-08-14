package Others4;

/**
 * Author:
 * Created at:2022/6/12
 * Updated at:
 * Explanation:LC.5.最长回文子串。
 * Comment:
 *2022.6.12:不会。
 *
 **/
public class LongestPalindromicSubstring {


    /**
     *
     *
     * 2022.8.14---看官方题解后，自己重写算法,实现了。
     * HouAlgorithm---------
     *
     *
     * isPalindromic[i][j]矩阵含义为:s字符串的第i到j的字符是否是回文字符串
     * isPalindromic[i][j]=isPalindromic[i+1][j-1]&&(s[i]==s[j])
     * 遍历isPalindromic矩阵，找到值为true，且j-i的值最大的位置，这就是最长回文子串
     *
     * HouAlgorithm-----------
     *
     *
     *
     */

    static class Solution1 {
        public static void main(String[] args) {
            System.out.println(longestPalindrome("aaa"));
        }

        public static String longestPalindrome(String s) {
            int sLength=s.length();
            int result=0;
            boolean[][] isPalindromic=new boolean [sLength][sLength];
            for(int i=0;i<sLength;i++){
                isPalindromic[i][i]=true;
            }
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    isPalindromic[i][i+1]=true;
                }
            }
            for(int j=2;j<sLength;j++){
                for(int i=0;i<j-1;i++){
                    isPalindromic[i][j]=isPalindromic[i+1][j-1]&&(s.charAt(i)==s.charAt(j));
                }
            }
            int flag=0;
            for(int j=0;j<sLength;j++){
                for(int i=0;i<=j;i++){
                    if(isPalindromic[i][j]&&result<j-i+1){
                        result=j-i+1;
                        flag=i;

                    }
                }
            }

            return s.substring(flag,flag+result);
        }
    }

























}

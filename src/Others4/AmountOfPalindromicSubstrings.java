package Others4;

/**
 * Author:
 * Created at:2022/8/14
 * Updated at:
 *
 *
 *
 *  647. 回文子串
 *
 *
 *
 **/


public class AmountOfPalindromicSubstrings {

    /**
     *      * 2022.8.14---正确
     *      * HouAlgorithm---------
     *      *
     *      *
     *      * isPalindromic[i][j]矩阵含义为:s字符串的第i到j的字符是否是回文字符串
     *      * isPalindromic[i][j]=isPalindromic[i+1][j-1]&&(s[i]==s[j])
     *      * 遍历isPalindromic矩阵，统计值为true的个数
     *      *
     *      * HouAlgorithm-----------
     *      *
     *
     */
    static class Solution1 {
        public static void main(String[] args) {
            System.out.println(countSubstrings("aaa"));
        }
        public static int countSubstrings(String s) {
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
            for(int j=0;j<sLength;j++){
                for(int i=0;i<=j;i++){
                    if(isPalindromic[i][j]){
                        result++;
                    }
                }
            }
            return result;
        }
    }






}

package Others4;

/**
 * Author:
 * Created at:2022/8/14
 * Updated at:
 *
 *
 *  1143. 最长公共子序列
 *
 *
 *
 *
 **/
public class LongestPublicSubsequence {

    /**
     *
     * 2022.8.15----不会----看了答案，懂了。
     * 2022.8.15-------------HouAlgorithm
     * dp[i][j]表示text1[0...i]与text2[0...j]之间的最长公共子序列
     *
     * if(text[i]==text[j])
     *      dp[i][j]=1+dp[i-1][j-1]
     * else
     *      dp[i][j]=max(dp[i-1][j],dp[i][j-i])
     *
     * return dp[最后一个][最后一个]
     * 2022.8.15------------HouAlgorithm
     *
     *
     */
    static class Solution1{
        public static int longestCommonSubsequence(String text1, String text2) {

            return 0;
        }
    }







}

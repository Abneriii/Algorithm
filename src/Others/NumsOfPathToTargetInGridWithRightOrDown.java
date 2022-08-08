package Others;

/**
 * Author:
 * Created at:2022/8/8
 * Updated at:
 *
 * 62. 不同路径
 *
 *
 *
 **/
public class NumsOfPathToTargetInGridWithRightOrDown {

    /**
     *
     *
     *
     *LC.62.不同路径
     *2022.3.22:Hou:看题解，懂了，自己代码实现了。
     */

    static class Solution {
        public int uniquePaths(int m, int n) {
            //dp[i][j]表示从(0,0)到(i,j)的总路径数
            int[][] dp=new int[m][n];
            for(int i=0;i<m;i++) dp[i][0]=1;
            for(int j=0;j<n;j++) dp[0][j]=1;
            for(int i=1;i<m;i++){
                for(int j=1;j<n;j++){
                    dp[i][j]=dp[i][j-1]+dp[i-1][j];
                }
            }
            return dp[m-1][n-1];
        }
    }




}

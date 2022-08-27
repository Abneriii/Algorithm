package Others;

import java.util.Arrays;

/**
 * Author:
 * Created at:2022/8/27
 * Updated at:
 *
 *
 * 455. 分发饼干
 *
 *
 **/
public class MaxAccountOfSatisfiedKidsByCookies {

    /**
     *
     * -------2022.8.27----------------HouAlgo--------实现了，通过了--执行用时：114 ms, 在所有 Java 提交中击败了5.16%的用户内存消耗：42.3 MB, 在所有 Java 提交中击败了63.64%的用户
     * sort(g)
     * sort(s)
     * 从后往前遍历g
     *    从后往前遍历s
     *       if s的这个元素大于等于g
     *            满足了一个孩子，并且标记s中的这个元素已经被用过
     *
     * return 孩子数量
     * -------2022.8.27----------------HouAlgo----------
     */

    static class Solution1 {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            boolean[] used=new boolean[s.length];
            int account=0;
            for(int i=g.length-1;i>=0;i--){
                for(int j=s.length-1;j>=0;j--){
                        if(s[j]>=g[i]&&!used[j]){
                            account++;
                            used[j]=true;
                            break;
                        }
                }
            }
            return account;
        }
    }
}

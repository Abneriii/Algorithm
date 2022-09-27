package Others;

/**
 * Author:
 * Created at:
 * Updated at:
 *
 * JZ62 孩子们的游戏(圆圈中最后剩下的数)------
 *
 * 2022.9.4----题解方法不懂
 *
 *
 *
 **/
public class LastOneOfCountOffAndOut {




    /**
     *
     *
     * 2022/9/1------HouAlgo：模拟。算法应该没错，小的测试样例正确通过。此算法时间复杂度高，未通过力扣----------------------
     *
     * int[] out={0};
     * n个数,m为报数点
     * 从0处开始，向后移动m次
     * int left=n;
     * j=0;
     * int needCountOff=m;
     * while(left!=1)
     *     while(needCountOff!=0)
     *        if out[j]==0
     *            needCountOff--
     *        if needCountOff==0 out[j]=0;
     *        j++
     *        j=j%n
     *     left--;
     *     needCountOff=m;
     *     while(out[j]==0)
     *           j=(j+1)%n
     * 遍历找到out[]数组中等于0的数字
     * -----------------------------------------
     *
     *
     *
     *
     */
    static  class Solution1{
        public static void main(String[] args) {
            System.out.println(lastRemaining(10,17));
        }
        public static  int lastRemaining(int n, int m) {
                int[] out=new int[n];
            for (int i = 0; i < n; i++) {
                out[i]=0;
            }
                int left=n;
                int j=0;
                int needCountOff=m;
                while(left!=1){
                    while(needCountOff!=0){
                        if(out[j]==0){
                            needCountOff--;
                        }
                        if(needCountOff==0) out[j]=1;
                        j++;
                        j=j%n;
                    }
                    left--;
                    needCountOff=m;
                    while(out[j]!=0){
                        j=(j+1)%n;
                    }

                }
            for (int i = 0; i <n ; i++) {
                if(out[i]==0) return i;
            }
            return 0;

        }

    }

}

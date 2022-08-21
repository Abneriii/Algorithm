package RealProblems.KeDaXunFei;

/**
 * Author:
 * Created at:2022/8/20
 * Updated at:
 **/
public class Solution1 {

    public static void main(String[] args) {
       System.out.println(seqSum(3));

    }

    public static float seqSum (int n) {
        // write code here
        double fenzi=1;
        double fenmu=2;
        double result=0;
        for(int i=1;i<=n;i++){
            double this1=fenzi/fenmu;
            result+=this1;
            System.out.println(result);
            double yuan=fenzi;
            fenzi=fenmu;
            fenmu=yuan+fenmu;

        }
        return Float.valueOf(String.format("%.2f",result));
    }
}

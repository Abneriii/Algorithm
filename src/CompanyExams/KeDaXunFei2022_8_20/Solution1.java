package CompanyExams.KeDaXunFei2022_8_20;

/**
 * Author:
 * Created at:2022/8/20
 * Updated at:
 *
 *
 * 2022.8.20-----算法思路正确，通过86%，应该是些个别测试样例。
 *
 *
 **/
public class Solution1 {

    public static void main(String[] args) {

        System.out.println(seqSum(3));

    }


    public static float seqSum (int n) {
        float fenzi=1;
        float fenmu=2;
        float result=0;
        for(int i=1;i<=n;i++){
            result+=fenzi/fenmu;
            float yuan=fenzi;
            fenzi=fenmu;
            fenmu=yuan+fenmu;

        }
        return Float.valueOf(String.format("%.2f",result));
    }



}

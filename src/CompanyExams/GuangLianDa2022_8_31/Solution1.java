package CompanyExams.GuangLianDa2022_8_31;

import java.util.Scanner;

/**
 * Author:
 * Created at:2022/8/31
 * Updated at:
 **/
public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] nums=new int[n];
        int[] reach=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            reach[i]=scanner.nextInt();
        }
        int result=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i]==reach[j]){
                    if(j<=i){
                        result++;
                    }

                }
            }
        }
        System.out.println(result);
    }
}

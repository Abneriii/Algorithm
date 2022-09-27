package CompanyExams.ZX;

import java.util.Scanner;

/**
 * Author:
 * Created at:2022/9/8
 * Updated at:
 **/
public class Solution1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input=in.nextLine();
        String[] inputNum=input.split(" ");
        int[] nums=new int[inputNum.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=Integer.parseInt(inputNum[i]);
        }
        if(nums.length==1){
            System.out.println("ih");
        }
        else if(nums.length==2){
            System.out.println("ji");
        }
       int[] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=nums[1];
        for(int i=2;i<nums.length;i++){
            dp[i]=dp[i-2]+nums[i];
        }
        int maxInt=0;
        for (int i = 0; i <nums.length ; i++) {
            if(dp[maxInt]<dp[i]){
                maxInt=i;
            }
        }
        System.out.println(dp[maxInt]);
    }
}

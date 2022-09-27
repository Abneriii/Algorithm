package CompanyExams.THS;

/**
 * Author:
 * Created at:2022/9/5
 * Updated at:
 **/
public class Solution29 {
    public static void main(String[] args) {
        int[] nums=new int[]{1,0,2,3,4,0,2,0,2};
        int right=nums.length-1;
        int left=0;
        while(left<right){
            while(nums[left]!=0&&left<right){
                left++;
            }
            while(nums[right]==0&&right>left){
                right--;
            }
            if(left<right){
                int help=nums[left];
                nums[left]=nums[right];
                nums[right]=help;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}

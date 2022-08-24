package CompanyExams.KeDaXunFei2022_8_20;

/**
 * Author:
 * Created at:2022/8/20
 * Updated at:
 *
 *
 *
 * 2022.8.20----AC。
 **/
public class Solution2 {
    public static void main(String[] args) {
        System.out.println(signalVerify("v=0"));
    }
    public static boolean signalVerify (String signal) {
        // write code here
        String[] value=signal.split("=");
        if(value.length!=2){
            return false;
        }
        char[] leftValue=value[0].toCharArray();
        char[] rightValue=value[1].toCharArray();
        boolean leftBoolean=false;
        boolean rightBoolean=false;
        if(leftValue.length==1&&leftValue[0]>='a'&&leftValue[0]<='z'){
            leftBoolean=true;
        }
        if(rightValue[0]==' ') return false;
        for(char c:rightValue){
            if(((c>='a'&&c<='z')||(c>='0'&&c<='9')||c==' ')){
                rightBoolean=true;
            }
            else{
                return false;
            }

        }
        return leftBoolean&&rightBoolean;
    }
}

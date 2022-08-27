package CompanyExams.RongYao2022_8_25;

import java.util.Scanner;

/**
 * Author:
 * Created at:2022/8/25
 * Updated at:
 **/
public class Solution1 {
    /**
     *
     *
     */
    static class Solution11{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();
            scanner.nextLine();
            String strings=scanner.nextLine();
            char[] stringsChar=strings.toCharArray();
            for(int i=0;i<n;i++){
                if(stringsChar[i*8+i]=='0'){
                    sortByLittleEndian(stringsChar,i*8+i+1);
                }
                else {
                    sortByBigEndian(stringsChar,i*8+i+1);
                }
            }
        }

        public static void sortByLittleEndian(char[] stringsChar,int start){
            int end=start+7;
            for(int i=start;i<end;i++){
                int biggestIndex=i;
                for(int j=i+1;j<=end;j++){
                    if(stringsChar[j]>stringsChar[biggestIndex]){
                        biggestIndex=j;
                    }
                }
                char help=stringsChar[i];
                stringsChar[i]=stringsChar[biggestIndex];
                stringsChar[biggestIndex]=help;

            }
            for (int i = start; i <=end ; i++) {
                System.out.print(stringsChar[i]);

            }
            System.out.print(" ");
        }
        public static void sortByBigEndian(char[] stringsChar,int start){
            int end=start+7;
            for(int i=start;i<end;i++){
                int smallestIndex=i;
                for(int j=i+1;j<=end;j++){
                    if(stringsChar[j]<stringsChar[smallestIndex]){
                        smallestIndex=j;
                    }
                }
                char help=stringsChar[i];
                stringsChar[i]=stringsChar[smallestIndex];
                stringsChar[smallestIndex]=help;
            }
            for (int i = start; i <=end ; i++) {
                System.out.print(stringsChar[i]);
            }
            System.out.print(" ");
        }


    }
}

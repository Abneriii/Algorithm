package CompanyExams.TW;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:
 * Created at:2022/9/3
 * Updated at:
 **/
public class Solution1 {
    public static void main(String[] args) {
        List<Integer> array=new ArrayList<>();
        array.add(0,1);
        array.add(1,2);
        array.add(2,3);
        array.add(3,4);
        array.add(4,5);
        array.add(5,6);
        for (int i = 0; i < array.size()-1; i+=2) {
            int help;
            help=array.get(i);
            array.set(i,array.get(i+1));
            array.set(i+1,help);
        }
        for (int i = 0; i <array.size() ; i++) {
            System.out.println(array.get(i));
        }

    }
}

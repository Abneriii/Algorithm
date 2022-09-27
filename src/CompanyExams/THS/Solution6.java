package CompanyExams.THS;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:
 * Created at:2022/9/5
 * Updated at:
 **/
public class Solution6 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("null");
        list.add("ths");
        list.add("null");
        for(String str:list){
            if("null".equals(str))
                list.remove(str);
        }
        System.out.println(list.get(0));
    }
}

package CompanyExams.TW;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:
 * Created at:2022/9/3
 * Updated at:
 **/
public class Solution2 {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        list1.add("long lasting battery");
        list1.add("clear display");
        list1.add("great camera");
        list1.add("storage space");
        list2.add("clear display");
        list2.add("long lasting battery");
        list2.add("great camera");
        list2.add(" warp-speed word processing");






    }
    public static List<String> findComplement(List<String> PhoneAFeatures, List<String> PhoneBFeatures) {
        List<String> result=new ArrayList<String>();
        for (int i = 0; i < PhoneBFeatures.size(); i++) {
            boolean has=false;
            for (int j = 0; j < PhoneAFeatures.size(); j++) {
                if(PhoneBFeatures.get(i).equals(PhoneAFeatures.get(i))){
                    has=true;
                    continue;
                }
            }
            if(!has){
                result.add(PhoneBFeatures.get(i));
            }
        }
        return result;

    }
}

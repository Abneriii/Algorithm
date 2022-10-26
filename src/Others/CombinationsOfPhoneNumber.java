package Others;

import com.sun.jmx.snmp.SnmpUnknownMsgProcModelException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author:
 * Created at:2022/10/26
 * Updated at:
 *
 * LC.17. 电话号码的字母组合
 **/
public class CombinationsOfPhoneNumber {

    /**
     *
     * 2022.10.26--------通过、
     *List result;
     *fun2(digits,0,'');
     *
     * fun2(String digits,int index,String combination)
     *     if index==digits.length
     *           result.add(combination)
     *           return;
     *     for 遍历以index为键的hashmap的值
     *          combination+=digits.charAt(index)
     *          fun2(digits,index+1,combination)
     *          combination删去最后一个元素
     *
     *
     *
     */
    static class Solution {
        static List<String> result= new ArrayList<>();
        public  static List<String> letterCombinations(String digits) {
            if(digits.length()==0){
                return new ArrayList<String>();
            }
            Map<Character,String> numToLetter=new HashMap<>();
            numToLetter.put('2',"abc");
            numToLetter.put('3',"def");
            numToLetter.put('4',"ghi");
            numToLetter.put('5',"jkl");
            numToLetter.put('6',"mno");
            numToLetter.put('7',"pqrs");
            numToLetter.put('8',"tuv");
            numToLetter.put('9',"wxyz");
            combination(digits,0,"",numToLetter);
            return result;

        }
        public  static void combination(String digits,int index,String combination,Map numToLetter){
            if(index==digits.length()){
                result.add(new String(combination));
                return;
            }
            String indexToLetter=(String)numToLetter.get(digits.charAt(index));
            for(int i=0;i<indexToLetter.length();i++){
                combination+=indexToLetter.charAt(i);
                combination(digits,index+1,combination,numToLetter);
                combination=combination.substring(0,combination.length()-1);
            }
        }

        public static void main(String[] args) {

            letterCombinations("23");
            //letterCombinations("");
            System.out.println("result");
        }

    }


}

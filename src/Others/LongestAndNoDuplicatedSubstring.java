package Others;

import java.util.HashSet;
import java.util.Set;

/**
 * Author:
 * Created at:2022/8/16
 * Updated at:
 *
 * 3. 无重复字符的最长子串
 *
 *
 **/
public class LongestAndNoDuplicatedSubstring {
    /**
     *
     * 2022.8.16---------HouAlgorithm---------------已实现+已通过+待优化
     * for cha=s[0] to s
     *   new hashset
     *   hashset.put(cha)
     *   for  cha2=cha.next to s
     *      if(!hashset.contains(cha2))
     *          hashsset.put(cha2)
     *          length++
     *      else
     *          longestSubstring=max(length,longestSubstring)
     *          length=0
     *2022.8.16--------------HouAlgorithm----------
     */
    static class Solution1{
        public static void main(String[] args) {
            System.out.println(lengthOfLongestSubstring(" "));
        }

        public  static int lengthOfLongestSubstring(String s) {
            if(s.length()==0){
                return 0;
            }
            char[] arrays=s.toCharArray();
            int result=0;
            for(int i=0;i<arrays.length;i++){
                Set<Character> hashset=new HashSet<>();
                hashset.add(arrays[i]);
                int length=1;
                for(int j=i+1;j<arrays.length;j++){
                    if(!hashset.contains(arrays[j])){
                        hashset.add(arrays[j]);
                        length++;
                    }
                    else{
                        result=Math.max(length,result);
                        break;

                    }
                    result=Math.max(length,result);
                }
                result=Math.max(length,result);
            }
            return result;
        }
    }





}

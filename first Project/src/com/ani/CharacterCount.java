package com.ani;
import com.ani.RemoveN;
import java.util.Collection;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharacterCount {
    
    public String countChars(String ip) {
     Map<Character, Integer> map = new HashMap<>();

        for(int i = 0 ; i < ip.length(); i++) {
            char ch = ip.charAt(i);
            if(map.containsKey(ch)) {
                int cnt = map.get(ch);
                map.put(ch, cnt + 1);
            }else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);

        StringBuilder sb = new StringBuilder();
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();

        for(Map.Entry<Character, Integer> entry : entries) {
            sb.append(entry.getKey())
              .append(entry.getValue())
              .append(",");
        }
        return sb.replace(sb.length()-1, sb.length(), "").toString();
    }
}



    // public class CharacterCount {
    
    //     public String countChars(String ip) {
    //         char charcurr;
    //         int freq=0;
    //         StringBuilder sb = new StringBuilder();
    //         StringBuilder newstr = new StringBuilder(ip);
            
    //         for (int i=0;i<newstr.length();i++){
    //             charcurr = newstr.charAt(i);{
    //                 for (int j=i;j<newstr.length();j++){
    //                     if (newstr.charAt(j)==charcurr){
    //                         freq++;
                            
                            
    //                     }


    //                 }
    //                 for (int k=0;k<newstr.length();k++){
    //                     if (newstr.charAt(k)== charcurr){
    //                         sb.deleteCharAt(k);
    //                     }
    //                 }
                    
    //                 sb.append(charcurr);
    //                 sb.append(freq);
    //                 if (i!=(ip.length()-1))
    //                 {sb.append(",");}
    //                 freq = 0;
    //                 // RemoveN(ip,charcurr,i);
    //             }

    //         }
 
    //         return sb.toString();
    //     }
    // }
    


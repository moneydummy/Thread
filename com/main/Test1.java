package com.main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Test1 {
     public static void main(String[] args) {
            //abcabcd
           Map<String,Integer> m =  new HashMap<String,Integer>();
                m.put("a", 1);
                m.put("b", 4);
                m.put("c", 123);

               
                for (Entry <String,Integer>entry : m.entrySet()) {
           //             System.out.println(entry.getKey() + "/" + entry.getValue());
                }
                for( String key : m.keySet()){
           //             System.out.println(key+"--"+m.get(key));
                }
               String a= m.entrySet().stream().filter(x->x.getValue()==123).findFirst().get().getKey();

        //        System.out.println(a);

        //        List<String> sL= Arrays.asList("abcabcda");

        //      //  sL.stream().collect(Collectors.groupingBy(i::li),Collectors.counting());
                String s ="abcabcda";
               Map<Character, Integer> countM = new HashMap<Character, Integer>();
               for(int i=0;i<s.length();i++){
                       int count =0;
                       for(int j=0;j<s.length();j++){
                        String s1 = String.valueOf(s.charAt(i));
                        if(s.charAt(i) == s.charAt(j)){
                                countM.put(s.charAt(i), ++count);
                        }
                }
                        
               }
               int[] art= {1,2,3,};


               System.out.println("------");
            //   countM.entrySet().forEach(System.out ::println);

               int[] ar ={0};
               System.out.println(findMaxConsecutiveOnes(ar));
     }   

     public static int findMaxConsecutiveOnes(int[] nums) {
        int totalCapacity = 0;
        int num = 0;
        int maxOccur =Integer.MIN_VALUE;
        if(nums.length>2){
             for (int i = 0, len = nums.length; i < len; i++) {
                  if (num == nums[i]) {
                       ++totalCapacity;
                  } else {
                       maxOccur = Math.max(maxOccur, totalCapacity);
                       num = nums[i];
                       totalCapacity = 1;
                  }
             }
        }
        
        return Math.max(maxOccur, totalCapacity);
     }
     
}

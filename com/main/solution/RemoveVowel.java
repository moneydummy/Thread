package com.main.solution;

import java.util.Arrays;
import java.util.List;

public class RemoveVowel {

       
        public static String vowel(String msg) {
         Character [] vowelChar= {'a','e','i','o','u'};
        List<Character> voweArr = Arrays.asList(vowelChar);
                StringBuilder finalMsg =new StringBuilder(msg);
                for(int i=0;i< finalMsg.length();i++){
                        if(voweArr.contains(finalMsg.charAt(i))){
                                finalMsg.replace(i, i+1, "");
                                i--;
                        }
                }
                return finalMsg.toString();
        }

        public static String vowel2(String msg){
                return msg.replaceAll("[aeiouAEIOU]", "");
        }
        
        public static void main(String[] args) {
                System.out.println("---------");
                System.out.println(vowel2("welcome to geeksforgeeks"));
                System.out.println("---------");
              System.out.println(  new IpAddresValidation().defangIPaddr("255.100.50.0"));
        }
}

class IpAddresValidation{
        
        public String defangIPaddr(String address) {
                StringBuffer sb = new StringBuffer(address);
                final char dot ='.';
                for (int i = 0; i < sb.length(); i++) {
                        if (dot == (sb.charAt(i))) {
                                sb.replace(i, i + 1, "[.]");
                               i=i+2;
                        }
                }
                return sb.toString();
        }
}

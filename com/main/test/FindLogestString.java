package com.main.test;

public class FindLogestString {
        public static void main(String[] args) {
               // lengthOfLongestSubstring("ggububgvfk");

               String s = "ABC";
               String a = s;
               System.out.println(s + "------"+a);
               s ="abc";
               System.out.println(s + "------" + a);
               System.out.println(isPalindrome(-121));
                reverse(-321);
        }

        public static void reverse(int x) {
                String temp = String.valueOf(x);

                StringBuilder rsb = new StringBuilder(temp);
                rsb.reverse();
                System.out.println(new Integer(rsb.toString()));
        }

        public static  boolean isPalindrome(int x) {
                String temp = String.valueOf(x);
                System.out.println(temp);
                StringBuilder sb = new StringBuilder(temp);
                StringBuilder rsb = new StringBuilder(temp);
                rsb.reverse();
              
                return sb.toString().equals(rsb.toString()) ? true : false;
        }
        public static void lengthOfLongestSubstring(String s) {
        int result =0;
        boolean isMatched = false;
        StringBuilder sb = new StringBuilder();
        StringBuilder tsb = new StringBuilder();
        for(int i=0;i<s.length();i++){
                String temp = String.valueOf(s.charAt(i));
            if(sb.indexOf( temp) == -1 && !isMatched){
                    sb.append(s.charAt(i));
                isMatched = false;
                result = Math.max(result, sb.length());
               
            }
            else{
                     if(sb.lastIndexOf(temp) == 0){
                             sb.deleteCharAt(0);
                             sb.append(temp);
                     }else{
                             sb.delete(0, sb.lastIndexOf(temp)-1);
                             
                     }
                   
                   // sb.append(temp);

            }  
            result = Math.max(result, sb.length());
            
           
                
        }
        System.out.println(result);
    }
}


/*/**
 * InnerFindLogestString
 */
 class InnerFindLogestString {
        public static void lengthOfLongestSubstring(String s) {

                int n = s.length();

                int res = 0;
                for (int i = 0; i < n; i++) {
                        for (int j = i; j < n; j++) {
                                if (checkRepetition(s, i, j)) {
                                        res = Math.max(res, j - i + 1);
                                }
                        }
                }
                System.out.println(res);

        }

        private static boolean checkRepetition(String s, int start, int end) {
                int[] chars = new int[128];

                for (int i = start; i <= end; i++) {
                        char c = s.charAt(i);
                        chars[c]++;
                        if (chars[c] > 1) {
                                return false;
                        }
                }

                return true;
        }
        
}
 package com.main.test;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

        public static void main(String[] args) {
                int[] my_array =  {1,3,5,6};
             //   my_array.length
               int a=  search(my_array, 9);
               System.out.println(a);
               System.out.println(a < 0 ? -1 : a);
               Sum();
               searchInsert(my_array, 7);
        }

        private static void Sum() {
                String a ="abcdef";
                var x =  Arrays.asList(a).stream().collect(Collectors.toList());
                System.out.println(x);
                System.out.println(x);
               // list.stream().
        }

        public static int searchInsert(int[] nums, int target) {
                int pos = Arrays.binarySearch(nums, target);

                pos =  pos < 0 ? pos - (pos*2 - 1) : pos;
                return pos;
        }
        //-5 ->4
        //

        public static  int search(int[] nums, int target) {
        return Arrays.binarySearch(nums, target);

       
                      
       
    }
}
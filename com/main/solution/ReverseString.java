package com.main.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ReverseString {
        public static void main(String[] args) {
               System.out.println("first main");
               double a= 22.9;
               System.out.println(a);
               System.out.println(Math.round(a));
               List<String> a1 = Arrays.asList("Germany","England","China","Denmark","Brazil","France","Australia");
             Optional<String> c =   a1.stream().reduce((c1,c2)->c1.length() > c2.length() ?c1 : c2);
             c.ifPresent(System.out::println);
        }
        
}

class A{
        private void f(){
                System.out.println("A");
        }
}
class B extends A{
        public void f() {
                System.out.println("B");
        }
}

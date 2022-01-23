package com.main.solution;

public class solution1 {
        public int thirdMax(int[] arr) {
                int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
                boolean exists_min = false;
                final int arr_size = arr.length;
                for (int i = 0; i < arr_size; i++) {
                        int num = arr[i];
                        if (num == Integer.MIN_VALUE)
                                exists_min = true;
                        if (num == max1 || num == max2 || num <= max3)
                                continue;
                        if (num > max1) {
                                max3 = max2;
                                max2 = max1;
                                max1 = num;
                        } else if (num > max2) {
                                max3 = max2;
                                max2 = num;
                        } else {
                                max3 = num;
                        }
                }
                if (max2 == Integer.MIN_VALUE || max3 == Integer.MIN_VALUE && !exists_min)
                        return max1;
                return max3;
        }

        public static void main(String[] args) {
                int ar[] = new int[]{1,6};
                System.out.println(new solution1().thirdMax(ar));
        }
}

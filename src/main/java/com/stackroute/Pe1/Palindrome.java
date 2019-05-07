package com.stackroute.Pe1;

public class Palindrome {
        public static int findPalindrome(int num) {
            int sum = 0, rem = 0, temp, sum1 = 0, output;

            temp = num;
            while (num > 0) {
                rem = num % 10;
                sum = (sum * 10) + rem;
                num = num / 10;
                if (rem % 2 == 0) {
                    sum1 = sum1 + rem;

                }
            }
            if (temp == sum) {
                System.out.println("given input is a palindrome");
                if (sum1 > 25) {
                    System.out.println("and sum of the numbers are greater than 25");
                    output = 1;

                } else {
                    System.out.println("and sum of the numbers are not greater than 25");
                    output = 2;


                }

            } else {
                System.out.println("not a palindrome");
                output = 3;
            }
            return output;
        }
    }


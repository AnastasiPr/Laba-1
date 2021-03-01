package com.company;
import java.util.Scanner;

public class Palindrome {

    public static String reverseString(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return reverse;
    }

    public static boolean isPalindrome(String s) {
        String reverse = reverseString(s);
        return reverse.equals(s);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        if (s.indexOf(" ") >= 0) {
            String[] mass = s.split(" ");
            for (int i = 0; i < mass.length; i++) {
                if (isPalindrome(mass[i])) { //когда true
                    System.out.println(mass[i] + "-палиндром");
                } else {
                    System.out.println(mass[i] + "-не палиндром");
                }
            }
        } else {
            if (isPalindrome(s)) {
                System.out.println(s + "- палиндром");
            } else {
                System.out.println(s + "- не палиндром");
            }

        }
    }
}


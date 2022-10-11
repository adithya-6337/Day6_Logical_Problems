package com.bridgelabz;

public class Polindrome {
    public static void main(String[] args) {
        String x = "abcba";
        int i = 0, j = x.length() - 1;
        while (i < j) {
            if (x.charAt(i) != x.charAt(j)) {
                System.out.println(x + " : Is Not a palindrome ");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println(x + " : Is a Palindrome");
    }
}

package org.example;

import java.util.Scanner;

/** Напишите метод, который принимает на вход строку (String)
 * и определяет является ли строка палиндромом (возвращает boolean значение).
 */
public class Task01 {


    public static <Arr> void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s=scan.next();
        isPalindrome(s);
    }

    private static String reverseString(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; --i)
            r += s.charAt(i);
        return r;
    }

    private static void isPalindrome(String s) {
        if(s.equals(reverseString(s))){
            System.out.println("Полиндром");
        }else{
            System.out.println("Не полиндром");
        }
        reverseString(s);

    }

}

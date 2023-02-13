package Homework_2;

/*1.
 * Напишите метод, который принимает на вход строку (String)
 * и определяет является ли строка палиндромом (возвращает boolean значение).
 */

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String string = in.next();
        System.out.println(isPalindrom(string));
        in.close();
    }

    private static boolean isPalindrom(String string){
        return string.equals((new StringBuilder(string)).reverse().toString());

    }
}
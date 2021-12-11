package com.company;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String args[]) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите пятизначное число: ");
        String str=input.nextLine();
        if(str.length()!=5) {
            System.out.println("Число не является пятизначным");
            return ;
        }
        for(int i=0;i<2;i++)
            if(str.charAt(i)!=str.charAt(4-i)) {
                System.out.println("Не является полиндромом ");
                return;
            }
        System.out.println("Полиндром");
    }
}

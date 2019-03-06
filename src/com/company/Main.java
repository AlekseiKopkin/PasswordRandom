package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите длину = ");
        Scanner in=new Scanner(System.in);
        int length=in.nextInt();//длина пароля
        char[] a = {'a','c','d','f','y','1','2','3','4','5','6','7','8','9'};
        char[] s=new char[length];
        Random generator = new Random();
        String newString = ""; //contains the extracted letters
        for (int i = 0; i < length; i++) {
            int randomIndex = generator.nextInt(a.length);
            newString=newString+a[randomIndex];
        }
        System.out.print("Пароль = ");
        System.out.println(newString);
    }
}